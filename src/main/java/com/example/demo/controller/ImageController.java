package com.example.demo.controller;

import com.example.demo.service.ImageService;
import com.example.demo.request.ImageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ImageController {

    @Autowired
    private ImageService imageService;

    @PostMapping(value = "/getImage")
    public @ResponseBody String getImage(@RequestBody final ImageRequest request) {
        return imageService.getImage(request);
    }

}
