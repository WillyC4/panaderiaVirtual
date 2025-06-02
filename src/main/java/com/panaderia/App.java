package com.panaderia;

/**
 * Punto de entrada de la aplicación.
 */
public final class App {

    /**
     * Constructor privado para evitar instanciación.
     */
    private App() {
        // Constructor privado vacío
    }

    /**
     * Método principal que ejecuta la aplicación.
     * @param args Argumentos de línea de comandos.
     */
    public static void main(final String[] args) {
        final double baguetteP = 2.5;
        final int baguetteC = 8;
        final double croissantP = 3.0;
        final int croissantC = 9;

        Panaderia panaderia = new Panaderia();
        panaderia.agregarPan(new Pan("Baguette", baguetteP, baguetteC));
        panaderia.agregarPan(new Pan("Croissant", croissantP, croissantC));

        Pan mejorPrecio = ComparadorPan.compararPrecio(
                panaderia.obtenerPanes().get(0),
                panaderia.obtenerPanes().get(1)
        );

        System.out.println("Pan más barato: " + mejorPrecio);
    }
}
