package com.quiz.alpha.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeRestController {

    @RequestMapping(value = "/home")
    public String home() {
        return "index.html";
    }

}
