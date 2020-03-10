package cl.desafiolatam.perritos.model;

import java.util.List;

public class Pojo {

    protected  String raza;
    protected List<String> subraza;

    public Pojo(String raza, List<String> subraza) {
        this.raza = raza;
        this.subraza = subraza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public List<String> getSubraza() {
        return subraza;
    }

    @Override
    public String toString() {
        return "Pojo{" +
                "raza='" + raza + '\'' +
                ", subraza=" + subraza +
                '}';
    }

    public void setSubraza(List<String> subraza) {
        this.subraza = subraza;
    }
}