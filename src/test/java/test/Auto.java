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
            if (i != null) {
                ++contador;
            }
        }
        return contador;
    }
    String verificarIntegridad(){
        if (this.registro == this.motor.registro){
            for (Asiento i: this.asientos){
                if (i != null && i.registro != this.registro) {
                    return "Las piezas no son originales";
                }
            }
            return "Auto original";
        }
        return "Las piezas no son originales";
    }

}