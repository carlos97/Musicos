/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.Random;
import musicos.Instrumento;

/**
 *
 * @author estudiantes
 */
public interface IMusico {

    Random rand = new Random();

    boolean getDisponibilidad();

    Instrumento getInstrumento();

    void setDisponibilidad();

    void setInstrumento();

    void afinar();

    void tocar();
}
