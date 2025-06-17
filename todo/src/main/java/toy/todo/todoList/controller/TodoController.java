package toy.todo.todoList.controller;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;
import toy.todo.todoList.service.TodoService;

@Controller
@NoArgsConstructor
public class TodoController {

    private final TodoService todoService;
}
