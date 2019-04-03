/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicos;

import interfaces.IBanda;

/**
 *
 * @author estudiantes
 */
public class Banda implements IBanda {
    

    @Override
    public Musico[] getMusicosDisponibles() {
        for(int i=0;i<musicos.length;i++){
            musicos[i]=new Musico();
            musicos[i].setDisponibilidad();
        }
        return musicos;
    }

    @Override
    public void setMusicos() {
        
    }

    @Override
    public void mostrarListaMusicos() {
      
    }

    @Override
    public void afinar() {
       
    }
    
    @Override
    public void tocar() {
       
    }
    
}
