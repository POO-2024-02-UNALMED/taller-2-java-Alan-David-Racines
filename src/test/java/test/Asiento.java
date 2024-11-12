package test;

public class Asiento {
    static string[] colores = {"rojo", "verde", "amarillo", "negro", "blanco"};

    string color;
    int precio;
    int registro;

    public void cambiarColor (string color) {
        boolean colorEncontrado = false;
        for (String validoColor : colores) {
            if (validoColor.equals(color)) {
                colorEncontrado = true;
                break;
            }

        }

        if (colorEncontrado){
            this.color = color;
        }
        

    }


}