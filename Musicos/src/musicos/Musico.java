/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicos;

import interfaces.IMusico;
import modelo.*;

/**
 *
 * @author estudiantes
 */
public class Musico implements IMusico {

    private boolean disponibilidad;
    private Instrumento instrumento;

    public Musico() {
        instrumento = new Instrumento();
        this.setDisponibilidad();
        this.setInstrumento();
    }

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
        if (rand.nextInt() % 2 == 0) {
            disponibilidad = true;
        } else {
            disponibilidad = false;
        }
    }

    @Override
    public void setInstrumento() {
        switch (rand.nextInt() % 6) {
            case 0:
                instrumento = new Bajo();
                break;
            case 1:
                instrumento = new Bateria();
                break;
            case -1:
                instrumento = new Bateria();
                break;
            case 2:
                instrumento = new Flauta();
                break;
            case -2:
                instrumento = new Flauta();
                break;
            case 3:
                instrumento = new Guitarra();
                break;
            case -3:
                instrumento = new Guitarra();
                break;
            case 4:
                instrumento = new Saxofon();
                break;
            case -4:
                instrumento = new Saxofon();
                break;
            case 5:
                instrumento = new Violin();
                break;
            case -5:
                instrumento = new Violin();
                break;
        }
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
