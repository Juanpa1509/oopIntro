public class Carro{

    //Atributos
    private String marca, modelo;
    private Motor motor;
    private Llanta[] llantas;
    private int contadorLlantas;

    //Constructor
    public Carro(String marcaMotor, String modelo, int cilindraje) {
        this.modelo = modelo;
        this.motor = new Motor(cilindraje, marcaMotor);
        this.llantas = new Llanta[4];
        this.contadorLlantas = 0;
    }

    public void agregarLlanta (Llanta nuevaLlanta) {

        if (contadorLlantas < 4) {
            llantas[contadorLlantas] = nuevaLlanta;
            contadorLlantas ++;
        }

    }

    public void mostrar(){
        System.out.println("Modelo del carro " + modelo);
        motor.mostrar();
        System.out.println("Numero de llantas " + contadorLlantas);
        for(int i = 0; i < contadorLlantas; i++) {
            llantas[i].mostrar();
        }
    }

}