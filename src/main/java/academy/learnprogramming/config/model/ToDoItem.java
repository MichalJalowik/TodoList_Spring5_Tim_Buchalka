package academy.learnprogramming.config.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;
import java.util.Objects;

@Data
@EqualsAndHashCode(of = "id")
public class ToDoItem {

    private int id;
    private String title;
    private String details;
    private LocalDate deadline;

    public ToDoItem(String title, String details, LocalDate deadline) {
        this.title = title;
        this.details = details;
        this.deadline = deadline;
    }

}
