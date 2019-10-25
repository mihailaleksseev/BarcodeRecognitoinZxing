package com.alekseev.barcodeRecognitionZxing.controller;

import com.alekseev.barcodeRecognitionZxing.request.ImageRequest;
import com.alekseev.barcodeRecognitionZxing.response.ImageResponse;
import com.alekseev.barcodeRecognitionZxing.service.RecognizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static com.alekseev.barcodeRecognitionZxing.Utils.Routing.RECOGNIZE_CODE;

@RestController
public class ImageController {

    @Autowired
    private final RecognizeService recognizeService;

    public ImageController(RecognizeService recognizeService) {
        this.recognizeService = recognizeService;
    }

    @RequestMapping(value = RECOGNIZE_CODE, method = RequestMethod.POST)
    private ImageResponse recognize(@RequestBody ImageRequest imageRequest) {
        return recognizeService.recognize(imageRequest);
    }
}
