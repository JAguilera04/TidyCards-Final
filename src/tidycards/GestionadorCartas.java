/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tidycards;

/**
 *
 * @author Oscar
 */
import java.util.*;

public class GestionadorCartas {

    private ArrayList<Card> cartas;

    public GestionadorCartas(int cantidadCartas) {
        this.cartas = new ArrayList<Card>();
        this.añadirCartas(cantidadCartas);
    }

    private void añadirCartas(int cantidad) {
        boolean condicion = false;
        if (cantidad <= 1000 && cantidad >= 1) {
            condicion = true;
            for (int i = 0; i < cantidad; i++) {
                this.cartas.add(new Card());
            }
        }
        this.verificarCantidadCartas(condicion);
    }

    private void verificarCantidadCartas(boolean condicion) {
        if (condicion == false) {
            System.out.println("Se ha sobrepasado el limite de cartas");
        }
    }

    public ArrayList<Card> getCartas() {
        return cartas;
    }

    public ArrayList separarEntero(int numero) {
        ArrayList<Integer> entero = new ArrayList<Integer>();
        int millares = numero / 1000;
        int centenas = (numero - (millares * 1000)) / 100;
        int decenas = (numero - (millares * 1000 + centenas * 100)) / 10;
        int unidades = numero - (millares * 1000 + centenas * 100 + decenas * 10);
        if (numero == 1000) {
            entero.add(millares);
        }
        entero.add(centenas);
        entero.add(decenas);
        entero.add(unidades);
        return entero;
    }

    public int buscarNumeroOrdenado() {
        int numeroOrdenado = -1;
        for (int i = this.cartas.size(); i > 0; i--) {
            ArrayList<Integer> entero = this.separarEntero(i);
            if (entero.get(2) >= entero.get(1) && entero.get(1) >= entero.get(0)) {
                numeroOrdenado = i;
                break;
            }

        }
        return numeroOrdenado;
    }

}
