package EmpresaFolderArrays;
import javax.swing.*;
public class EmpresaMain {
    public static void main(String[] args) {
         Empresa empresa[] = new Empresa[3];
         EmpresaMain exitTo = new EmpresaMain();
         for (int i=0;i<3;i++) {
            empresa[i] = new Empresa();
         }
         int menu;
         do{

            menu = Integer.parseInt(JOptionPane.showInputDialog("1.-Capturar"+"\n2.-Imprimir"+"\n3.-Empresas que pagan mas de 200"+"\n4.-Promedio"+"\n5.-Empresa mas rica"+"\n6.- Salir"));
            switch (menu) {
                case 1:
                exitTo.capturar(empresa);
                    break;
                case 2:
                exitTo.imprimir(empresa);
                    break;
                case 3:
                exitTo.imprimir200(empresa);
                    break;
                case 4:
                exitTo.promedio(empresa);
                    break;
                case 5: 
                    exitTo.biggest(empresa);
                    break;
            }
         }while(menu!=6);
    }
    public void capturar(Empresa empresa[]) {
        for (int i=0;i<3; i++) {
        empresa[i].setNombre(JOptionPane.showInputDialog("Registra el nombre de la empresa"));
        empresa[i].setPago(Double.parseDouble(JOptionPane.showInputDialog("Registra el sueldo que paga la empresa")));
        }
    }
    public void imprimir(Empresa empresa[]) {
        for (int i=0;i<3; i++) {
            System.out.println("Empresa " + (i+1) + "\n" + empresa[i].getNombre() + "\nPago: " + empresa[i].getPago() + "\n");
        }
    } 
    public void imprimir200(Empresa empresa[]) {
        System.out.println("Empresas que pagan mas de 200 varos");
        boolean existen = false;
        for (int i=0;i<3; i++) { 
            if (empresa[i].getPago() > 200)
            System.out.println(empresa[i].getNombre());
            existen = true;
        }
        if (existen == false);
        System.out.println("No hay empresas ricas");

    }
    public void promedio(Empresa empresa[]) {
        double promedio = 0;
        System.out.println("Promedio de sueldos de fin de semana");
          for (int i=0;i<3; i++) { 
            promedio += empresa[i].getPago();
          }
        JOptionPane.showMessageDialog(null, "Promedio: " + (promedio/empresa.length));

    }

    public void biggest(Empresa empresa[]) {
        
        double montomayor = 0;
        int imayor = 0;
        for (int i=0;i<3; i++) { 
        if (montomayor <= empresa[i].getPago()){
            montomayor = empresa[i].getPago();
            imayor = i;
            }   
        }
            JOptionPane.showMessageDialog(null, "La empresa que mas paga: " + empresa[imayor].getNombre() + empresa[imayor].getNombre());
        }
    }
