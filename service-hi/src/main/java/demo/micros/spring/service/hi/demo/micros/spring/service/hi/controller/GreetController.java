package demo.micros.spring.service.hi.demo.micros.spring.service.hi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    @GetMapping(value = "/hello")
    public String hello(@RequestParam(value="name") String name) {
        return "hi " + name;
    }
}
