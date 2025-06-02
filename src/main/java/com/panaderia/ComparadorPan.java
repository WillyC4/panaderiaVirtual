package com.panaderia;

/**
 * Compara los panes según precio y calidad.
 */
public final class ComparadorPan {

    /**
     * Constructor privado para evitar instanciación.
     */
    private ComparadorPan() {
        // Constructor privado vacío
    }

    /**
     * Compara dos panes por precio.
     * @param p1 Primer pan.
     * @param p2 Segundo pan.
     * @return El pan más barato.
     */
    public static Pan compararPrecio(final Pan p1, final Pan p2) {
        return (p1.getPrecio() < p2.getPrecio()) ? p1 : p2;
    }

    /**
     * Compara dos panes por calidad.
     * @param p1 Primer pan.
     * @param p2 Segundo pan.
     * @return El pan de mejor calidad.
     */
    public static Pan compararCalidad(final Pan p1, final Pan p2) {
        return (p1.getCalidad() > p2.getCalidad()) ? p1 : p2;
    }
}
