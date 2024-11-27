public class Task2 {
    public static void main(String[] args) {
        double price = 400.0;
        int discount = 20;
        double endPrice;
        double disPrice = price * discount / 100;
        endPrice = price - disPrice;
        System.out.println(endPrice);

    }
}
