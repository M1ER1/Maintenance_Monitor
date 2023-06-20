package com.example.maintenance_monitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaintenanceMonitorControllerTest {

    MaintenanceMonitorController maintenanceMonitorController = new MaintenanceMonitorController();

    @Test
    public void getmessageTest() {
        //Arrange
        String expected = "Everything operates as expected";

        //Act
        String result = maintenanceMonitorController.getmessage();

        //Assert
        assertEquals(expected, result);
    }

    @Test
    public void setmessageTest() {
        String expected = "setmessageTest";

        maintenanceMonitorController.setmessage(expected);
        String result = maintenanceMonitorController.getmessage();

        assertEquals(expected, result);
        assertEquals("ok", maintenanceMonitorController.setmessage(expected));
    }

    @Test
    public void resetTest() {
        String m = "resetTest";

        maintenanceMonitorController.setmessage(m);
        maintenanceMonitorController.reset();
        String result = maintenanceMonitorController.getmessage();

        assertEquals("Everything operates as expected", result);
        assertEquals("ok", maintenanceMonitorController.reset());
    }
}