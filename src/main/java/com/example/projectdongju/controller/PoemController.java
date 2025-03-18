package com.example.projectdongju.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.security.SecureRandom;

@Controller
public class PoemController {

    @GetMapping("poem")
    public String showRandomPoem(Model model) {
        // 랜덤을 이용해서 랜덤하게 시를 보여주게 하도록 구현
        SecureRandom random = new SecureRandom();
        return "poem";
    }
}