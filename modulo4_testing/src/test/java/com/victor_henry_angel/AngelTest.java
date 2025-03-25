package com.victor_henry_angel;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class AngelTest {
    Angel angel = new Angel();
    @Test
    void testSumatorio() {
        assertEquals(55, angel.sumatorio(10));
        assertEquals(3,angel.sumatorio(2));
    }

}
