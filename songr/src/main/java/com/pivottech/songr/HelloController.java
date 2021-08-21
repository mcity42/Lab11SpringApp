package com.pivottech.songr;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String test(String str)
    {
        return "hello";
    }

    @GetMapping("/capitalize/{text}")
    public String capitalize(@PathVariable(name = "text") String text, Model model){
        model.addAttribute("text", text);
        return "capitalize";
    }

    @GetMapping("/")
    public String splash()
    {
        return "splash";
    }

    @GetMapping("/albums")
    public String albums(Model model)
    {
        Album album1 = new Album("Illmatic","Nas" ,"images/Illmatic.jpg",10,2392);
        ArrayList<Album> albumList = new ArrayList<>();

        //add
        albumList.add(album1);
        model.addAttribute("albums",albumList);
        return "albums";
    }

}