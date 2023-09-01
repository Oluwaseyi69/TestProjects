package ChapterThree;

public class Car {
    private String model;
    private String year;
    private double price;

    public Car(String model, String year, double price){
        this.model = model;
        this.year = year;
        this.price = price;
    }
    public String getModel(){
        return model;
    }
    public String getYear(){
        return year;
    }
    public double getPice(){
        if(price < 0){
        return 0;
    }
        return price;
    }
}
