package vista;

import controlador.TiendaCalzado;
import modelo.Deportivo;
import modelo.Hombre;
import modelo.Mujer;
import modelo.Producto;

import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacion {
    public static void main(String[] args) {
        TiendaCalzado tienda = new TiendaCalzado(new ArrayList<>());

        /*
        Deportivo deportivo = new Deportivo (new Producto("123ABC",100,10000),44,"Fin de semana","Futbol","Cuero");

        Hombre hombre = new Hombre(new Producto("222AAA",10,200000), "Fin de semana",43,"VERDE");

        Mujer mujer = new Mujer(new Producto("222AAA",10,200000), "Fin de semana",43,"Negro",12);;

        tienda.ingresarCalzadoDeportivo(deportivo);
        tienda.ingresarCalzadoHombre(hombre);
        tienda.ingresarCalzadoMujer(mujer); */

        int opcion;
        do{
                opcion = menu();
                switch(opcion){
                    case 1:
                        System.out.println("Ingreso Calzados");
                        break;
                    case 2:
                        System.out.println("Mostrar Calzados Mujer");
                        break;
                    case 3:
                        System.out.println("Valor Venta");
                        break;
                    case 4:
                        System.out.println("Calzados top");
                        break;
                    case 5:
                        System.out.println("Total Impuesto Especifico");
                        break;
                    case 6:
                        System.out.println("Total descuento");
                        break;
                }

            }while(opcion !=7); //repetir


    }

    public static int menu(){
        System.out.println("**********Tienda Calzados BC12 V1.Algo :D *********");
        System.out.println("1.\tIngresar ");
        System.out.println("2.\tMostrar sólo los calzado de mujer");
        System.out.println("3.\tValor Venta");
        System.out.println("4.\tCalzados top");
        System.out.println("5.\tTotal Impuesto Especifico");
        System.out.println("6.\tTotal descuento");
        System.out.println("7.\tSalir");
        System.out.println("Favor ingrese opción para continuar...");

        return Leer.datoInt();
    }

    public static String pedirCodigo(){
        System.out.println("Favor ingrese codigo del calzado (Ej: 123ABC)");
        return Leer.dato();
    }


}
