package modelo;

public class Calzado {
    private String diaVenta;
    private int numero;

    private Producto producto;

    public Calzado(String diaVenta, int numero, Producto producto) {
        super();
        this.diaVenta = diaVenta;
        this.numero = numero;
        this.producto = producto;
    }

    public Calzado() {
    }

    public String getDiaVenta() {
        return diaVenta;
    }

    public void setDiaVenta(String diaVenta) {
        this.diaVenta = diaVenta;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }


    //•	valorVenta: retornará el valor de venta del calzado, sabiendo que el fin de semana,
    // aumenta en un 24% el valor Base y en la semana el valor Base disminuye en un 15%.
    public int valorVenta(){
       int valorVenta = 0;
       //Se hizo la venta en la semana
       if(this.getDiaVenta().equalsIgnoreCase("Semana")){
           // -15% valor base
           valorVenta = this.getProducto().getValorBase() - Math.round(this.getProducto().getValorBase()*15/100);
       }else if(this.getDiaVenta().equalsIgnoreCase("Fin de semana")){
           // +24% valor base
           valorVenta = (int) (this.getProducto().getValorBase() + Math.round(this.getProducto().getValorBase()*0.24));
       }
       return valorVenta;
    }

    //•	impuestoIva: retornará el valor por concepto de IVA que es el 19% del valor venta
    public int impuestoIVA(){
        return 0;
    }

}
