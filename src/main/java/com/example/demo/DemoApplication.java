package com.exemplo.statusapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StatusApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(StatusApiApplication.class, args);
    }
}
src/main/java/com/exemplo/statusapi/StatusController.java

java
package com.exemplo.statusapi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {
    @GetMapping("/status")
    public ResponseEntity<Void> getStatus() {
        return ResponseEntity.ok().build(); // sempre retorna 200 OK
    }
}