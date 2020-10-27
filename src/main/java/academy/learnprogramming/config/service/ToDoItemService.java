package academy.learnprogramming.config.service;

import academy.learnprogramming.config.model.ToDoData;
import academy.learnprogramming.config.model.ToDoItem;

public interface ToDoItemService {

    void addItem(ToDoItem toDoItem);
    void removeItem(int id);
    ToDoItem getItem(int id);
    void updateItem(ToDoItem toDoItem);
    ToDoData getData();

}
