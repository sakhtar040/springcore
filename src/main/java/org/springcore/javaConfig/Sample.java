package org.springcore.javaConfig;

public class Sample {
    private Tuna tuna;

    public void newSample(){
        this.tuna.showTuna();
        System.out.println("New Sample Arrives!!");
    }

    public Tuna getTuna() {
        return tuna;
    }

    public void setTuna(Tuna tuna) {
        this.tuna = tuna;
    }

    public Sample(Tuna tuna) {
        super();
        this.tuna = tuna;
    }
}
