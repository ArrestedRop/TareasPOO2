package RegistroAlumnos;

public class RegistroEvento {
    private String nombre, num_control, semestre;
    public int gasto;
    private boolean event_flag;
    
    public RegistroEvento(String nombre, String num_control, String semestre) {
        this.nombre = nombre;
        this.num_control = num_control;
        this.semestre = semestre;
        event_flag = true;
    }

    public RegistroEvento(String nombre, String num_control, String semestre, boolean event_flag) {
        this.nombre = nombre;
        this.num_control = num_control;
        this.semestre = semestre;
        event_flag = false;
    }

    public int gasto(){
        gasto = 100;
        return gasto;
    }
    public int gasto(boolean event_flag){
        gasto = 120;
        return gasto;
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

