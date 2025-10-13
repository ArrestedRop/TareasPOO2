package RegistroAlumnos;

import javax.swing.JOptionPane;

public class RegistroEventoPrueba {
    public static void main(String[] args) {
        String menu[] = {"Registrar alumnos", "Lista de conferencia", 
                        "Lista de talleres","Lista de inscritos", "Modificar asistencia"};
        RegistroEvento registrador[] = new RegistroEvento[100];
        RegistroEventoPrueba exitTo = new RegistroEventoPrueba();  
        int pos = 0;
        int opcion = 0;
        do{
            opcion = JOptionPane.showOptionDialog(null, "Elige una opcion", "MENU DE OPCIONES",
                                             JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, menu, menu[5]);
            switch (opcion) {
                case 0: 
                pos = exitTo.registroAlumnos(registrador, pos);
                    break;
                case 1: 
                exitTo.listaConferencias(registrador,pos);
                    break;
                case 2: 
                exitTo.listaTalleres(registrador,pos);
                    break;
                case 3: 
                    break;
                case 4: 
                    break;
            }
        }while(opcion!=5);
    }

    public int registroAlumnos(RegistroEvento registrador[], int pos) {
        String Atendencia[] = {"Conferencias", "Talleres"};
        String nombre = JOptionPane.showInputDialog("Proporcione el nombre del alumno");
        String  num_control = JOptionPane.showInputDialog("Proporciona el numero de control");
        String semestre = JOptionPane.showInputDialog("Indica el semestre");
        int opcion = JOptionPane.showOptionDialog(null, "Elige una opcion", "MENU DE OPCIONES",
                                                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, Atendencia, Atendencia[1]);
        if (opcion == 0) 
            registrador[pos] = new RegistroEvento(nombre, num_control, semestre);
        else 
        registrador[pos] = new RegistroEvento(nombre, num_control, semestre, false);
        pos++;
        return pos;
    }
    public void listaConferencias(RegistroEvento registrador[], int pos) {
        String confExit = "";
        boolean flag = false;
        for(int i = 0;i<pos; i++) {
        if(registrador[i].getFlag() == true) 
        confExit += "\n" + (i+1) + ".-" + registrador[i].getNombre(); 
        }
    JOptionPane.showMessageDialog(null, "Lista de alumnos que atenderan a conferencias:"+ confExit);
    }

    public void listaTalleres(RegistroEvento registrador[], int pos) {
        String workS = "";
        boolean flag = false;
        for(int i = 0;i<pos; i++) {
        if(registrador[i].getFlag() == false) 
        workS += "\n" + (i+1) + ".-" + registrador[i].getNombre(); 
        }
    JOptionPane.showMessageDialog(null, "Lista de alumnos que atenderan a talleres:"+ workS);
    }
}