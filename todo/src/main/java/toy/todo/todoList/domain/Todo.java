package toy.todo.todoList.domain;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import toy.todo.common.domain.BaseEntity;

@Entity
@Table(name="TODO")
@NoArgsConstructor
public class Todo extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long todoSeq;

    @ManyToOne
    @JoinColumn(name = "todo_date_seq")
    private TodoDate todoDate;

    @Column(name = "completed_yn", nullable = false)
    private String content;

    @Column(name = "completed_yn", nullable = false)
    private String completedYn;

    @Column(name = "del_yn", nullable = false)
    private String delYn;


}
