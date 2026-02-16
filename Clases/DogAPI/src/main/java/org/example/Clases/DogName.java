package org.example.Clases;

import javax.lang.model.element.Name;
import java.util.List;

public class DogName{
    private String name;
    private List<Name> dogNames;
    private String imagen;

    public DogName(String name, List<Name> dogNames, String imagen) {
        this.name = name;
        this.dogNames = dogNames;
        this.imagen = imagen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Name> getDogNames() {
        return dogNames;
    }

    public void setDogNames(List<Name> dogNames) {
        this.dogNames = dogNames;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
