package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    void getHeight() {
        Cylinder test = new Cylinder(10, 5);
        assertEquals(5, test.getHeight());
    }

    @Test
    void getVolume() {
        Cylinder test = new Cylinder(10, 5);
        assertEquals(1570.7963267948967, test.getVolume());
    }

    @Test
    void badRadius() {
        Circle test = new Circle(-5);
        assertEquals(0, test.getRadius());
        assertEquals(0, test.getArea());
    }
}