package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getRadius() {
        Circle test = new Circle(10);
        assertEquals(10, test.getRadius());
    }

    @Test
    void getArea() {
        Circle test = new Circle(10);
        assertEquals(314.1592653589793, test.getArea());
    }

    @Test
    void badRadius() {
        Circle test = new Circle(-5);
        assertEquals(0, test.getRadius());
        assertEquals(0, test.getArea());
    }
}