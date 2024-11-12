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
        for (Asiento i: this.Asientos){
            if (i instanceof Asiento) {
                if (i.registro != this.motor.registro) {
                    return "Las piezas no son originales";

                }else if (i.registro != this.registro) {
                    return "Las piezas no son origianles";

                }else if (this.registro != this.motor.registro) {
                    return "Las piezas no son originales";

                }
            }
        }
        return "Auto original";

    }

}