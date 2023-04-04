package modelo;

public abstract class Formal extends Calzado { //una clase abstracta es una clase de la que no se crean objetos
    private String color;

    public Formal(String diaVenta, int numero, Producto producto, String color) {
        super(diaVenta, numero, producto);
        this.color = color;
    }

    public Formal() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //•	impuestoEspecifico: retornará el valor de impuesto específico
    // el cual es un 7.4% del valor base (el calzado deportivo no paga éste impuesto)
    public int impuestoEspecifico(){
        return (int) Math.round(this.getProducto().getValorBase()*7.4/100);
    }

    /*
    * •	descuento: retornará el valor de descuento que tendrá el calzado, sabiendo que:
o	Si la altura del taco es mayor a 10, el descuento será de un 20% del valor venta
o	Si el calzado es de hombre y de color es “Rojo” o “Verde el descuento será de un 25%
    */


   /* public int descuento(){
        return 0;
    }*/


    //un método abstracto es aquel que se define en una clase, pero se implementa en sus subclases
    //un método abstracto no puede ser invocado desde su clase
    //un método abstracto debera ser sobre escrito por sus subclases
    //un método abstracto pertenece a una clase abstracta
    public abstract int descuento();
    //aqui esta la palabra abstract
    //no tiene cuerpo

}
