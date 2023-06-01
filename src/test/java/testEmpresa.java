import org.junit.Assert;
import org.junit.Test;


public class testEmpresa {
    @Test
    public void testAnadirConductor(){
        Empresa  e1 = new Empresa();
        String nombre = "Alberto";
        String apellido = "Rios";
        int num = 12345678;
        String licencian = "qwert123";

        Conductor cQuerido = new Conductor(nombre,apellido,num,licencian);

        Conductor cObtenido = e1.agregarConductor(nombre,apellido,num,licencian);
        Assert.assertEquals(cQuerido.toString(),cObtenido.toString());
    }
    @Test
    public void testValidacion(){
        int num = 6; //suponiendo que el menu va de 1 a 5 y se digita un 6
        boolean esperado = true;
        boolean generado = true;
        if (num >5 || num < 1 ) {
            generado = false;
        }
        Assert.assertEquals(esperado,generado);
    }
}
