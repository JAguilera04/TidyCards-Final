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
public class Card {

    String nombre, habilidad;

    public Card(String nombre, String habilidad) {
        this.nombre = nombre;
        this.habilidad = habilidad;
    }

    public Card() {
        this.nombre = "";
        this.habilidad = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }
}
