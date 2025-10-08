package Seguro;
import javax.swing.JOptionPane;

public class PruebaRegistradorSGMM {
    public static void main(String[] args) {
        PruebaRegistradorSGMM exitTo = new PruebaRegistradorSGMM();
        RegistradorSGMM registro = null;
        int menu;
        do{
            menu = Integer.parseInt(JOptionPane.showInputDialog("\n1.-Pagar poliza"+"\n3.-Registrar nuevo clientecliente"+"\n3.-Imprimir" + "\n4.-Salir"));
            switch (menu) {
                case 1:
                registro = exitTo.pagar(registro);
                break;
                case 2:
                registro = exitTo.registroCliente(registro);
                break;
                case 3:
                exitTo.imprimir(registro);
                break;
            }
        }while (menu!=4);
    }

    public RegistradorSGMM pagar(RegistradorSGMM registro) {
        String nombre = JOptionPane.showInputDialog("Proporcione el nombre");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Proporcione su edad"));
        String numPoliza = JOptionPane.showInputDialog("Proporcione su numeor de poliza");


        registro = new RegistradorSGMM(nombre, numPoliza, edad);

        return registro;
    }
    public RegistradorSGMM  registroCliente(RegistradorSGMM registro) {
        String nombre = JOptionPane.showInputDialog("Proporcione el nombre del cliente");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Proporcione la edad del cliente"));
        String direccion = JOptionPane.showInputDialog("Proporcione la direccion del cliente");
        String colonia = JOptionPane.showInputDialog("Proporcione la colonia del cliente");
        int codigoP = Integer.parseInt(JOptionPane.showInputDialog("Proporcione el codigo postal del cliente"));
        String telefono = JOptionPane.showInputDialog("Proporcione el numero telefonico del cliente");
        String correo = JOptionPane.showInputDialog("Proporcione el correo del cliente");
        String fechaContacto = JOptionPane.showInputDialog("Proporcione la fecha cuando se contacto al cliente");
        String agente = JOptionPane.showInputDialog("Proporcione el agente que atendio al cliente");
        registro = new RegistradorSGMM( nombre,  edad, direccion,  colonia,  codigoP,  telefono,  correo,  fechaContacto,  agente);
        return registro;
}

    public void imprimir(RegistradorSGMM registro) {
        if (registro.getNuevoCliente() == true) {

            JOptionPane.showMessageDialog(null, "Nombre: " + registro.getNombre()+ "\nEdad: " + registro.getEdad() + "\nDireccio: " + registro.getDireccion() + "\nColonia: " + registro.getColonia()
             + "\nCodigo Postal:  " + registro.getCP() + "\nTelefono: " + registro.getTelefono() + "\nCorreo: " + registro.getCorreo() + "Fecha de contacto: " + registro.getFecha() + "\nAgente de contacto" + registro.getAgente()); 
        }
        if (registro.getNuevoCliente() == false ) {
            int monto = 0;
            if (registro.getEdad() >= 20 || registro.getEdad() <= 30) 
            monto = registro.polizaCliente(registro.getNombre());
            else if (registro.getEdad() >= 31 || registro.getEdad() <= 50) 
            monto = registro.polizaCliente(registro.getEdad());
            else if (registro.getEdad() >= 51 || registro.getEdad() <= 70)
            monto = registro.polizaCliente();

            JOptionPane.showMessageDialog(null, "Nombre: " + registro.getNombre() + "\nEdad: " + registro.getEdad() +"\nNumero de poliza: "+ registro.getNumPoliza() + "\nMonto a pagar: " + monto );
        }
    }
}

