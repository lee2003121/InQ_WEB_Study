package ch02.ch02_220925.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("hello")
    public  String hello(Model model)
    {
        model.addAttribute("data","hello!!");
        return "hello";
    };
}
