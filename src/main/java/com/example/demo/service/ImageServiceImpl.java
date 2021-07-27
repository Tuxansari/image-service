package com.example.demo.service;

import com.example.demo.request.ImageRequest;
import org.apache.commons.io.IOUtils;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.stereotype.Service;

import java.io.InputStream;

@Service
public class ImageServiceImpl implements ImageService {
    @Override
    public String getImage(ImageRequest request) {
        return convertUrlToBase64(request.getImageUrl());
    }

    public String convertUrlToBase64(String urlString) {

        try {
            java.net.URL url = new java.net.URL(urlString);
            InputStream is = url.openStream();
            byte[] bytes = IOUtils.toByteArray(is);
            return Base64.encodeBase64String(bytes);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "dummy";
    }
}
