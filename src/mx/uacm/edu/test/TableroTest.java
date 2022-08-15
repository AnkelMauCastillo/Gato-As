package mx.uacm.edu.test;

import mx.uacm.edu.Tablero;
import org.junit.Test;

import static org.junit.Assert.*;

public class TableroTest {

    @Test
    public void imprimeTablero(){
        Tablero tablero = new Tablero();
        System.out.println(tablero);
    }

}