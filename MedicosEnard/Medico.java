package MedicosEnard;

public class Medico {
    private int cedula, ano_titulacion;
    private double promedio;
    private String nombre, especialidad, hospital; 
    

public Medico(String nombre, int cedula, int ano_titulacion, String especialidad, String hospital, double promedio) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.ano_titulacion = ano_titulacion;
        this.especialidad = especialidad;
        this.hospital = hospital;
        this.promedio = promedio;
}    
public String getNombre() {
    return nombre;
}
public int getCedula() {
        return cedula;
}
public int getAño() {
    return ano_titulacion;
}
public String getEspecialidad() {
    return especialidad;
}
public String getHospital() {
    return hospital;
}
public double getPromedio() {
    return promedio;
}
public void setHospital(String hospital) {
    this.hospital = hospital;
}
}
