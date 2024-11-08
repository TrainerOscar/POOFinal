package models;

public class ResultadoEvaluacion {

    // ResultadoEvaluacion.java

        private String asignatura;
        private int participantes;
        private double calificacionPromedio;

        public ResultadoEvaluacion(String asignatura, int participantes, double calificacionPromedio) {
            this.asignatura = asignatura;
            this.participantes = participantes;
            this.calificacionPromedio = calificacionPromedio;
        }

        public double getCalificacionPromedio() {
            return calificacionPromedio;
        }
    }

