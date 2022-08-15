package mx.uacm.edu;

import java.util.Scanner;

public class Jugador {

    private String nombre;
    private String caracter;
    private final Scanner entrada = new Scanner(System.in);

    public Jugador() {

    }

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getCaracter() {
        return caracter;
    }

    public void setCaracter(String caracter) {
        this.caracter = caracter;
    }

    public String assignaCaracter(int valorCaracter){
        Jugador jugador = new Jugador();

        if (valorCaracter == 1) {
            return "X";
        }else if (valorCaracter == 2){
            return "O";
        }
        return null;
    }

    public boolean validaValorNumerico(int valorNumerico){

        if (valorNumerico > 0 && valorNumerico < 3) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", caracter='" + caracter + '\'' +
                '}';
    }
}
