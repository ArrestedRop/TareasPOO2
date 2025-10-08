
package DonativosConstruct2;

public class Donativo {
    private String nombre, electronico, utiles;
    private int numControl;
    
public Donativo() {
    nombre="";
    numControl = 0;
    electronico = "no";
    utiles = "no"; 
}
public Donativo(String nombre, int numControl, String electronico, String utiiles) {
    this.nombre =nombre;
    this.numControl = numControl;
    this.electronico = electronico;
    this.utiles = utiiles; 
}
public void setElectronico(String electronico) {
    this.electronico = electronico;
}
public void setUtiles(String utiles) {
    this.utiles = utiles;
}

public String getNombre() {
    return nombre; 
}
public int getNumControl() {
    return numControl; 
}
public String getElectronico() {
    return electronico; 
}
public String getUtiles() {
    return utiles; 
}
}