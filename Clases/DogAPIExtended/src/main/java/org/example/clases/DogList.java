package org.example.clases;

import java.util.List;

public class DogList {

    private String nombre;
    private List<String> img;

    public DogList(String nombre, List<String> img) {
        this.nombre = nombre;
        this.img = img;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getImg() {
        return img;
    }

    public void setImg(List<String> img) {
        this.img = img;
    }
}
