package com.pibauth.restControllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {
    public ResponseEntity authenticateUser(){
        return (ResponseEntity) ResponseEntity.ok();
    }
}
