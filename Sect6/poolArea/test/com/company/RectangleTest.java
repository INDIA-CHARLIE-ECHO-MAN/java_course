package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getWidth() {
        Rectangle test = new Rectangle(5,2);
        assertEquals(5, test.getWidth());
    }

    @Test
    void getLength() {
        Rectangle test = new Rectangle(5,2);
        assertEquals(2, test.getLength());
    }

    @Test
    void getArea() {
        Rectangle test = new Rectangle(5,2);
        assertEquals(10, test.getArea());
    }

    @Test
    void badWidth() {
        Rectangle test = new Rectangle(-5, 2);
        assertEquals(0, test.getArea());
        assertEquals(0, test.getWidth());
    }

    @Test
    void badLength() {
        Rectangle test = new Rectangle(1, -2);
        assertEquals(0, test.getArea());
        assertEquals(0, test.getLength());
    }
}