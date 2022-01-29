package com.example.demo.controller;

import com.example.demo.data.Trade;
import com.example.demo.data.TradeType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class MainController {

    @GetMapping("/")
    public String index(final Model model){
        model.addAttribute("data", new Trade());
        return "index";
    }

    public void getData(@ModelAttribute("data") TradeType trade, Model model){
        System.out.println(trade);
    }

}
