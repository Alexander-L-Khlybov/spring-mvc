package web.model;

public class Car {

    private String owner;
    private String model;
    private int series;

    public Car() {

    }

    public Car(String owner, String model, int series) {
        this.owner = owner;
        this.model = model;
        this.series = series;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getOwner() {
        return owner;
    }

    public String getModel() {
        return model;
    }

    public int getSeries() {
        return series;
    }

    @Override
    public String toString() {
        return "Car:" +
                "\towner = " + owner + "\n" +
                "\tmodel = " + model + "\n" +
                "\tseries = " + series + "\n";
    }
}
