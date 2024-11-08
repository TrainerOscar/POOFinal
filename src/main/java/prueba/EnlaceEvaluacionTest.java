package prueba;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import  models.EnlaceEvaluacion;



public interface EnlaceEvaluacionTest {

    // EnlaceEvaluacionTest.java
    public class pruebita{

        @Test
        public void testAgregarAsignatura() {
            EnlaceEvaluacion enlace = new EnlaceEvaluacion("http://example.com/evaluacion");

            // Agregar una asignatura y verificar si se agregó correctamente
            enlace.agregarAsignatura("Matemáticas");
            enlace.agregarAsignatura("Física");

            assertEquals(2, enlace.getAsignaturas().size());
            assertTrue(enlace.getAsignaturas().contains("Matemáticas"));
            assertTrue(enlace.getAsignaturas().contains("Física"));
        }
    }
}
