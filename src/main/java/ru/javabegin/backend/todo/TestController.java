package ru.javabegin.backend.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

// controller - это спец. бин, который обрабатывает веб запросы
@RestController
public class TestController {

    @Autowired
    DbService dbservice = new DbService();

    @GetMapping("/test2")
    public String test2() {
        dbservice.updateEpisodesAttrs("String email", "4");

        return "test work2";
    }

    @GetMapping("/test3")
    public String test3() {
        return "test work3";
    }

    @PostMapping("/user")
    public String user() {
        return "test work";
    }
}
