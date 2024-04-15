package C_GestionCientifica;

import java.time.LocalDate;


public class Fecha {
    private LocalDate fecha;
    private String descripcion;

    public Fecha(LocalDate fecha, String descripcion) {
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // Método para comparar fechas, útil para ordenar
    public static int compararPorFecha(Fecha f1, Fecha f2) {
        return f1.getFecha().compareTo(f2.getFecha());
    }
}