package cl.matias.fastfood;

import java.io.Serializable;

public class SandwichesPOO implements Serializable {
    private int nombre;
    private int detalle;
    private int precio;
    private int foto;
    private int title;


    public int getNombre() {
        return nombre;
    }

    public int getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "SandwichesPOO{" +
                "nombre=" + nombre +
                ", detalle=" + detalle +
                ", precio=" + precio +
                ", foto=" + foto +
                ", title=" + title +
                '}';
    }

    public void setTitle(int title) {
        this.title = title;
    }

    public SandwichesPOO(int nombre, int detalle, int precio, int foto, int title) {
        this.nombre = nombre;
        this.detalle = detalle;
        this.precio = precio;
        this.foto = foto;
        this.title = title;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public int getDetalle() {
        return detalle;
    }

    public void setDetalle(int detalle) {
        this.detalle = detalle;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

}
