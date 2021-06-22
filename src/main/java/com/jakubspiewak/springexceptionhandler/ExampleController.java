package com.jakubspiewak.springexceptionhandler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class ExampleController {
    @GetMapping
    public ResponseEntity<?> throwException() throws Exception {
        throw new Exception("Something goes wrong!");
    }

    @PostMapping
    public ResponseEntity<?> throwRuntimeException() {
        throw new RuntimeException("Something goes wrong again!");
    }
}
