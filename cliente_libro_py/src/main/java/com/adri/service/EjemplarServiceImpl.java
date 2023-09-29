package com.adri.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.adri.model.Ejemplar;

@Service
public class EjemplarServiceImpl implements EjemplarService{

    private String url = "http://localhost:8080/";

    @Autowired
    RestTemplate template;

    @Override
    public List<Ejemplar> lista() {
        return Arrays.asList(template.getForObject(url+"libros", Ejemplar[].class));
    }

    @Override
    public Ejemplar buscar(int isbn) {
        return template.getForObject(url+ "libro/"+isbn, Ejemplar.class);
        
    }

    @Override
    public List<Ejemplar> agregar(Ejemplar ejemplar) {
        template.postForLocation( url+"libro", ejemplar);

        return Arrays.asList(template.getForObject(url+ "libros", Ejemplar[].class)); 
    }

    @Override
    public List<Ejemplar> eliminar(int isbn) {
        template.delete(url+"libro/"+isbn);

        return Arrays.asList(template.getForObject(url+ "libros", Ejemplar[].class));
    }

    @Override
    public void actualizar(Ejemplar ejemplar) {
        template.put(url+"libro", ejemplar);
    }
    
}
