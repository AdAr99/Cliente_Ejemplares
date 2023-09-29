package com.adri.model;

public class Ejemplar {
    
    private int isbn;
    private String titulo;
    private String tematica;
    
    public Ejemplar() {
    }

    public Ejemplar(int isbn) {
        this.isbn = isbn;
    }

    public Ejemplar(int isbn, String titulo, String tematica) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.tematica = tematica;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    
}
