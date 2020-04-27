package task1.classes;

import java.util.Objects;

public class C {
    private String name;
    private int id;
    private boolean isChecked;
    private D child;

    public C(){
    }

    public C(String name, int id, boolean isChecked, D child) {
        this.name = name;
        this.id = id;
        this.isChecked = isChecked;
        this.child = child;
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

    public D getChild() {
        return child;
    }

    public void setChild(D child) {
        this.child = child;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        C c = (C) o;
        return id == c.id &&
                isChecked == c.isChecked &&
                Objects.equals(name, c.name) &&
                Objects.equals(child, c.child);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, isChecked, child);
    }

    @Override
    public String toString() {
        return "C{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", isChecked=" + isChecked +
                ", child=" + child +
                '}';
    }
}
