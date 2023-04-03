package vista; //te esta diciendo el package que pertenece la clase :D
//linkea :D
import modelo.Calzado;
import modelo.Producto;

//Los modificadores de acceso definen el como acceso a las clases/Atributos/metodos
public class Aplicacion { //Define la estructura de la clase

    public static void main(String[] args) {
        //Instanciar un objeto de tipo producto
        //Constructor
        Producto producto = new Producto();
        producto.stock = 100;
        producto.codigo = "123ABC";
        producto.valorBase = 10000;

        Calzado calzado = new Calzado();

        calzado.producto = producto;

        System.out.println("Codigo producto: "+ calzado.producto.codigo);
        System.out.println("Stock producto: "+ calzado.producto.stock);
    }
}
