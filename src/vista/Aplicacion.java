package vista; //te esta diciendo el package que pertenece la clase :D
//linkea :D
import modelo.Calzado;
import modelo.Deportivo;
import modelo.Producto;
import modelo.Hombre;
import modelo.Mujer;

//Los modificadores de acceso definen el como acceso a las clases/Atributos/metodos
public class Aplicacion { //Define la estructura de la clase

    public static void main(String[] args) {

        Deportivo deportivo = new Deportivo (new Producto("123ABC",100,10000),44,"jf,hgasd,,jg,fsh,adxzklzzfzzydk","Futbol","Cuero");

        Deportivo deportivo2 = new Deportivo();

        Hombre hombre = new Hombre();


        Mujer mujer = new Mujer();



        System.out.println("el valor venta del calzado deportivo durante la "+ deportivo.getDiaVenta() +
                " es: $ "+ deportivo.valorVenta());

    }
}
