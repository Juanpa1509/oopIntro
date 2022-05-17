public class Llanta {

    //Atributos
    private int id, rin;
    private String marca;

    //Constructor
    public Llanta(int id, String marca){
        this.id = id;
        this.marca = marca;
    }

    //Métodos
    public void mostrar(){
        System.out.println("Numero de llanta: " + id);
        System.out.println("Marca de llanta: " + marca);
    }
}