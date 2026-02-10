package com.SugerFit.services;

import com.SugerFit.dto.request.DataProcessorRequest;
import com.SugerFit.dto.response.DataProcessorResponse;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class DataProcessorService {
    public DataProcessorResponse process(DataProcessorRequest request) {

        UUID requestId = UUID.randomUUID();

        DataProcessorResponse dataProcessorResponse = DataProcessorResponse.builder().status("SUCCESS").requestId(requestId).build();

        return dataProcessorResponse;
    }
}