package com.skg.notes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller")
public class Controller {

    @Autowired
    Service service;


    @GetMapping("health")
    public ResponseEntity<String> getHealth(){
        return ResponseEntity.ok(service.getHealthStatus());
    }
}
