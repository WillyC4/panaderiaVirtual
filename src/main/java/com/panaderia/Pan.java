package com.panaderia;

/**
 * Representa un pan en la panadería.
 */
public final class Pan {

    /** Nombre del pan. */
    private final String nombre;

    /** Precio del pan. */
    private final double precio;

    /** Calidad del pan. */
    private final int calidad;

    /**
     * Constructor de la clase Pan.
     * @param nombreParam Nombre del pan.
     * @param precioParam Precio del pan.
     * @param calidadParam Calidad del pan.
     */
    public Pan(final String nombreParam,
            final double precioParam,
            final int calidadParam) {
        this.nombre = nombreParam;
        this.precio = precioParam;
        this.calidad = calidadParam;
    }

    /**
     * Obtiene el nombre del pan.
     * @return Nombre del pan.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el precio del pan.
     * @return Precio del pan.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Obtiene la calidad del pan.
     * @return Calidad del pan.
     */
    public int getCalidad() {
        return calidad;
    }

    @Override
    public String toString() {
        return nombre + " - Precio: $" + precio + " - Calidad: " + calidad;
    }
}
