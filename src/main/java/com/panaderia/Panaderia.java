package com.panaderia;

import java.util.ArrayList;
import java.util.List;

/**
 * Administra los panes disponibles en la panadería.
 */
public final class Panaderia {

    /** Lista de panes disponibles. */
    private final List<Pan> panes = new ArrayList<>();

    /**
     * Agrega un pan a la panadería.
     * @param pan Pan a agregar.
     */
    public void agregarPan(final Pan pan) {
        panes.add(pan);
    }


    /**
     * Obtiene la lista de panes disponibles.
     * @return Lista de panes.
     */
    private List<Pan> obtenerPanesI() {
    return new ArrayList<>(panes);
    }

    /**
     * Obtiene la lista de panes disponibles privada.
     * @return Lista de panes.
     */
    public List<Pan> obtenerPanes() {
        return obtenerPanesI();
    }

}
