package academy.learnprogramming.config.model;

import lombok.NonNull;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ToDoData {

    private static int idValue = 1;
    private final List<ToDoItem> items = new ArrayList<>();

    public ToDoData(){

        addItem(new ToDoItem("1first", "first Details", LocalDate.now()));
        addItem(new ToDoItem("2second", "sec Details", LocalDate.now()));
        addItem(new ToDoItem("3third", "third Details", LocalDate.now()));
        addItem(new ToDoItem("4th", "4th Details", LocalDate.now()));
    }

    //no database thats why below
    public List<ToDoItem> getItems(){
        return Collections.unmodifiableList(items);
    }

    public void addItem(@NonNull ToDoItem toAdd){
//        if(toAdd == null){
//            throw new NullPointerException("toAdd is req paramrter");
//        }
        toAdd.setId(idValue);
        items.add(toAdd);
        idValue++;
    }

    public void removeItem(int id){
        ListIterator<ToDoItem> itemIterator = items.listIterator();

        while(itemIterator.hasNext()){
            ToDoItem item = itemIterator.next();

            if(item.getId() == id){
                itemIterator.remove();
                break;
            }
        }
    }

    public ToDoItem getItem(int id){
        for(ToDoItem item: items){
            if(item.getId() == id){
                return item;
            }
        }
        return null;
    }

    public void updateItem(@NonNull ToDoItem toUpdate){
        ListIterator<ToDoItem> itemIterator = items.listIterator();

        while(itemIterator.hasNext()){
            ToDoItem item = itemIterator.next();

            if(item.equals(toUpdate)){
                itemIterator.set(toUpdate);
                break;
            }
        }
    }



}
