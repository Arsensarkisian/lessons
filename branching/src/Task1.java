public class Task1 {
    public static void main(String[] args) {
        int result = 2;
        if (result >= 1 && result <= 25){
            System.out.println("Bad");
        } else if (result >= 26 && result <= 50) {
            System.out.println("Below average");
        } else if (result >= 51 && result <= 75) {
            System.out.println("Above average");
        } else if (result >= 76 && result <= 100) {
            System.out.println("Excellent");
        }
        else {
            System.out.println("Error");
        }
    }
}
