import java.util.Scanner;
public class Discountonpen {
    public static void main(String[] args){
        double cost_price=50;
        double discount_percent=12;
        double discount_amount=(discount_percent/100)*cost_price;
        double selling_price=cost_price-discount_amount;
        System.out.println("Discount amount is:"+discount_amount);
        System.out.println("Selling price is:"+selling_price);

    }
}
