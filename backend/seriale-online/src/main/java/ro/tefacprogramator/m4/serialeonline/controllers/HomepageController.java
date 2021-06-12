package ro.tefacprogramator.m4.serialeonline.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomepageController {
    
    @GetMapping("/")
    public String homepage() {
        return "Hello there";
    }


}
