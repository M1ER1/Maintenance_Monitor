package com.example.maintenance_monitor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaintenanceMonitorController {

    private String message = "Everything operates as expected";

    @RequestMapping("/api/message")
    public String getmessage() {
        return message;
    }

    @RequestMapping("/api/message/set")
    public String setmessage(@RequestParam String m) {
        this.message = m;
        return "ok";
    }
}
