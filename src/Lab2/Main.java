package Lab2;

import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world!");
        stockItem milk = new stockItem("1 Gallon of Milk", 3.60f, 15);
        stockItem bread = new stockItem("1 Loaf of Bread", 1.98f, 30);

        Scanner read = new Scanner(System.in);
        int n;
        boolean stop = true;
        while(stop) {
            System.out.println("1. Sold One Milk\n2. Sold One Bread\n3. Change price of Milk\n4. Change price of Bread\n5. Add Milk to Inventory\n6. Add Bread to Inventory\n7. See Inventory\n8. Quit");
            n = read.nextInt();
            switch (n) {
                case 1:
                    milk.lowerQuantity(1);
                    break;
                case 2:
                    bread.lowerQuantity(1);
                    break;
                case 3:
                    System.out.println("What will be the new price?");
                    float f = read.nextFloat();
                    milk.setPrice(f);
                    break;
                case 4:
                    System.out.println("What will be the new price?");
                    float l = read.nextFloat();
                    bread.setPrice(l);
                    break;
                case 5:
                    System.out.println("What is the new quantity?");
                    int x = read.nextInt();
                    milk.raiseQuantity(x);
                    break;
                case 6:
                    System.out.println("What is the new quantity?");
                    int e = read.nextInt();
                    bread.raiseQuantity(e);
                    break;
                case 7:
                    System.out.println(milk.toString());
                    System.out.println(bread.toString());
                    break;
                case 8:
                    stop = false;
                    break;

            }

        }
    }
}

class stockItem{
    String descripiton;
    int id;
    float price;
    int quantity;

    stockItem(){
        Random rand = new Random();
        id = rand.nextInt(100);
        descripiton= "";
        price = 0.0f;
        quantity = 0;

    }
    stockItem(String d, float p, int q){
        descripiton = d;
        price = p;
        quantity = q;
        Random rand = new Random();
        id = rand.nextInt(100);
    }

   public String toString(){
        return (this.descripiton + ", ID: " + this.id+ ", Price $" + this.price+", Quantity:" + this.quantity);
    }


    public String getDescripiton() { return descripiton;}
    public int getId(){return id;}
    public int getQuantity() {return quantity;}
    public float getPrice(){ return price;}

    public void setPrice(float p){
        if(p <=0){
            System.out.println("Error");
        }else{
            this.price = p;
        }
    }
    public void lowerQuantity(int q){
        if(q <= 0){
            System.out.println("Error");
        }else{
            this.quantity -= q;
        }
    }
    public void raiseQuantity(int q){
        this.quantity += q;

    }

}
