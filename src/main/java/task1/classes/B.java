package task1.classes;

import java.util.Objects;

public class B {
    private String name;
    private int id;
    private boolean isChecked;
    private A parentBean;

    public B(){

    }

    public B(String name, int id, boolean isChecked, A parentBean) {
        this.name = name;
        this.id = id;
        this.isChecked = isChecked;
        this.parentBean = parentBean;
    }


    public A getParentBean() {
        return parentBean;
    }

    public void setParentBean(A parentBean) {
        this.parentBean = parentBean;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        B b = (B) o;
        return id == b.id &&
                isChecked == b.isChecked &&
                Objects.equals(name, b.name) &&
                Objects.equals(parentBean, b.parentBean);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, isChecked, parentBean);
    }

    @Override
    public String toString() {
        return "B{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", isChecked=" + isChecked +
                ", parentBean=" + parentBean +
                '}';
    }
}
