package Week13;

import java.util.Arrays;

public class PhoneTask {
    private String brand, model, size, color;
    private  double price;

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {

        return model;
    }

    public String getBrand() {
        return brand;
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        if(price <= 0){
            System.out.println("Invalid price: " + price);
            System.exit(1);
        }
        return price;
    }

    public String getColor() {
        String[] colors = {"Black", "White","Silver","Gold", "Pink"};
        if( Arrays.asList(colors).contains(color)){
            this.color = color;
        }else{
            System.err.println("Invalid color: "+color+"\n color of the phone can only be: "+ Arrays.toString(colors));
            System.exit(1);


        }

         return color;
    }
}
