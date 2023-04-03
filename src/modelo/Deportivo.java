package modelo;

public class Deportivo extends Calzado{
    private String tipoDeporte;
    private String tipoMaterial;

    public Deportivo(Producto producto, int numero, String diaVenta, String tipoDeporte, String tipoMaterial) {
        super(diaVenta, numero, producto);
        this.tipoDeporte = tipoDeporte;
        this.tipoMaterial = tipoMaterial;
    }

    public Deportivo(){

    }

    public String getTipoDeporte() {
        return tipoDeporte;
    }

    public void setTipoDeporte(String tipoDeporte) {
        this.tipoDeporte = tipoDeporte;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }
}
