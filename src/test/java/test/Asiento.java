package test;

public class Asiento {
    string colores = {"rojo", "verde", "amarillo", "negro", "blanco"};

    string color;
    int precio;
    int registro;

    public void cambiarColor (string color) {
        for (String valido : colores) {
            if (valido.equals(color)) {
                this.color = color;
                break;
            }

        }
        

    }


}