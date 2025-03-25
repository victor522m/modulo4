package com.victor_henry_angel;

public class HenryTest {
    Henry henry = new Henry();

    @Test
    void calcularPIEntreNTest(){
        assertEquals(henry.calcularPIEntreN(1f), Math.PI);
    }
}