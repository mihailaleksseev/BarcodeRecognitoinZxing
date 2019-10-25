package com.alekseev.barcodeRecognitionZxing.request;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class ImageRequest {
    //@NotNull
    private String image;
}

