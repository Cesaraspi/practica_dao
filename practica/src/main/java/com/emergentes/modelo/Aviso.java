
package com.emergentes.modelo;

import java.sql.Date;


public class Aviso {
    private int id;
    private String fecha;
    private String titulo;
    private String contenido;
   
   

    public Aviso() {
        id = 0;
        fecha= "";
        titulo = "";
        contenido = "";
        
       
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
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

  

    
    
}
