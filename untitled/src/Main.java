import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner jopa = new Scanner(System.in);
        System.out.println("Choose burger type");
        System.out.println("1 - Hamburger");
        System.out.println("2 - Cheeseburger");
        System.out.println("3 - Bigmac");
        int type = jopa.nextInt();
        ArrayList <Burger> burgers = new ArrayList<>();
        Hamburger x = new Hamburger("grilled", "beef", "ketchup", "pickles",  1 );
        Cheeseburger y = new Cheeseburger("grilled", "beef", "ketchup", "salat", true,  2);
        Bigmac z = new Bigmac("grilled", "double beef", "special",  "salat", true,  3);
        if(type==1){
            System.out.println("Chosen burger - Hamburger");
           burgers.add(x);
            System.out.println("would you like to get a drink? 0=no, 1=yes \n");

            } else if (type == 2) {
            System.out.println(" Chosen burger - Cheeseburger");
            burgers.add(y);
            System.out.println("Would you like to get a drink? 0=no, 1=yes \n");
        } else if (type == 3) {
            System.out.println("Chosen burger - Bigmac");
            burgers.add(z);
            System.out.println("Would you like to get a drink? 0=no, 1=yes \n");

            }
        String str = "";
        Iterator zhop2 = burgers.iterator();

        while (zhop2.hasNext()) {
            Burger h = (Burger)zhop2.next();
            str = str + "Choose burger type! \n";
            str = str + "1 - Hamburger\n";
            str = str + "2 - Cheeseburger\n";
            str = str + "3 - Bigmac\n";
            int drink = jopa.nextInt();
           if (type == 1){
               str = str + "Chosen burger - Hamburger\n";
               str = str + x.printinfo();
           } else if (type == 2) {
               str = str + "Chosen burger - Cheesegurger\n";
               str = str + y.printinfo();

           } else if (type == 3) {
               str = str + "Chosen burger - Bigmac\n";
               str = str + z.printinfo();

           }
           str = str + " Would you like to get a drink? 0=no, 1=yes \n";
            int price = 0;
           if (drink==0) {
               price = 0;
               str = str + "Drink price is " + price + "\n";
           } else if (drink==1) {
               price = 1;
               str = str + "Drink price is " + price + "\n";

           } else {
               str = str + "you wrote wrong number\n";
           }
            System.out.println("Accept your order, press 1 - agree, press 2 - decline\n");
            str = str + "Accept your order, press 1 - agree, press 2 - decline\n";
            int l = jopa.nextInt();
            if (l==1) {
                str = str + "Thank you, please wait for your order!" + "\n";
            } else {
                str = str + "Come again!" + "\n";
            }

        }
        System.out.println(str);
        try {
            FileWriter fw = new FileWriter("buger.txt", true);
            fw.write(str);
            fw.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}