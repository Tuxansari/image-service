package com.example.demo;

import com.example.demo.service.ImageServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		ImageServiceImpl imageService = new ImageServiceImpl();
		String data = imageService.convertUrlToBase64("https://i.picsum.photos/id/237/200/300.jpg?hmac=TmmQSbShHz9CdQm0NkEjx1Dyh_Y984R9LpNrpvH2D_U");
		System.out.println(data);
	}

}
