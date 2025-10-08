package Seguro;
public class RegistradorSGMM {
    private String nombre, direccion,colonia, telefono, correo, fechaContacto, numPoliza, agente;
    private int edad , codigoP;
    private boolean nuevoCliente;

    public RegistradorSGMM(String nombre, int edad, String direccion, String colonia, int codigoP, String telefono, String correo, String fechaContacto, String agente) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.colonia = colonia;
        this.codigoP =  codigoP;
        this.telefono = telefono;
        this.correo = correo;
        this.fechaContacto = fechaContacto;
        this.agente = agente;
        nuevoCliente = true;
    }
    public RegistradorSGMM(String nombre, String numPoliza, int edad) {
        this.nombre = nombre;
        this.numPoliza = numPoliza;
        this.edad = edad;
        nuevoCliente = false;
      
    }

   
    public int polizaCliente(String nombre) {
        return 15500;
    }
    public int polizaCliente(int edad) {
        return 25000;
    }
    public int polizaCliente() {
        return 45000;
    }


    public boolean getNuevoCliente(){
        return nuevoCliente;
    }
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public int getCP(){
        return codigoP;
    }
    public String getDireccion(){
        return direccion;
    }
    public String getColonia(){
        return colonia;
    }
    public String getTelefono(){
        return telefono;
    }
    public String getCorreo(){
        return correo;
    }
    public String getAgente(){
        return agente;
    }
    public String getNumPoliza(){
        return numPoliza;
    }
    public String getFecha(){
        return fechaContacto;
    }

}