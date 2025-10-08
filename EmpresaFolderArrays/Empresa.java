package EmpresaFolderArrays;
public class Empresa {
        private String nombre;
        private double pago_finde;

    public void setNombre( String nombre) {
        this.nombre = nombre;
    }
    public void setPago(double pago_finde) {
        this.pago_finde = pago_finde;
    }

    public String getNombre() {
        return nombre;
    }
    public double getPago() {
        return pago_finde;
    }
}