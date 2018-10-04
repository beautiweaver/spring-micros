package demo.micro.spring.service.feign.service;

import org.springframework.stereotype.Component;

@Component
public class GreetFallbackService implements GreetService {
    @Override
    public String hello(String name) {
        return "Hi " + name + ", error occurs.";
    }
}
