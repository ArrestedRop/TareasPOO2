package MedicosEnard;

import javax.swing.*;

public class MedicoPrueba {
public static void main(String[] args){
    String menu[]={"Registrar Medicos", "Imprimir Medicos", "Modificar Hospital",
                "Lista prom > 83", "Lista de hospitales", "Lista de especialidades", "Salir"};
                MedicoPrueba exitTo = new MedicoPrueba();
                Medico dotor[] = new Medico[100];
                int pos;
                int opcion = 0;
    do{
        JOptionPane.showOptionDialog(null, "Elige Opcion:", "MENU DE OPCIONES", 
                                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, menu, menu[6]);
        switch(opcion) {
            case 1:
            break;
              case 2:
            break;
              case 3:
            break;
              case 4:
            break;
              case 5:
            break;
        }
        }while(opcion != 6);
    }
}
