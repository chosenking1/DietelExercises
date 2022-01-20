package chapterThree;
//3.13
public class Car {
    private String model;
    private String year;
    private double price;

    public Car(String vehicleModel, String yearMade, double carPrice ){
        model = vehicleModel;
        year = yearMade;
        if (carPrice > 0)
        price = carPrice;
    }

    public void setModel(String vehicleModel){
        model = vehicleModel;
    }

    public void setYear(String yearMade){
        year = yearMade;
    }

    public void setPrice(double carPrice) {
        price = carPrice;
    }

    public String getModel(){
        return model;
    }

    public String getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }
}
