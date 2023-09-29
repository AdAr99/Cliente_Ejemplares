package com.adri.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adri.model.Ejemplar;
import com.adri.service.EjemplarService;

@RestController
public class EjemplarController {
    
    @Autowired
    EjemplarService service;

    @GetMapping(value = "ejemplar")
    public List<Ejemplar> lista(){
        return service.lista();
    }

    @PostMapping(value = "ejemplar/{isbn}/{titulo}/{tematica}")
    public List<Ejemplar> alta(@PathVariable ("isbn")int isbn, @PathVariable("titulo") String titulo,@PathVariable("tematica") String tematica){
        
        Ejemplar ejemplarAta = new Ejemplar(isbn, titulo, tematica);
        return service.agregar(ejemplarAta);
    }

    @GetMapping(value = "ejemplar/{isbn}")
    public Ejemplar buscar (@PathVariable int isbn){
        return service.buscar(isbn);
    }

    @DeleteMapping(value = "ejemplar/{isbn}")
    public List<Ejemplar> eliminar (@PathVariable int isbn){

        return service.eliminar(isbn);
    }

    @PutMapping(value = "ejemplar/{isbn}/{titulo}/{tematica}")
    public void actualizar(@PathVariable ("isbn")int isbn, @PathVariable("titulo") String titulo,@PathVariable("tematica") String tematica){

        Ejemplar ejemplarAct = new Ejemplar(isbn, titulo, tematica);
        service.actualizar(ejemplarAct);
    }
}
