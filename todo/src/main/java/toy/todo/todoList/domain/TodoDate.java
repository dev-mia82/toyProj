package toy.todo.todoList.domain;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import toy.todo.common.domain.BaseEntity;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "todo_date")
@NoArgsConstructor
public class TodoDate extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long todoDaySeq;

    @Column(name = "user_seq")
    private Long userSeq;

    @Column(name = "todo_date")
    private LocalDate todoDate;

    @OneToMany(mappedBy = "todoDate")
    private List<Todo> todoList;

}
