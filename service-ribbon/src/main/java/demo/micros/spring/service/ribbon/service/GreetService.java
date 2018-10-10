package demo.micros.spring.service.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GreetService {

    @Autowired
    private RestTemplate restClient;

    @HystrixCommand(fallbackMethod = "helloFallback")
    public String hello(String name) {
        return restClient.getForObject("http://HI-SERVICE/hello?name=" + name, String.class);
    }

    public String helloFallback(String name) {
        return "Hi " + name + ", error occurs.";
    }
}
