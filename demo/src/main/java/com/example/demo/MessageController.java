package com.example.demo;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/")
public class MessageController {
    private final Environment env;

    MessageController(Environment env) {
        this.env = env;
    }

    @GetMapping
    public String show() {
        return "<h1>Esta es mi api. Esta funcionando en el puerto: " + env.getProperty("local.server.port")+"</h1>";
    }
}
