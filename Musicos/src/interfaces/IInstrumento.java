/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.Random;

/**
 *
 * @author estudiantes
 */
public interface IInstrumento {

    Random rand = new Random();
    //public IInstrumento ();

    String getNombre();

    void setNombre();

    void afinar();

    void tocar();

}
