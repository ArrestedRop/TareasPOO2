package RegistroAlumnos;

public class RegistroEvento {
    private String nombre, num_control, semestre, rango;
    public int gasto;
    private boolean event_flag;
    
    //Conferencias
    public RegistroEvento(String nombre, String num_control, String semestre, String rango) {
        this.nombre = nombre;
        this.num_control = num_control;
        this.semestre = semestre;
        this.rango = rango;
        event_flag = true;
    }
    //Talleres
    public RegistroEvento(String nombre, String num_control, String semestre, boolean event_flag) {
        this.nombre = nombre;
        this.num_control = num_control;
        this.semestre = semestre;
        event_flag = false;
    }
    //Conferencias
    public int gasto(){
        gasto = 100;
        return gasto;
    }
    //Talleres
    public int gasto(boolean event_flag){
        gasto = 120;
        return gasto;
    }

    public void setFlag(boolean event_flag) {
        this.event_flag=event_flag;
    }
    public String getNombre() {
        return nombre;
    }
    public String getnumControl() {
        return num_control;
    }
    public String getSemestre() {
        return semestre;
    }
    public boolean getFlag() {
        return event_flag;
    }
}

