package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuoteController {
    @GetMapping("/quote")
    public String randomQuote(Model model) {
        String[] quote = {
            "The only way to do great work is to love what you do. - Steve Jobs",
            "The best way to predict the future is to invent it. - Alan Kay",
            "goodbye. - Steve Jobs",
        };
        int randInt = (int)(Math.random() * quote.length);
        model.addAttribute("randomQuote", quote[randInt]);
        return "quote";
    }
}
