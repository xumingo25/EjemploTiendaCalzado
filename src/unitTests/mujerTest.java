package unitTests;

import modelo.Mujer;
import modelo.Producto;
import org.junit.*;

public class mujerTest {

    @BeforeClass
    public static void preparacionClase(){
        System.out.println("Preparando ejecución de pruebas unitarias....");
        // logica de  preparación para ejecutar las pruebas
    }

    @AfterClass
    public static void posEjecucionClase(){
        System.out.println("Terminando ejecución de pruebas unitarias....preparando informe resultados");
        //logica para el armado del reporte o capturas
    }

    static int contador=0;
    @Before
    public void precondicionesTests(){
        //tendriamos la preparación de los tests (instanciar objetos que usen los test)
        contador++;
        System.out.println("Ejecución CP Unitario "+contador);
    }

    @After
    public void poscondicionesTests(){
        //aqui podriamos limpiar los datos de los objetos instanciados para que se vuelvan a settear en el siguiente test
        System.out.println("Ejecución CP unitario "+contador);
    }

    Mujer mujer;
    @Test
    public void descuentoTestOK(){
        System.out.println("Ejecución CP Unitario descuentoTestOK");
        mujer = new Mujer(new Producto("33AAA",5,10000), "Fin de semana",36,"Negro",11);
        int resultadoEsperado = 2480;

        Assert.assertEquals(resultadoEsperado,mujer.descuento());
    }

    @Test
    public void test03(){
        Assert.assertTrue(true);
    }

    @Test
    public void test04(){
        Assert.assertTrue(false);
    }

    @Test
    public void test05(){
        Assert.assertTrue(false);
    }

    @Test
    public void descuentoTestNOOK(){
        System.out.println("Ejecución CP Unitario descuentoTestNOOK");
        mujer = new Mujer(new Producto("33AAA",5,10000), "Fin de semana",36,"Negro",9);
        int resultadoEsperado = 0;

        Assert.assertEquals(resultadoEsperado,mujer.descuento());
    }






}
