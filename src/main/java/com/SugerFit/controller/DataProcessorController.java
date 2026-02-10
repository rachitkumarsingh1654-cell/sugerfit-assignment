package com.SugerFit.controller;

import com.SugerFit.dto.request.DataProcessorRequest;
import com.SugerFit.dto.response.DataProcessorResponse;
import com.SugerFit.services.DataProcessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataProcessorController {
    @Autowired
    private DataProcessorService dataProcessorService;

    @PostMapping("/example")
    public ResponseEntity<DataProcessorResponse> bookRide(@RequestBody DataProcessorRequest dataProcessorRequest) {
        try {
            DataProcessorResponse dataProcessorResponse = dataProcessorService.process(dataProcessorRequest);
            return new ResponseEntity<>(dataProcessorResponse, HttpStatus.CREATED);
        } catch (Exception ex) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }

    }
}
