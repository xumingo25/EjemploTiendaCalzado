package vista;

import controlador.TiendaCalzado;
import modelo.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacion {
    public static void main(String[] args) {
        TiendaCalzado tienda = new TiendaCalzado(new ArrayList<>());
        String codigo;
        //Deportivo deportivo = new Deportivo (new Producto("123ABC",100,10000),44,"Fin de semana","Futbol","Cuero");

        //Hombre hombre = new Hombre(new Producto("222AAA",5,10000), "Fin de semana",43,"verde");

        //Mujer mujer = new Mujer(new Producto("33AAA",5,10000), "Fin de semana",36,"Negro",11);

        //tienda.ingresarCalzadoDeportivo(deportivo);
        //tienda.ingresarCalzadoHombre(hombre);
        //tienda.ingresarCalzadoMujer(mujer);

        int opcion;
        do{
                opcion = menu();
                switch(opcion){
                    case 1:
                        codigo = pedirCodigo(); //solicito el codigo

                        if(tienda.buscarCalzado(codigo) == -1){
                            //no existe
                            System.out.println("Favor ingrese el stock del calzado");
                            int stock = Leer.datoInt();

                            System.out.println("Favor ingrese el valor base del calzado");
                            int valorBase = Leer.datoInt();

                            String diaVenta;
                            do{ // itera siempre que la condición de true
                                System.out.println("¿Favor ingrese dia venta (Semana o fin de semana) ?"); //Fin de semana
                                diaVenta=Leer.dato();
                            }while(diaVenta.compareToIgnoreCase("Semana") != 0 && //true
                                    diaVenta.compareToIgnoreCase("Fin de semana") != 0); //false  ---false

                            System.out.println("Favor ingrese el numero del calzado");
                            int numero = Leer.datoInt();

                            int respuesta;
                            do{
                                System.out.println("El calzado es:   1) Deportivo     2)Hombre      3)Mujer");
                                System.out.println("Favor ingrese opción para continuar...");
                                respuesta = Leer.datoInt(); //2
                            }while(respuesta < 1 || respuesta > 3 );
                            //false       ||  false   ---- false /se sale


                            if(respuesta==1){
                                //calzado deportivo
                                System.out.println("Favor ingrese el tipo de deporte"); String tipoDeporte = Leer.dato();

                                String material;
                                do{ // itera siempre que la condición de true
                                    System.out.println("¿Favor ingrese material (Cuero o Lona) ?"); //
                                    material=Leer.dato();
                                }while(material.compareToIgnoreCase("Cuero") != 0 && //true
                                        material.compareToIgnoreCase("Lona") != 0); //false  ---false

                                Producto prod = new Producto(codigo,stock,valorBase); //instacio el producto
                                Deportivo deportivo = new Deportivo(prod,numero,diaVenta,tipoDeporte,material); //intancio el calzado deportivo

                                tienda.ingresarCalzadoDeportivo(deportivo);

                                System.out.println("Se agrega calzado deportivo con exito :D");

                            }else{
                                //Hombre o Mujer
                                //pediremos el color

                                System.out.println("Favor ingrese color del calzado..."); String color = Leer.dato();
                                if(respuesta==2){
                                    //hombre
                                    tienda.ingresarCalzadoHombre(
                                            new Hombre(new Producto(codigo,stock,valorBase),diaVenta,numero,color));
                                    System.out.println("Se agrega calzado de hombre con exito :D");

                                }else{
                                    //mujer
                                    System.out.println("Favor ingrese altura de taco"); int alturaTaco = Leer.datoInt();


                                    tienda.ingresarCalzadoMujer(
                                            new Mujer(
                                                    new Producto(codigo,stock,valorBase),
                                                    diaVenta,numero,color,alturaTaco));

                                    System.out.println("Se agrega calzado de mujer con exito :D");

                                }
                            }

                        }else{
                            System.out.println("El calzado codigo "+ codigo + "ya esta registrado");
                        }

                        break;
                    case 2:
                        if(tienda.getTienda().size()==0){
                            System.out.println("No hay calzados :/");
                        }else{
                            System.out.println(tienda.calzadosMujer());
                        }
                        break;
                    case 3:
                        if(tienda.getTienda().size()==0){
                            System.out.println("No hay calzados :/");
                        }else{
                            String codigoSolicitado;
                            codigoSolicitado = pedirCodigo();

                            System.out.println(tienda.valorVenta(codigoSolicitado));
                        }
                        break;
                    case 4:
                        if(tienda.getTienda().size()==0){
                            System.out.println("No hay calzados :/");
                        }else{
                            System.out.println("Tienes "+ tienda.calzadosTOP() + " calzadop TOP (valor mayor a $80.000)");
                        }
                        break;
                    case 5:
                        if(tienda.getTienda().size()==0){
                            System.out.println("No hay calzados :/");
                        }else{
                            System.out.println("Tienes un total de $"+tienda.totalImpuestoEspeficico() + " en impuestos especificos " +
                                    "si se vendieran todos los calzados");
                        }
                        break;
                    case 6:
                        if(tienda.getTienda().size()==0){
                            System.out.println("No hay calzados :/");
                        }else{
                            System.out.println("Tienes un total de $"+tienda.totalDescuentos() + " en descuentos " +
                                    "si se vendieran todos los calzados");
                        }
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
