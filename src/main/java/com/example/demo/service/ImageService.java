package com.example.demo.service;

import com.example.demo.request.ImageRequest;

public interface ImageService {
    String getImagefromUrl(ImageRequest request);

    String getImagefromId(String imageId);
}
