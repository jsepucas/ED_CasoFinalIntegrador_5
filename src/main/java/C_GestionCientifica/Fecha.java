package C_GestionCientifica;

import java.time.LocalDate;


public class Fecha {
    private LocalDate fecha;
    private String descripcion;

    public Fecha(LocalDate fecha, String descripcion) {
        this.fecha = fecha;
        this.descripcion = descripcion;
    }
