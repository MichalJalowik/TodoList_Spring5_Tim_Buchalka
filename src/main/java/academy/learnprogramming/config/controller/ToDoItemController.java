package academy.learnprogramming.config.controller;

import academy.learnprogramming.config.model.ToDoData;
import academy.learnprogramming.config.model.ToDoItem;
import academy.learnprogramming.config.service.ToDoItemService;
import academy.learnprogramming.config.util.AtributesNames;
import academy.learnprogramming.config.util.Mappings;
import academy.learnprogramming.config.util.ViewNames;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.time.LocalDate;

@Slf4j
@Controller
public class ToDoItemController {

    private final ToDoItemService toDoItemService;

    @Autowired
    public ToDoItemController(ToDoItemService toDoItemService) {
        this.toDoItemService = toDoItemService;
    }

    @ModelAttribute
    public ToDoData toDoData(){
        return toDoItemService.getData();
    }

    @GetMapping(Mappings.ITEMS)
    public String items(){
        return ViewNames.ITEMS_LIST;
    }

    @GetMapping(Mappings.ADD_ITEM)
    public String addEditItem(@RequestParam(required = false, defaultValue = "-1") int id, Model model){
        log.info("editing id = {}", id);
        ToDoItem toDoItem = toDoItemService.getItem(id);

        if(toDoItem == null){
            toDoItem = new ToDoItem("","", LocalDate.now());
        }

        model.addAttribute(AtributesNames.TODO_ITEM,toDoItem);
        return ViewNames.ADD_ITEM;
    }

    @PostMapping(Mappings.ADD_ITEM)
    public String processItem(@ModelAttribute(AtributesNames.TODO_ITEM) ToDoItem toDoItem){
        log.info("todoItem from from = {}", toDoItem);

        if(toDoItem.getId() == 0){
            toDoItemService.addItem(toDoItem);
        } else{
            toDoItemService.updateItem(toDoItem);
        }

        return "redirect:/" + Mappings.ITEMS;
    }

    @GetMapping(Mappings.DELETE_ITEM)
    public String deleteItem(@RequestParam int id){
        toDoItemService.removeItem(id);
        return "redirect:/" + Mappings.ITEMS;
    }

    @GetMapping(Mappings.VIEW_ITEM)
    public String viewItem(@RequestParam int id, Model model){
        ToDoItem toDoItem = toDoItemService.getItem(id);
        model.addAttribute(AtributesNames.TODO_ITEM,toDoItem);
        return ViewNames.VIEW_ITEM;
    }


  


}
