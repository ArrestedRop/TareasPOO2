import javax.swing.JOptionPane;

public class PruebaAlumno {
    public static void main(String[] args) {

    Alumno juan = new Alumno();
    PruebaAlumno salira = new PruebaAlumno();
    int menu=0;

    do{
        menu=Integer.parseInt(JOptionPane.showInputDialog("Elige "
                              + "\n1.-Capturar \n2.-Imprimir \n3.-Salir"));
        switch(menu) {
            case 1: 
                salira.capturar(juan);
            break;

            case 2:
                salira.imprimir(juan);
            break;

            case 3:
            break;

            default:
            break;
        }
        }while(menu!=3);
    }//main end

    public void capturar(Alumno juan) {
        juan.setName(JOptionPane.showInputDialog("Registra tu nombre"));
        juan.setAge(Integer.parseInt(JOptionPane.showInputDialog("Registra tu Edad")));
        juan.setHighschool(JOptionPane.showInputDialog("Registre su prepa"));
    }
    public void imprimir(Alumno juan) {
        JOptionPane.showMessageDialog(null, "Nombre: "+ juan.getName() + "\nEdad: " + juan.getAge() + "\nPrepa: "+ juan.getHighschool());
    }

 
    }//class end
