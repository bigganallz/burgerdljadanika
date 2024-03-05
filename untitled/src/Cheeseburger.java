public class Cheeseburger extends Burger {
    private String cheese;
    private String price;

    public Cheeseburger(String bulki, String kotleta, String sauce, String green, boolean cheese, double price) {
        super(bulki, kotleta, sauce);
        this.cheese = String.valueOf(cheese);
        this.price = String.valueOf(price);
    }
    public String printinfo(){
        return ("bulki - " + getBulki() + "\n" + "kotleta - " +getKotleta() + "\n" + "sauce - " +getSauce() + "\n" + "cheese - " +cheese + "\n" + "price - " +price + "\n" );
    }
}
