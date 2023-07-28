package dev.joseluis;

public class IndexMBI {
   
    private int weight;
    private double height;

    public IndexMBI(int weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateMBI() {
        int square = 2;
        double imc = weight / Math.pow(height, square);
        double imcRounded = Math.ceil(imc*100) / 100;
        return imcRounded;
    }
}
