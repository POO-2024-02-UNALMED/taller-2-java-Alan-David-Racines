package test;

public class Motor {
    int numeroCilindros;
    String tipo;
    int registro;

    void cambiarRegistro (int registro){
        this.registro = registro;
    }

    public void asignarTipo (String tipo) {
        if (tipo.equals("electrico") || tipo.equals("gasolina")) {

        }
    }  
}