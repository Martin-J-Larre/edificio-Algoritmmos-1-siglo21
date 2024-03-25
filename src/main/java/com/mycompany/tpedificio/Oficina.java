/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpedificio;

/**
 *
 * @author martin
 */
public class Oficina {
    public int piso;
    public int oficina;
    
    
    public Oficina(int piso, int oficina ){
        this.piso = piso;
        this.oficina = oficina;
    }
    
    @Override
    public String toString(){
        return String.format("Piso: %d - Oficina: %s", piso, oficina);
    }
}
