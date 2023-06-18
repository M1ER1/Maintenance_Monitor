package com.example.maintenance_monitor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaintenanceMonitorController {

    private String message = "Everything works as expected";

    @RequestMapping("/api/message")
    public String getmessage() {
        return message;
    }
}
