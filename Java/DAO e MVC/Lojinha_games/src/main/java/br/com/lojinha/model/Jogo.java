/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lojinha.model;

/**
 *
 * @author MIGUELVARGASFERREIRA
 */
public class Jogo {
    // membros de nosso POJO
    private int id;
    private String titulo;
    private String plataforma;
    private double preco;
    private String imagemPath;

    public Jogo() {
    }

    
    public Jogo(int id){
        this.id = id;
        
    }

    public Jogo(int id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    public Jogo(int id, String titulo, double preco) {
        this.id = id;
        this.titulo = titulo;
        this.preco = preco;
    }

    public Jogo(int id, String titulo, String plataforma, double preco, String imagemPath) {
        this.id = id;
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.preco = preco;
        this.imagemPath = imagemPath;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getImagemPath() {
        return imagemPath;
    }

    public void setImagemPath(String imagemPath) {
        this.imagemPath = imagemPath;
    }
    
}
