package com.ironbank.ironbankexceptionregistry.controllers;

import com.ironbank.ironbankexceptionregistry.ExceptionModel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exceptionhandler/")
public class ExceptionRegistryController {

    @PostMapping("save")
    public String register(@RequestBody ExceptionModel model) {
        System.out.println(model+ " was saved to DB...");
        return "ALL GOOD";
    }


}