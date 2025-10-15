package RegistroAlumnos;

import javax.swing.JOptionPane;

public class RegistroEventoPrueba {
    public static void main(String[] args) {
        String menu[] = {"Registrar alumnos", "Lista de conferencia", 
                        "Lista de talleres","Lista de inscritos", "Modificar asistencia","Salir"};
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
                exitTo.listaInscritos(registrador,pos);
                    break;
                case 4: 
                exitTo.modificarAsistencia(registrador,pos);
                    break;
            }
        }while(opcion!=5);
    }

    //Registro de alumnos
    public int registroAlumnos(RegistroEvento registrador[], int pos) {
        String Atendencia[] = {"Conferencias", "Talleres"};
        String nombre = JOptionPane.showInputDialog("Proporcione el nombre del alumno");
        String  num_control = JOptionPane.showInputDialog("Proporciona el numero de control");
        String semestre = JOptionPane.showInputDialog("Indica el semestre");
        int opcion = JOptionPane.showOptionDialog(null, "Elige una opcion", "MENU DE OPCIONES",
                                                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, Atendencia, Atendencia[1]);
        if (opcion == 0) {
        String rango = JOptionPane.showInputDialog("Proporcione el horario de la conferencia");
            registrador[pos] = new RegistroEvento(nombre, num_control, semestre, rango);
            pos++;
        }
        else if (opcion == 1) {
        JOptionPane.showMessageDialog(null, "Videojuegos el día 22 de octubre de 9:00-14:00 en el aula LC3");
        registrador[pos] = new RegistroEvento(nombre, num_control, semestre, false);
            pos++;
        }
        return pos;
    }

    //Impresion de la lista de asitencia en conferencias
    public void listaConferencias(RegistroEvento registrador[], int pos) {
        String confExit = "";
        boolean flag = false;
        for(int i = 0;i<pos; i++) {
        if(registrador[i].getFlag() == true) {
        confExit += "\n" + (i+1) + ".-" + registrador[i].getNombre();
        flag = true;
            }
        }
        if (flag == true)
    JOptionPane.showMessageDialog(null, "Lista de alumnos que atenderan a conferencias:"+ confExit);
        else 
    JOptionPane.showMessageDialog(null, "No hay alumnos registrados a conferencias");
    }

    //Impresion de la lista de asistencia en talleres
    public void listaTalleres(RegistroEvento registrador[], int pos) {
        String workS = "";
        boolean flag = false;
        for(int i = 0;i<pos; i++) {
        if(registrador[i].getFlag() == false) {
        workS += "\n" + (i+1) + ".-" + registrador[i].getNombre(); 
        flag = true;
            }
        }
        if (flag == true)
    JOptionPane.showMessageDialog(null, "Lista de alumnos que atenderan a talleres:"+ workS);
        else 
    JOptionPane.showMessageDialog(null, "No hay alumnos registrados para talleres");
    }
    
    //Impresion de la lista de inscritos con sus gastos
    public void listaInscritos(RegistroEvento registrador[], int pos) {

        String conferencias = "";
        String talleres = "";

        for(int i = 0 ;i<pos; i++) {
            if (registrador[i].getFlag() == true) {
                conferencias += "Alumno: " + registrador[i].getNombre() +"    Costo: " + registrador[i].gasto() + "\n";
            }
            else 
                talleres += "Alumno: " + registrador[i].getNombre() +"    Costo: " + registrador[i].gasto(false);
        }
        JOptionPane.showMessageDialog(null, "Lista de inscritos a conferencias:\n" + conferencias + "Lista de ibscritos a talleres:\n" + talleres);
    } 
    //Modificador de asistencia
    public void modificarAsistencia(RegistroEvento registrador[], int pos) {
        int num_control = Integer.parseInt(JOptionPane.showInputDialog("Proporcione el numero el numero de control del alumno a modificar"));
        for (int i = 0;i<pos;i++) {
            if (num_control == Integer.parseInt(registrador[i].getnumControl())) {
                String Atendencia[] = {"Conferencias", "Talleres"};
        int opcion = JOptionPane.showOptionDialog(null, "Elige una opcion", "MENU DE OPCIONES",
                                                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, Atendencia, Atendencia[1]);
        if (opcion == 0) 
            registrador[i].setFlag(true);
        else if(opcion == 1)
            registrador[i].setFlag(false);
            }
        }
        }
}
