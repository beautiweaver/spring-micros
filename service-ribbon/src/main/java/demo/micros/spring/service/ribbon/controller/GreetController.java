package demo.micros.spring.service.ribbon.controller;

import demo.micros.spring.service.ribbon.service.GreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    @Autowired
    private GreetService greetService;

    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name") String name){
        return greetService.hello(name);
    }
}
