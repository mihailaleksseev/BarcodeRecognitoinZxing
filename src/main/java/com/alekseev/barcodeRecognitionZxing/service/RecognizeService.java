package com.alekseev.barcodeRecognitionZxing.service;

import com.alekseev.barcodeRecognitionZxing.request.ImageRequest;
import com.alekseev.barcodeRecognitionZxing.response.ImageResponse;
import org.springframework.stereotype.Service;

@Service
public class RecognizeService {

    public ImageResponse recognize(ImageRequest imageRequest) {

        ImageResponse imageResponse = new ImageResponse();
        imageResponse.setValue(imageRequest.getImage());
        imageResponse.setType("CODE_128");
        return imageResponse;

    }
}
