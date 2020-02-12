package com.app.uabc.main;

public class Persona {

    private  String nombre;
    private Integer edad;
    private  boolean otaku;
    private Integer diasVivo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public boolean isOtaku() {
        return otaku;
    }

    public void setOtaku(boolean otaku) {
        this.otaku = otaku;
    }

    public Integer getDiasVivo() {
        return diasVivo;
    }

    public void setDiasVivo(Integer diasVivo) {
        this.diasVivo = diasVivo;
    }
}
