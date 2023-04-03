package modelo;

public class Mujer extends Formal {
    //Atributos
    private int alturaTaco;

    //Métodos
    public Mujer(String diaVenta, int numero, Producto producto, String color, int alturaTaco) {
        super(diaVenta, numero, producto, color);
        this.alturaTaco = alturaTaco;
    }

    public Mujer(){
        super();
    }

    public int getAlturaTaco() {
        return alturaTaco;
    }

    public void setAlturaTaco(int alturaTaco) {
        this.alturaTaco = alturaTaco;
    }
}
