package com.project.CloudB;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CloudBController {

    @GetMapping("/")
    public String cloudB()
    {
        return "Hello V  ";
    }
}
