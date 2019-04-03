/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicos;

import interfaces.IInstrumento;

/**
 *
 * @author estudiantes
 */
public class Instrumento implements IInstrumento {

    @Override
    public String getNombre() {
      return nombre;
    }

    @Override
    public void setNombre() {
       
    }

    @Override
    public void afinar() {
        System.out.println("afinar");
    }

    @Override
    public void tocar() {
        System.out.println("tocar");
    }
    
}
