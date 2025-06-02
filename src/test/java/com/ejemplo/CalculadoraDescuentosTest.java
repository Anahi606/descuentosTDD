package com.ejemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraDescuentosTest {
    @Test
    public void testDescuentoPorcentaje10() {
        assertEquals(90.0, CalculadoraDescuentos.aplicarDescuentoPorcentaje(100.0, 10.0));
    }

    @Test
    public void testDescuentoPorcentaje30() {
        assertEquals(70.0, CalculadoraDescuentos.aplicarDescuentoPorcentaje(100.0, 30.0));
    }

    @Test
    public void testDescuentoPorcentaje200() {
        assertEquals(0, CalculadoraDescuentos.aplicarDescuentoPorcentaje(100.0, 200.0));
    }

    @Test
    public void testDescuentoPorcentaje50(){
        assertEquals(50, CalculadoraDescuentos.aplicarDescuentoPorcentaje(100.0, 50.0));
    }
}