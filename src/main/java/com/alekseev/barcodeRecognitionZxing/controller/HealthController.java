package com.alekseev.barcodeRecognitionZxing.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

import static com.alekseev.barcodeRecognitionZxing.Utils.Routing.SERVICE_STATUS;

@RestController
public class HealthController {

    @GetMapping(SERVICE_STATUS)
    private HashMap<String, String> health() {
        HashMap hashMap = new HashMap();
        hashMap.put("status", "OK");
        return hashMap;
    }

}
