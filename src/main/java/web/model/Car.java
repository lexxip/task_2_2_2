package web.model;

public class Car {

    private static Long COUNT_CARS = 0L;
    private Long id;
    private String brand;
    private String model;
    private String series;

    public Car() {

    }

    public Car(String brand, String model, String series) {
        this.id = ++COUNT_CARS;
        this.brand = brand;
        this.model = model;
        this.series = series;
    }

    public Long getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public  void setSeries(String series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return getId() + " "
                + getBrand() + " "
                + getModel() + " "
                + getSeries();
    }

}
