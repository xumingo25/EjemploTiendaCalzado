package modelo;

public class Hombre extends Formal {

    public Hombre(Producto producto, String diaVenta, int numero, String color) {
        super(diaVenta, numero, producto, color);
    }

    public Hombre(){

    }

    //•	valorAPagar: retornará el valor a cancelar por un calzado, sabiendo que:
    //i.	Si hay Stock: disminuirá el stock en 1 y además, retornará el valor a pagar por el cliente,
    // el cual será: el valor venta menos los descuentos más impuestos (donde corresponda)
    //ii.	Si no hay Stock, retornará -1
    @Override
    public int valorAPagar() {
        int valorAPagar;
        if(this.getProducto().getStock()>0){
            valorAPagar = valorVenta() - descuento() + impuestoEspecifico() + impuestoIVA();
            this.getProducto().setStock(this.getProducto().getStock()-1);
        }else{
            System.out.println("Calzado sin Stock :/");
            valorAPagar = -1;
        }
        return valorAPagar;
    }

    @Override
    public int descuento() { //o	Si el calzado es de hombre y de color es “Rojo” o “Verde el descuento será de un 25%
        int descuento = 0;
        if(this.getColor().equalsIgnoreCase("Rojo") || this.getColor().equalsIgnoreCase("Verde")){
            descuento = this.valorVenta() * 25 / 100;
            return descuento;
        }
        return descuento;
    }


}
