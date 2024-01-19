package com.divyaishu.snapship.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImageController {

    @GetMapping("/image")
    String getImage(){
        return "Hello, I am your image downloader";
    }
}
