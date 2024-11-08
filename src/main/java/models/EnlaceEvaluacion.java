package models;
import java.util.ArrayList;
import java.util.List;

public class EnlaceEvaluacion {

    // EnlaceEvaluacion.java
    private String enlace;
    private List<String> asignaturas;

    public EnlaceEvaluacion(String enlace) {
        this.enlace = enlace;
        this.asignaturas = new ArrayList<>();
    }

    public void agregarAsignatura(String asignatura) {
            this.asignaturas.add(asignatura);
    }

    public List<String> getAsignaturas() {
            return asignaturas;
    }
}

