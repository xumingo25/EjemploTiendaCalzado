package vista; //te esta diciendo el package que pertenece la clase :D
//linkea :D
import modelo.Deportivo;
import modelo.Producto;
import modelo.Hombre;
import modelo.Mujer;

//Los modificadores de acceso definen el como acceso a las clases/Atributos/metodos
public class smoke_tests { //Define la estructura de la clase

    public static void smoke_test(String[] args) {

            Deportivo deportivo2 = new Deportivo();
            Deportivo deportivo = new Deportivo (new Producto("123ABC",100,10000),44,"Fin de semana","Futbol","Cuero");



            Hombre hombre = new Hombre(new Producto("222AAA",10,200000), "Fin de semana",43,"VERDE");

            Mujer mujer = new Mujer(new Producto("222AAA",10,200000), "Fin de semana",43,"Negro",12);;

            System.out.println("El impuesto especifico del calzado de hombre es: $"+hombre.impuestoEspecifico());
            System.out.println("El impuesto especifico del calzado de mujer es: $"+mujer.impuestoEspecifico());


            System.out.println("el valor venta del calzado deportivo durante la "+ deportivo.getDiaVenta() +
                    " es: $ "+ deportivo.valorVenta());

            System.out.println("el valor venta del calzado hombre durante la "+ hombre.getDiaVenta() +
                    " es: $ "+ hombre.valorVenta());

            System.out.println("el valor venta del calzado mujer durante la "+ mujer.getDiaVenta() +
                    " es: $ "+ mujer.valorVenta());

            System.out.println("el impuesto al iva del calzado deportivo es: $ "+ deportivo.impuestoIVA());

            System.out.println("Descuento calzado Hombre: $"+hombre.descuento());

            System.out.println("Descuento calzado Mujer: $"+mujer.descuento());
    }
}
