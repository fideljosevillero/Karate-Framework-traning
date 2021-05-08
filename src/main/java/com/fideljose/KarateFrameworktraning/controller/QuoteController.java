package com.fideljose.KarateFrameworktraning.controller;

import com.fideljose.KarateFrameworktraning.model.Quote;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping
public class QuoteController {

    @GetMapping("/algo")
    public Quote quote(){
        Quote q = new Quote("1", new Date(), "Medellin", "my home");
        return q;
    }

}
