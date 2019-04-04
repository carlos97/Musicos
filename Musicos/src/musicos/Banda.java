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

    public Banda() {
        this.getMusicosDisponibles();
        this.mostrarListaMusicos();
        this.afinar();
        this.tocar();
    }

    @Override
    public Musico[] getMusicosDisponibles() {
        for (int i = 0; i < musicos.length; i++) {
            musicos[i] = new Musico();
            musicos[i].setDisponibilidad();
        }
        return musicos;
    }

    @Override
    public void setMusicos() {

    }

    @Override
    public void mostrarListaMusicos() {
        System.out.println("La banda esta conformada por:");
        for (int i = 0; i < musicos.length; i++) {
            if (musicos[i].getDisponibilidad()) {
                System.out.println("Musico " + i);
            }
        }
        System.out.println("");
    }

    @Override
    public void afinar() {
        for (int i = 0; i < musicos.length; i++) {
            if (musicos[i].getDisponibilidad()) {
                System.out.print("Musico " + i + " ");
                musicos[i].afinar();
            }
        }
        System.out.println("");
    }

    @Override
    public void tocar() {
        for (int i = 0; i < musicos.length; i++) {
            if (musicos[i].getDisponibilidad()) {
                System.out.print("Musico " + i + " ");
                musicos[i].tocar();
            }
        }
        System.out.println("");
    }

}
