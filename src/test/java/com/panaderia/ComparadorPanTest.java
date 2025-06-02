package com.panaderia;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Pruebas unitarias para la clase ComparadorPan.
 */
public class ComparadorPanTest {

    @Test
    public void testCompararPrecio() {
        Pan p1 = new Pan("Pan Integral", 2.0, 8);
        Pan p2 = new Pan("Pan Blanco", 3.0, 7);
        assertEquals(p1, ComparadorPan.compararPrecio(p1, p2));
    }

    @Test
    public void testCompararCalidad() {
        Pan p1 = new Pan("Pan Integral", 2.0, 8);
        Pan p2 = new Pan("Pan Blanco", 3.0, 7);
        assertEquals(p1, ComparadorPan.compararCalidad(p1, p2));
    }
}
