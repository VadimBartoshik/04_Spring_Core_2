package task1.classes;

import java.util.Objects;

public class D  {
    private String name;
    private int id;
    private boolean isChecked;


    public D(){

    }

    public D(String name, int id, boolean isChecked) {
        this.name = name;
        this.id = id;
        this.isChecked = isChecked;
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

    public boolean getIsChecked() {
        return isChecked;
    }

    public void setIsChecked(boolean checked) {
        isChecked = checked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        D d = (D) o;
        return id == d.id &&
                isChecked == d.isChecked &&
                Objects.equals(name, d.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, isChecked);
    }

    @Override
    public String toString() {
        return "D{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", isChecked=" + isChecked +
                '}';
    }
}
