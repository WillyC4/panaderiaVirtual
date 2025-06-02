package com.panaderia;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Pruebas unitarias para la clase Pan.
 */
public class PanTest {

    @Test
    public void testGetters() {
        Pan pan = new Pan("Bolillo", 1.5, 7);
        assertEquals("Bolillo", pan.getNombre());
        assertEquals(1.5, pan.getPrecio(), 0.001);
        assertEquals(7, pan.getCalidad());
    }

    @Test
    public void testToString() {
        Pan pan = new Pan("Croissant", 3.0, 9);
        assertEquals("Croissant - Precio: $3.0 - Calidad: 9", pan.toString());
    }
}
