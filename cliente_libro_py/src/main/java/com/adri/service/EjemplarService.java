package com.adri.service;

import java.util.List;

import com.adri.model.Ejemplar;

public interface EjemplarService {
    List<Ejemplar> lista();
    Ejemplar buscar(int isbn);
    List<Ejemplar> agregar (Ejemplar ejemplar);
    List<Ejemplar> eliminar (int isbn);
    void actualizar(Ejemplar ejemplar);
}
