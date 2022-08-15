package mx.uacm.edu.test;

import mx.uacm.edu.Juego;
import mx.uacm.edu.Jugador;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class JuegoTest {

    @Test
    public void ImprimeNombreArrayJugadores(){
        Juego juego = new Juego();
        Jugador jugador1 = new Jugador();
        Jugador jugador2 = new Jugador();
        ArrayList<Jugador> jugadores = new ArrayList<>();
        jugadores.add(jugador1);
        jugadores.add(jugador2);

        for (int i = 0; i < jugadores.size(); i++) {
            String nombre = juego.asignaNombreJugadores(jugadores.get(i),i);
            jugadores.get(i).setNombre(nombre);

        }
        System.out.println(jugadores.toString());



    }
    @Test
    public void ImprimeNombreArraySimbolosYNombres(){
        Juego juego = new Juego();
        Jugador jugador1 = new Jugador();
        Jugador jugador2 = new Jugador();
        ArrayList<Jugador> jugadores = new ArrayList<>();
        jugadores.add(jugador1);
        jugadores.add(jugador2);

        for (int i = 0; i < jugadores.size(); i++) {
            String nombre = juego.asignaNombreJugadores(jugadores.get(i),i);
            jugadores.get(i).setNombre(nombre);
            jugadores.get(i).setCaracter(jugadores.get(i).assignaCaracter(i + 1));

        }
        System.out.println(jugadores.toString());


    }

}