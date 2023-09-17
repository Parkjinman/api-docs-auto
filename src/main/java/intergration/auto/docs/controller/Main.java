package intergration.auto.docs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Main {
    @GetMapping("/hello-world")
    public String helloWorld() {

        return "hello-world";
    }
}
