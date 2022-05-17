public class Motor {

    //Atributos
    private int cilindraje;
    private String marca;

    //Constructor
    public Motor(int cilindraje, String marca){
        this.cilindraje = cilindraje;
        this.marca = marca;
    }

    //Métodos
    public void mostrar(){
        System.out.println("Cilindraje: " + cilindraje);
        System.out.println("Marca Motor: " + marca);
    }
}