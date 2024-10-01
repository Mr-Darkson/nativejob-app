package me.darkson.userservice.contoller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController {
    @Value("${tmpVar}")
    private String answer;

    @GetMapping("/test")
    public String test() {
        return answer;
    }
}
