package test;

public class Auto {
    String modelo;
    int precio;
    Asiento[] asientos;
    string marca;
    Motor motor;
    int registro;
    static string cantidadCreados;

    int cantidadAsientos() {
        int contador = 0;
        for (Asiento i: this.asientos) {
            if (i instanceof Asiento) {
                ++contador;
            }
        }
        return contador;
    }
