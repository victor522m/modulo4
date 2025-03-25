package com.victor_henry_angel;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HenryTest {
    Henry henry = new Henry();

    @Test
    void calcularPIEntreNTest(){
        assertEquals(henry.calcularPIEntreN(1f), (float)Math.PI);
    }
}