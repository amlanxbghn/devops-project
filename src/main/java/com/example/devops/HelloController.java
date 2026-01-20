package com.example.devops;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller to handle Hello World requests.
 */
@RestController
public class HelloController {

    /**
     * Returns a JSON message.
     * @return map containing the greeting message
     */
    @GetMapping("/")
    public Map<String, String> hello() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Hello from DevOps Project!");
        response.put("status", "success");
        return response;
    }
}
