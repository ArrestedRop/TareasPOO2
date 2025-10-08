import javax.swing.JOptionPane;

public class PruebaRegistro {
    public static void main(String[]args) {
        PruebaRegistro salira = new PruebaRegistro();
        DatosAvon chambeadora = new DatosAvon();
        int menu = 0;
        do{
            menu = Integer.parseInt(JOptionPane.showInputDialog("Elige " +"\n1.-Capturaar \n2.-Imprimir \n3.-Salir "));
            switch (menu) {
                case 1:
                    salira.registrar(chambeadora);
                break;
                case 2:
                    salira.imprimir(chambeadora);
                break;
                case 3:
                    break;
                default:
                    break;
            }
        }while (menu!=3);
    }
    public void registrar(DatosAvon chambeadora) {
        chambeadora.setNombre(JOptionPane.showInputDialog("Registra el nombre de la promotora"));
        chambeadora.setClavePromotora(Integer.parseInt(JOptionPane.showInputDialog("Registra la clave de la promotora")));
        chambeadora.setNumeroCelular(JOptionPane.showInputDialog("Registra el numero de la promotora"));
        chambeadora.setCorreoElectronico(JOptionPane.showInputDialog("Registra el Correo electronico de la promotora"));
        chambeadora.setCiudadOrigen(JOptionPane.showInputDialog("Registra la ciudad de origen de la promotora"));
        chambeadora.setNombreContactoEmergencia(JOptionPane.showInputDialog("Registra la nombre del contacto de emergencia de la promotora"));
        chambeadora.setNumeroContactoEmergencia(JOptionPane.showInputDialog("Registra el numero de emergencia de la promotora"));
        chambeadora.setAsistencia(JOptionPane.showInputDialog("Registra la aasistencia de la promotora"));
        chambeadora.setParticipacion(JOptionPane.showInputDialog("Registra la participacion de la promotora"));
    }
    public void imprimir(DatosAvon chambeadora) {
        JOptionPane.showMessageDialog(null, "Nombbre: " + chambeadora.getNombre() +"\nClave: " + chambeadora.getClavePromotora() + 
        "\nNumero celular: " + chambeadora.getNumeroCelular() + "\nCorreo Electronico: " + chambeadora.getCorreoElectronico()+ "\nCiudad de origen: " + chambeadora.getCiudadOrigen()
         + "\nNombre del contacto de emergencia: " + chambeadora.getNombreContactoEmergencia() +"\nNumero del contacto de emergencia: " + chambeadora.getNumeroContactoEmergencia() 
         + "\nAsistencia"+ chambeadora.getAsistencia() + "\nparticipacion" + chambeadora.getParticipacion());
    }
}
