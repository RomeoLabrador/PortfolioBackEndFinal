/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.romeo.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author romeo
 */
public class dtoCertificados {
    @NotBlank
    private String nombreC;
    @NotBlank
    private String descripcionC;
    private String img;
    
    //Constructores

    public dtoCertificados() {
    }

    public dtoCertificados(String nombreC, String descripcionC, String img) {
        this.nombreC = nombreC;
        this.descripcionC = descripcionC;
        this.img = img;
    }
    
    //getters and Setters

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public String getDescripcionC() {
        return descripcionC;
    }

    public void setDescripcionC(String descripcionC) {
        this.descripcionC = descripcionC;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    
    
    
            
            
}
