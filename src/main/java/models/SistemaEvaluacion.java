package models;

public class SistemaEvaluacion {


    // SolicitudEvaluacion.java
    public class SolicitudEvaluacion {
        private String solicitante;
        private final String asignatura;
        private String fechaLimite;

        public SolicitudEvaluacion(String solicitante, String asignatura, String fechaLimite) {
            this.solicitante = solicitante;
            this.asignatura = asignatura;
            this.fechaLimite = fechaLimite;
        }

        public String getAsignatura() {
            return asignatura;
        }
    }
}
