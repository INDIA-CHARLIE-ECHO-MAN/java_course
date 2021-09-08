package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuboidTest {

    @Test
    void getHeight() {
        Cuboid test = new Cuboid(1,2,20);
        assertEquals(20, test.getHeight());
    }

    @Test
    void getVolume() {
        Cuboid test = new Cuboid(1,2,10);
        assertEquals(20, test.getVolume());
    }

    @Test
    void badHeight() {
        Cuboid test = new Cuboid(1,2,-20);
        assertEquals(0, test.getHeight());
        assertEquals(0, test.getVolume());
    }
}