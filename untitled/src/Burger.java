public class Burger {
    private String bulki;
    private String kotleta;
    private String sauce;


    public Burger(String bulki, String kotleta, String sauce){
        this.bulki = bulki;
        this.kotleta = kotleta;
        this.sauce = sauce;

    }

    public String getBulki() {
        return bulki;
    }

    public void setBulki(String bulki) {
        this.bulki = bulki;
    }

    public String getKotleta() {
        return kotleta;
    }

    public void setKotleta(String kotleta) {
        this.kotleta = kotleta;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }
}
