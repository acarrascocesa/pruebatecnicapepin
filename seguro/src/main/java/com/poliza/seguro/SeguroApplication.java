package com.poliza.seguro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SeguroApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeguroApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "La API esta corriendo en el puerto 8080";
    }
}
