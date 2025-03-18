package com.example.projectdongju.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PoemController {

    @GetMapping("poem")
    public String showRandomPoem(Model model) {

        List<String> titles = new ArrayList<>();
        List<String> writers = new ArrayList<>();
        List<String> contents = new ArrayList<>();

        titles.add("서시");
        writers.add("윤동주");
        contents.add("죽는 날까지 하늘을 우러러<br>" +
                "한 점 부끄럼이 없기를,<br>" +
                "잎새에 이는 바람에도<br>" +
                "나는 괴로워했다.<br>" +
                "별을 노래하는 마음으로<br>" +
                "모든 죽어 가는 것을 사랑해야지.<br>" +
                "그리고 나한테 주어진 길을<br>" +
                "걸어가야겠다.<br>" +
                "오늘 밤에도 별이 바람에 스치운다.");
        model.addAttribute("title", titles.get(0));
        model.addAttribute("writer", writers.get(0));
        model.addAttribute("content", contents.get(0));
        return "poem";
    }
}