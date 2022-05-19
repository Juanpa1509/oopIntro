package ejemplo1;

import java.util.Date;

public class Cliente extends Persona {

    private int idCliente;
    private Date fechaRegistro;

    public Cliente(int idPersona, String nombre, String apellido, int edadPersona,int idCliente){
        super(idPersona, nombre, apellido,edadPersona);
        this.idCliente = idCliente;
        fechaRegistro = new Date();
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    @Override
    public String toString() {
        return super.toString() + " - Cliente{" +
                "idCliente=" + idCliente +
                ", fechaRegistro=" + fechaRegistro +
                '}';
    }

}
