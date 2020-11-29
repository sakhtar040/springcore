package org.springcore.ref;

public class A {
    private String x;
    private B ob;

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public B getOb() {
        return ob;
    }

    public void setOb(B ob) {
        this.ob = ob;
    }

    public A() {
        super();
    }

    @Override
    public String toString() {
        return "A{" +
                "x='" + x + '\'' +
                ", ob=" + ob +
                '}';
    }
}
