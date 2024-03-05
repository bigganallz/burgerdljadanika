public class Bigmac extends Burger {
    private String green;
    private String cheese;
    private String price;

    public Bigmac(String bulki, String kotleta, String sauce, String green, boolean cheese, double price) {
        super(bulki, kotleta, sauce);
        this.green = green;
        this.cheese = String.valueOf(cheese);
        this.price = String.valueOf(price);
    }

    public String printinfo() {
        return ("bulki - " + getBulki() + "\n" + "kotleta - " + getKotleta() + "\n" + "sauce - " + getSauce() + "\n" + "cheese - " + cheese + "\n" + "green - " + green + "\n" + "price" + price + "\n");

    }
}

