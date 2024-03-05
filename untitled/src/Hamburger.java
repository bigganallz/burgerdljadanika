public class Hamburger extends Burger {
    private String green;
    private String price;

    public Hamburger(String bulki, String kotleta, String sauce, String green, double price) {
        super(bulki, kotleta, sauce);
        this.green = green;
        this.price = String.valueOf(price);

    }

    public String printinfo() {
        return ("bulki - " + getBulki() + "\n" + "kotleta - " + getKotleta() + "\n" + "sauce - " + getSauce() + "\n" + "green - " + green + "\n" + "price" + price + "\n");
    }
}