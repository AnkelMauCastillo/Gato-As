package mx.uacm.edu;

public class Tablero {
    private static final int COLUMNAS = 3;
    private static final  int FILAS = 3;
    private String [][]tablero = new String[COLUMNAS][FILAS];

    private int posicionesJugador;

    public Tablero() {
        posicionesJugador = 1;
        for (int i = 0; i < COLUMNAS; i++) {
            for (int j = 0; j < FILAS ; j++) {
                tablero[i][j] = String.valueOf(posicionesJugador);
                posicionesJugador++;
            }

        }
    }

    public String[][] getTablero() {
        return tablero;
    }

    public void setTablero(String[][] tablero) {
        this.tablero = tablero;
    }








    @Override
    public String toString() {
        return tablero [0][0] + "|" + tablero [0][1] + "|" + tablero [0][2]  + "\n_____\n" + "\n" +
                tablero [1][0] + "|" + tablero [1][1] + "|" + tablero [1][2]  + "\n_____\n" + "\n" +
                tablero [2][0] + "|" + tablero [2][1] + "|" + tablero [2][2]  + "\n_____\n";
    }
}
