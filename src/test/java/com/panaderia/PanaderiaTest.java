package com.panaderia;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

/**
 * Pruebas unitarias para la clase Panaderia.
 */
public class PanaderiaTest {

    @Test
    public void testAgregarPan() {
        Panaderia panaderia = new Panaderia();
        Pan pan = new Pan("Baguette", 2.5, 8);

        panaderia.agregarPan(pan);
        List<Pan> panes = panaderia.obtenerPanes();

        assertFalse(panes.isEmpty());
        assertEquals(1, panes.size());
        assertEquals("Baguette", panes.get(0).getNombre());
    }

    @Test
    public void testObtenerPanes() {
        Panaderia panaderia = new Panaderia();
        Pan pan1 = new Pan("Croissant", 3.0, 9);
        Pan pan2 = new Pan("Pan Integral", 2.0, 7);

        panaderia.agregarPan(pan1);
        panaderia.agregarPan(pan2);
        List<Pan> panes = panaderia.obtenerPanes();

        assertEquals(2, panes.size());
        assertEquals(pan1, panes.get(0));
        assertEquals(pan2, panes.get(1));
    }
}
