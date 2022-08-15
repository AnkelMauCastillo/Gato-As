package mx.uacm.edu.test;

import mx.uacm.edu.Jugador;
import org.junit.Test;

public class JugadorTest {

    @Test
    public void imprimeDatosJugador(){
        Jugador jugador = new Jugador("Eduardo");
        jugador.setCaracter(jugador.assignaCaracter(10));
        System.out.println(jugador);



    }


    @Test
    public void validaValor(){
        Jugador jugador = new Jugador("Eduardo");
        int contador = 10;
        boolean cerradura = false;

        do {
            System.out.println("Entro");
            if (jugador.validaValorNumerico(contador)) {
                cerradura = true;
                System.out.println("Entro x2");
                jugador.setCaracter(jugador.assignaCaracter(contador));
            }
            contador--;

        }while (cerradura != true);

        System.out.println(jugador);


    }

}