package com.vodapally.aws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aws")
public class AWSECRController {
    @GetMapping("/hello")
    public String message(){
        String msg = "Hello! Raghavender Vodapally!! Welcome to AWS world!!"
                        +"\n Congratulations on my first AWS ECR CI CD project.";

        return msg;
    }
}
