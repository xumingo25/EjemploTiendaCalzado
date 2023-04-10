package controlador;

import modelo.Calzado;
import modelo.Deportivo;
import modelo.Hombre;
import modelo.Mujer;

import javax.rmi.CORBA.Tie;
import java.util.ArrayList;

public class TiendaCalzado {
    //Atributos
    private ArrayList<Calzado> tienda; //{calzado1,calzado2,calzado3}

    //Métodos
    public ArrayList<Calzado> getTienda() {
        return tienda;
    }

    public void setTienda(ArrayList<Calzado> tienda) {
        this.tienda = tienda;
    }

    public TiendaCalzado(ArrayList<Calzado> tienda) {
        this.tienda = tienda;
    }

    public TiendaCalzado() {

    }

    ///Logica de la aplicación

    //Ingresos de calzados (El ingreso puede ser Calzado de mujer, hombre o deportivo y  no puede estar duplicado)


    //{calzado1,calzado2,calzado3}
    //{AAAA    ,AA       ,  AAA}
    //{   0    ,   1    ,  2    }
    public int buscarCalzado(String codigoCalzado) { //AAA
        for (int i = 0; i < tienda.size(); i++) {
            //definir una condición para encontrar el calzado indicado
            if (tienda.get(i).getProducto().getCodigo().compareToIgnoreCase(codigoCalzado) == 0) {
                //encontro el objeto en la colección
                return i; //2
            }
        }
        return -1; //si retorno -1 el calzado no se encontro en la colección
    }

    //Ingresar calzados de mujer
    public void ingresarCalzadoMujer(Mujer mujer) {
        if (buscarCalzado(mujer.getProducto().getCodigo()) == -1) {
            tienda.add(mujer);
        }
    }

    public void ingresarCalzadoHombre(Hombre hombre) {
        if (buscarCalzado(hombre.getProducto().getCodigo()) == -1) {
            tienda.add(hombre);
        }
    }

    public void ingresarCalzadoDeportivo(Deportivo deportivo) {
        if (buscarCalzado(deportivo.getProducto().getCodigo()) == -1) {
            tienda.add(deportivo);
        }
    }


    //2.	Mostrar sólo los calzado de mujer
    //En opción 2, debe mostrar Día de venta, altura de taco y descuento.

    //{calzado1  ,calzado2    ,calzado3}
    //{Hombre    ,Mujer       ,  Mujer}
    //{   0    ,   1    ,  2    }
    public String calzadosMujer() {
        String mensaje = "";
        Mujer mujer = null;
        int contador = 0;
        for (int i = 0; i < tienda.size(); i++) { //iterar en la colección
            if (tienda.get(i) instanceof Mujer) { //es un calzado de mujer
                mujer = (Mujer) tienda.get(i);

                mensaje = mensaje + "\n dia de venta: " + mujer.getDiaVenta() + ", altura de taco: " + mujer.getAlturaTaco() +
                        " y descuento: $" + mujer.descuento();
                contador++;
            }

        }

        if (contador == 0) {
            mensaje = "no hay calzados de mujer :/";
        }
        return mensaje;
    }


    //3.	Valor Venta
    //En Valor Venta mostrará el valor Venta y número del calzado de uno en particular.
    public String valorVenta(String codigo) {
        String mensaje = "";
        for (int i = 0; i < tienda.size(); i++) { //iterar en la colección
            if (tienda.get(i).getProducto().getCodigo().compareToIgnoreCase(codigo) == 0) {
                //lo encontre
                return "El valor venta del calzado es: $" + tienda.get(i).valorVenta() + " y el nro del calzado es talla: " +
                        tienda.get(i).getNumero();
            }
        }

        return "El codigo " + codigo + " no esta asociado a ningun calzado :/";
    }

    //{calzado1  ,calzado2    ,calzado3  }
    //{Hombre    ,Mujer       ,  Mujer   }
    //{ 10000    , 1432423    ,  2234234 } valor
    //{ 20       , 5          ,  6       } stock
    public int calzadosTOP() {
        int suma = 0;

        for (int i = 0; i < tienda.size(); i++) { //iterar en la colección
            if(tienda.get(i).valorVenta() > 80000){
                suma = suma + tienda.get(i).getProducto().getStock();
            }
        }
        return suma;
    }


    //5.	Total Impuesto Especifico
    //En opción 5 mostrará el total de impuesto específico si se vendieran todos los calzados
    public int totalImpuestoEspeficico(){
        int total = 0;
        Mujer mujer = null;
        Hombre hombre = null;

        for (int i = 0; i < tienda.size(); i++) { //iterar en la colección
            if(tienda.get(i) instanceof Mujer){
                mujer = (Mujer) tienda.get(i);
                total = total + (mujer.impuestoEspecifico()*mujer.getProducto().getStock());

            }else if(tienda.get(i) instanceof Hombre){
                hombre = (Hombre) tienda.get(i);
                total = total + (hombre.impuestoEspecifico()*hombre.getProducto().getStock());
            }
        }
            return total;
        }




        //6.	Total descuento
        //En Total descuento mostrará el total de descuento en toda la tienda
        public int totalDescuentos(){
            int total = 0;
            Mujer mujer = null;
            Hombre hombre = null;

            for (int i = 0; i < tienda.size(); i++) { //iterar en la colección
                if(tienda.get(i) instanceof Mujer){
                    mujer = (Mujer) tienda.get(i);
                    total = total + (mujer.descuento()*mujer.getProducto().getStock());

                }else if(tienda.get(i) instanceof Hombre){
                    hombre = (Hombre) tienda.get(i);
                    total = total + (hombre.descuento()*hombre.getProducto().getStock());
                }
            }
            return total;
        }
}