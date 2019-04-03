/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicos;

import interfaces.IMusico;

/**
 *
 * @author estudiantes
 */
public class Musico implements IMusico {

    @Override
    public boolean getDisponibilidad() {
        return disponibilidad;
    }

    @Override
    public Instrumento getInstrumento() {
        return instrumento;
    }

    @Override
    public void setDisponibilidad() {
        
    }

    @Override
    public void setInstrumento() {
        
    }

    @Override
    public void afinar() {
       instrumento.afinar();
    }

    @Override
    public void tocar() {
        instrumento.tocar();
    }

  
    
}
