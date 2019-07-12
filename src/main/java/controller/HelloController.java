package controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    Integer i=0;

    @RequestMapping("/hello/")
    public String index() {
        System.out.println("request-----"+i++);

        return "Greetings from Spring Boot!"+i;
    }

}