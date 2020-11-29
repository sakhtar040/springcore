package org.springcore.ref;

public class B {
    private String y;

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public B() {
        super();
    }

    @Override
    public String toString() {
        return "B{" +
                "y='" + y + '\'' +
                '}';
    }
}
