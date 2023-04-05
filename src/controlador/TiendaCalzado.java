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

    public TiendaCalzado(){

    }

    ///Logica de la aplicación

    //Ingresos de calzados (El ingreso puede ser Calzado de mujer, hombre o deportivo y  no puede estar duplicado)


    //{calzado1,calzado2,calzado3}
    //{AAAA    ,AA       ,  AAA}
    //{   0    ,   1    ,  2    }
    public int buscarCalzado(String codigoCalzado){ //AAA
        for(int i=0; i < tienda.size();i++){
            //definir una condición para encontrar el calzado indicado
            if(tienda.get(i).getProducto().getCodigo().compareToIgnoreCase(codigoCalzado)==0){
                //encontro el objeto en la colección
                return i; //2
            }
        }
        return -1; //si retorno -1 el calzado no se encontro en la colección
    }

    //Ingresar calzados de mujer
    public void ingresarCalzadoMujer(Mujer mujer){
        if(buscarCalzado(mujer.getProducto().getCodigo())==-1){
            tienda.add(mujer);
        }
    }

    public void ingresarCalzadoHombre(Hombre hombre){
        if(buscarCalzado(hombre.getProducto().getCodigo())==-1){
            tienda.add(hombre);
        }
    }

    public void ingresarCalzadoDeportivo(Deportivo deportivo){
        if(buscarCalzado(deportivo.getProducto().getCodigo())==-1){
            tienda.add(deportivo);
        }
    }

}
