package MedicosEnard;

import java.lang.invoke.MethodHandleInfo;

import javax.swing.*;

public class MedicoPrueba {
  public static void main(String[] args){
    MedicoPrueba exitTo = new MedicoPrueba();
    Medico dotor[] = new Medico[100];
    String menu[]={"Registrar Medicos", "Imprimir Medicos", "Modificar Hospital",
    "Lista prom > 83", "Lista de hospitales", "Lista de especialidades", "Salir"};
    int opcion = 0;
    int pos = 0;
    do{
        opcion = JOptionPane.showOptionDialog(null, "Elige Opcion:", "MENU DE OPCIONES", 
                                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, menu, menu[6]);
        switch(opcion) {
            case 0:
            pos = exitTo.registrarMedicos(pos,dotor);
            break;
            case 1:
            exitTo.imprimirMedicos(pos,dotor);
            break;
            case 2:
            exitTo.modificarHospital(pos,dotor);
            break;
            case 3:
            exitTo.listaProm(pos, dotor);
            break;
            case 4:
            exitTo.listaHospitales(pos,dotor);
            break;
            case 5:
            exitTo.listaEspecialidades(pos,dotor);
            break;
        }
        }while(opcion != 6);
    }
  public int registrarMedicos(int pos, Medico dotor[]) {
    String nombre = JOptionPane.showInputDialog("Proporcione su nombre");
    int cedula = Integer.parseInt(JOptionPane.showInputDialog("Proporcione su cedula"));
    int ano_titulacion = Integer.parseInt(JOptionPane.showInputDialog("Proporcione el ano de titulacion"));
    double promedio = Double.parseDouble(JOptionPane.showInputDialog("Proporcione el proimedio de su exmanen"));
     String especialidad = JOptionPane.showInputDialog("Proporcione la especialidad");
    String hospital = JOptionPane.showInputDialog("Proporcione el hospital"); 
  dotor[pos] = new Medico(nombre, cedula, ano_titulacion, especialidad, hospital, promedio);
  pos++;
    return pos;
  }
  public void imprimirMedicos(int pos, Medico dotor[]) {
    String datos = "";
    for(int i = 0;i<pos;i++) {
      datos += "Medico: "+ dotor[i].getNombre() + "\nCedula: " + dotor[i].getCedula() + "\nAño de titulacion: " + dotor[i].getAño() + "\nPromedio: " + dotor[i].getPromedio() + "\n Especialidad: " + 
              dotor[i].getEspecialidad() + "\nHospital: " + dotor[i].getHospital();
    }
    JOptionPane.showMessageDialog(null, "Lista de datos:\n" + datos);
  }
  public void modificarHospital(int pos, Medico dotor[]) {
    pos = Integer.parseInt(JOptionPane.showInputDialog("Numero de medico a modificar"));
    dotor[pos-1].setHospital(JOptionPane.showInputDialog("Nuevo Hospital"));
  }
  public void listaProm(int pos, Medico dotor[]) {
      String promedios83 = "";
      for(int i = 0;i<pos; i++) {
        if(dotor[i].getPromedio() > 83) 
        promedios83 = Double.toString(dotor[i].getPromedio()) + "\n";
      }
      JOptionPane.showMessageDialog(null, "Lista de promedios mayores a 83:\n" + promedios83);
   }
  public void listaHospitales(int pos, Medico dotor[]) {
    String hospitales = "";
    for(int i = 0; i<pos; i++) {
        hospitales += dotor[i].getHospital() + "\n";
    }
    JOptionPane.showMessageDialog(null,"Lista de hospitales:\n" + hospitales);
  }
  public void listaEspecialidades(int pos, Medico dotor[]){ 
    String especialidades = "";
    for(int i = 0;i<pos; i++) {
      especialidades += dotor[i].getEspecialidad();
    }
    JOptionPane.showMessageDialog(null, "Lista de especialidades:\n" + especialidades);
  }
}
