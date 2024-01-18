package com.krishna.krishnajenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/name")
    public String getName()
    {
        return "Hi , i am krishna asjkdnkad";
    }
}
