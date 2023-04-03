package modelo;

public class Producto {
    private String codigo;
    private int stock;
    private int valorBase;

    public Producto(String codigo, int stock, int valorBase) {
        this.codigo = codigo;
        this.stock = stock;
        this.valorBase = valorBase;
    }

    public Producto() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getValorBase() {
        return valorBase;
    }

    public void setValorBase(int valorBase) {
        this.valorBase = valorBase;
    }
}
