package prueba;
import org.junit.jupiter.api.Test;
import models.ResultadoEvaluacion;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ResultadoEvaluacionTest {

    @Test
    public void testCalificacionPromedio() {
        ResultadoEvaluacion resultado = new ResultadoEvaluacion("Programación", 25, 8.7);

        // Verificar que la calificación promedio es correcta
        assertEquals(8.7, resultado.getCalificacionPromedio());
    }
}

