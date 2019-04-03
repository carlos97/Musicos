/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import musicos.Musico;

/**
 *
 * @author estudiantes
 */
public interface IBanda {

    Musico[] musicos = new Musico[20];

    Musico[] getMusicosDisponibles();

    void setMusicos();

    void mostrarListaMusicos();

    void afinar();

    void tocar();
}
