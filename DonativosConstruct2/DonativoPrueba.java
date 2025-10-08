package DonativosConstruct2; 
import javax.swing.*;

public class DonativoPrueba {
    public static void main(String[] args) {
        DonativoPrueba exitTo = new DonativoPrueba();
        Donativo donaciones = null;
        int menu;

        do{
        menu = Integer.parseInt(JOptionPane.showInputDialog("1-. Capturar" + "\n2.-Imprimir" + "\nModificar donacion " + "\n4.-Salir"));
        switch (menu) {
            case 1:
            donaciones = exitTo.capturar(donaciones);
            break;
            case 2:
            exitTo.imprimir(donaciones);
            break;
            case 4:
                exitTo.modificar(donaciones);
                break;
        }
        } while (menu!=4);
    }
    public Donativo capturar(Donativo donaciones) {
        String nombre = JOptionPane.showInputDialog("Registra tu nombre: ");
        int numControl = Integer.parseInt(JOptionPane.showInputDialog("Registra tu numero de control: "));
        String utiles = JOptionPane.showInputDialog("Donaste utiles?  Si/No");
        String electronico = JOptionPane.showInputDialog("Donaste electronicos?  Si/NO");
        donaciones = new Donativo(nombre, numControl, electronico, utiles);
        return donaciones;
    }
    public void imprimir(Donativo donaciones) {
        JOptionPane.showMessageDialog(null, "Nombre: " + donaciones.getNombre() + "\nGracias por tu apoyo" + 
                                      "\n Numero De Control: "+ donaciones.getNumControl() + "\n Dono electronicos?: "
                                      + donaciones.getElectronico() + "\n Dono utiles?" + donaciones.getUtiles());
    }
    public void modificar(Donativo donaciones){
        donaciones.setElectronico(JOptionPane.showInputDialog("Registra si donaste electronicos SI/NO: "));
        donaciones.setUtiles(JOptionPane.showInputDialog("Registra si donaste utiles SI/NO "));
    }
    
   } 