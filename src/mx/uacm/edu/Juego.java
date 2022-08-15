package mx.uacm.edu;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {
    private Tablero tablero = new Tablero();
    private Jugador jugadorUno = new Jugador();
    private Jugador jugadorDos = new Jugador();

    private ArrayList<Jugador> jugadores;

    public Juego() {
    }

    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    public Jugador getJugadorUno() {
        return jugadorUno;
    }

    public void setJugadorUno(Jugador jugadorUno) {
        this.jugadorUno = jugadorUno;
    }

    public Jugador getJugadorDos() {
        return jugadorDos;
    }

    public void setJugadorDos(Jugador jugadorDos) {
        this.jugadorDos = jugadorDos;
    }

    public void IniciaJuego(){
        Scanner entrada = new Scanner(System.in);
        int turno=0;
        int posicion;
        int bandera=1;
        boolean gana=false;
        boolean validaCeldaOcupada = true;
        jugadores = ImprimeNombreArraySimbolosYNombre();
        System.out.println(jugadores.toString());



    }

    public boolean estaVacia(int posicion,Jugador jugador){
        int cuentaPosicion=1;
        String [][] tableroAuxiliar = new String[tablero.getTablero().length][tablero.getTablero().length];
        boolean valida=false;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){

                if(tableroAuxiliar[i][j]==" " && posicion==cuentaPosicion){
                    tableroAuxiliar[i][j]=jugador.getCaracter();
                    tablero.setTablero(tableroAuxiliar);
                    valida=true;
                }
                cuentaPosicion++;
            }
        }
        return valida;
    }

    public String asignaNombreJugadores(Jugador jugador, int posicion){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su nombre Jugador: " + (posicion + 1));
        String nombre = entrada.nextLine();
        return nombre;
    }
    public ArrayList<Jugador> ImprimeNombreArraySimbolosYNombre(){
        Juego juego = new Juego();

        ArrayList<Jugador> jugadores1 = new ArrayList<>();
        jugadores1.add(jugadorUno);
        jugadores1.add(jugadorDos);

        for (int i = 0; i < jugadores1.size(); i++) {
            String nombre = juego.asignaNombreJugadores(jugadores1.get(i),i);
            jugadores1.get(i).setNombre(nombre);
            jugadores1.get(i).setCaracter(jugadores1.get(i).assignaCaracter(i + 1));

        }


        return jugadores1;


    }





}
