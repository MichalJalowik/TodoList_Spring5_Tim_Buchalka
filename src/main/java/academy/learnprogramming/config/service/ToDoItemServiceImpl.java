package academy.learnprogramming.config.service;

import academy.learnprogramming.config.model.ToDoData;
import academy.learnprogramming.config.model.ToDoItem;
import lombok.Getter;
import org.springframework.stereotype.Service;

@Service
public class ToDoItemServiceImpl implements ToDoItemService {

    //@Getter(not working with intefcace not know why)
    private final ToDoData toDoData= new ToDoData();

    @Override
    public void addItem(ToDoItem toDoItem) {
        toDoData.addItem(toDoItem);
    }

    @Override
    public void removeItem(int id) {
        toDoData.removeItem(id);
    }

    @Override
    public ToDoItem getItem(int id) {
        return toDoData.getItem(id);
    }

    @Override
    public void updateItem(ToDoItem toDoItem) {
        toDoData.updateItem(toDoItem);
    }

    @Override
    public ToDoData getData() {
        return toDoData;
    }

}
