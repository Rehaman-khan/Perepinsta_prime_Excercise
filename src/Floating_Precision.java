public class Floating_Precision {
    public static void main (String[]args){
        float petrol_quantity;
        float diesel_quantity;
        double petrol_quantity1;
        double diesel_quantity1;
        float petrol_price= 84.1f;
        float diesel_price= 74.19f;
        float wallet_balance=1546.79f;
        petrol_quantity=wallet_balance/petrol_price;
        diesel_quantity=wallet_balance/diesel_price;
        System.out.println("the quantity of petrol we can buy using  wallet balance " + petrol_quantity);
        System.out.println("the quantity of diesel  we can buy using  wallet balance " + diesel_quantity);

    }
}
