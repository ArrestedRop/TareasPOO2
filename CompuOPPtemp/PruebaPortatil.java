import javax.swing.JOptionPane;
public class PruebaPortatil {
    public static void main(String[] args){
        Portatil compu = new Portatil();
        PruebaPortatil exitTo = new PruebaPortatil();
        int menu=0;
        do{
            menu =Integer.parseInt(JOptionPane.showInputDialog("Elige " +"\n1.-Capturaar \n2.-Imprimir \n3.-Salir "));
            switch (menu) {
                case 1:
                    exitTo.capturar(compu);
                    break;
                case 2:
                    exitTo.imprimir(compu);
                    break;
                case 3:
                  
                    break;
            
            
                default:
                    break;
            }
        }while(menu!=6);
    }//main end
    public void capturar( Portatil compu) {
        compu.setTeacherName(JOptionPane.showInputDialog("Registra el nombre del profesor"));
        compu.setTeacherCode(Integer.parseInt(JOptionPane.showInputDialog("Registra el codigo del profesor")));
        compu.setDepartment(JOptionPane.showInputDialog("Registra el departamento del profesor"));
        compu.setLapBrand(JOptionPane.showInputDialog("Registra la marca de la computadora"));
        compu.setIpDirection(JOptionPane.showInputDialog("Registra la direccion IP"));
        compu.setMacDirection(JOptionPane.showInputDialog("Registra la direccion MAC"));
    }
    public void imprimir(Portatil compu) {
        JOptionPane.showMessageDialog(null, "Nombre: " + compu.getTeacherName() + "\nNum de control: " + compu.getTeacherCode() +"\nDepartamento: " + compu.getDepartment() 
                                      + "\nMarca de laptop: " + compu.getLapBrand()  + "\nDireccion IP: " + compu.getIpDirection() + "\nDireccion MAC: " + compu.getMacDirection());
    }

}
