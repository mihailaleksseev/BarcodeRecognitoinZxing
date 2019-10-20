package com.alekseev.barcodeRecognitionZxing.controller;

import com.alekseev.barcodeRecognitionZxing.request.ImageRequest;
import com.alekseev.barcodeRecognitionZxing.response.ImageResponse;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import static com.alekseev.barcodeRecognitionZxing.Routing.RECOGNIZE_CODE;

@RestController
public class ImageController {

    @RequestMapping(value = RECOGNIZE_CODE, method = RequestMethod.POST)
    private ImageResponse recognize(@Valid @RequestBody ImageRequest imageRequest) {
        return null;
    }
}
