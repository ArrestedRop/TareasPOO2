package Feria;


import javax.swing.JOptionPane;

public class PruebaFeria {
    public static void main(String[] args) {
    PruebaFeria exitTo = new PruebaFeria();
    recopiladorFeria panelPrecios = new recopiladorFeria();
    int menu = 0;
    do{ 
        menu =Integer.parseInt(JOptionPane.showInputDialog("Elige " +"\n1.-Capturar boletos"+"\n2.-Imprimir informacion"+ "\n3.-Imprimir boletos"+"\n4.-Salir"));
        switch (menu) {
            case 1:
                exitTo.capturar(panelPrecios);
                break;
            case 2:
            exitTo.imprimir(panelPrecios);
                break;
            case 3:
            exitTo.imprimirBoletos(panelPrecios);
            break;
            case 4:
            break;
            default:
                break;
        }

    }while(menu!=4);
    }

    public void capturar(recopiladorFeria panelPrecios) {
        panelPrecios.setNormalTicketQuantity(Integer.parseInt(JOptionPane.showInputDialog("Capture la cantidad de boletos normales")));
        panelPrecios.setINAPAMTicketQuantity(Integer.parseInt(JOptionPane.showInputDialog("Captura la cantidad de boletos IPANAM")));
        panelPrecios.setFreeTickets(Integer.parseInt(JOptionPane.showInputDialog("Captura la cantidad de boletos de cero coste")));
    }

    public void imprimir(recopiladorFeria panelPrecios){
        JOptionPane.showMessageDialog(null,"Cantidad de boletos normales: "+ panelPrecios.getNormalTicketQuantity()+"\nCantidad de boletos INAPAM: "+  panelPrecios.getINAPAMTicketQuantity()+"\nCantidad de boletos de cero coste: "+ panelPrecios.getFreeTickets()+
                                      "\nCantidad total de boletos: "+ panelPrecios.gettotalTickets() + "\nCoste total: " + panelPrecios.gettotalCost() + " $");
    }
    public void imprimirBoletos(recopiladorFeria panelPrecios) {
        for(int i = 0;i<panelPrecios.getNormalTicketQuantity();i++) {
        JOptionPane.showMessageDialog(null, "BOLETO GENERAL N.  " + (i+1) );
        }
        for(int i = 0;i<panelPrecios.getINAPAMTicketQuantity();i++) {
        JOptionPane.showMessageDialog(null, "BOLETO INAPAM N.  " + (i+1) );
        }
        for(int i = 0;i<panelPrecios.getFreeTickets();i++) {
        JOptionPane.showMessageDialog(null, "BOLETO SIN COSTO N. " + (i+1) );
        }
    }
    
}
