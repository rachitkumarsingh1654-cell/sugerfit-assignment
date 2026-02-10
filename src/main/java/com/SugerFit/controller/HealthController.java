package com.SugerFit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import static com.SugerFit.commons.enums.ProjectEnums.ACTIVE;
import static com.SugerFit.commons.enums.ProjectEnums.SUGERFIT;

@RestController
public class HealthController {

    @GetMapping("/health")
    public Map<String, Object> health() {
        Map<String, Object> response = new HashMap<>();
        response.put("status", ACTIVE);
        response.put("timestamp", LocalDateTime.now());
        response.put("service", SUGERFIT);

        return response;
    }

}
