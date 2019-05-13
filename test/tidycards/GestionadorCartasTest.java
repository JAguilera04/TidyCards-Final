/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tidycards;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Oscar
 */
public class GestionadorCartasTest {

    public GestionadorCartasTest() {

    }
    //Estos test se encargarán de verificar el perfecto funcionamiento del algoritmo

    @Test
    public void testNumerosOrdenados1() {
        int[] cantidadCartas = {132, 1000, 7};
        int[] resultadoEsperado = {129, 999, 7};
        ArrayList<GestionadorCartas> gestionador = new ArrayList<GestionadorCartas>();
        boolean condicion = true;
        for (int i = 0; i < cantidadCartas.length; i++) {
            gestionador.add(new GestionadorCartas(cantidadCartas[i]));
            if (gestionador.get(i).buscarNumeroOrdenado() != resultadoEsperado[i]) {
                condicion = false;
            }
        }
        if (gestionador.size() != resultadoEsperado.length) {
            condicion = false;
        }
        assertTrue(condicion);
        for (int i = 0; i < gestionador.size(); i++) {
            System.out.println("Deck #" + (i + 1) + ": " + gestionador.get(i).buscarNumeroOrdenado());
        }
    }

    @Test
    public void testNumerosOrdenados2() {
        int[] cantidadCartas = {0, 54, 65, 88, 94, 100, 110, 254, 297, 312, 356, 487, 542, 567, 649, 715, 816, 880, 915, 998};
        int[] resultadoEsperado = {0, 49, 59, 88, 89, 99, 99, 249, 289, 299, 356, 479, 499, 567, 599, 699, 799, 799, 899, 899};
        ArrayList<GestionadorCartas> gestionador = new ArrayList<GestionadorCartas>();
        boolean condicion = true;
        for (int i = 0; i < cantidadCartas.length; i++) {
            gestionador.add(new GestionadorCartas(cantidadCartas[i]));
            if (gestionador.get(i).buscarNumeroOrdenado() != resultadoEsperado[i]) {
                condicion = false;
                System.out.println("posicion " + i);
            }
        }
        if (gestionador.size() != resultadoEsperado.length) {
            condicion = false;
        }
        assertTrue(condicion);
        for (int i = 0; i < gestionador.size(); i++) {
            System.out.println("Deck #" + (i + 1) + ": " + gestionador.get(i).buscarNumeroOrdenado());
        }
    }

    //Este grupo de test se encargarán de verificar que solamente cumpla su función cuando las cartas están en su rango   
    @Test
    public void testComprobarCartas1() {
        GestionadorCartas gestionador = new GestionadorCartas(-1);
        int resultadoEsperado = 0;
        int resultadoObtenido = gestionador.getCartas().size();
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void testComprobarCartas2() {
        GestionadorCartas gestionador = new GestionadorCartas(1001);
        int resultadoEsperado = 0;
        int resultadoObtenido = gestionador.getCartas().size();
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

}
