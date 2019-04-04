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

    public String nombre;

    public Instrumento() {
        this.setNombre();
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre() {
    }

    @Override
    public void afinar() {
        System.out.println("afinando " + getNombre());
    }

    @Override
    public void tocar() {
        System.out.println("tocando " + getNombre());
    }

}
