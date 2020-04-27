package task1.classes;

import java.util.Objects;

public class F {
    private String name;
    private int id;

    public F() {
    }

    public F(String name, int id) {
        this.name = name;
        this.id = id;
        System.out.println("Constructor of class F");
    }


    public void initMethod(){
        System.out.println("Init-method doing");
    }

    public void destroyMethod(){
        System.out.println("destroy-method doing");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        F f = (F) o;
        return id == f.id &&
                Objects.equals(name, f.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "F{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
