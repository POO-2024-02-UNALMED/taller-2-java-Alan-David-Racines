package test;

public class Auto {
    String modelo;
    int precio;
    Asiento[] asientos;
    string marca;
    Motor motor;
    int registro;
    static string cantidadCreados;

    public int cantidadAsientos() {
        int contador = 0;
        for (Asiento asiento : this.asientos) {
            if (asiento != null) {
                contador++;
            }
        }
        return contador;
    }
    public String verificarIntegridad(){
        if (this.registro == this.motor.registro){
            for (Asiento asiento : this.asientos){
                if (asiento != null && asiento.registro != this.registro) {
                    return "Las piezas no son originales";
                }
            }
            return "Auto original";
        }
        return "Las piezas no son originales";
    }

}