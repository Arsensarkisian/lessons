public class Task2 {
    public static void main(String[] args) {
        double yearIncome = 1420000;
        String name = "Bank";
        double discount = 0;
        double taxMoney = 0;
        if(yearIncome < 250000){
            discount = 10;
        } else if (yearIncome >= 250000 && yearIncome <= 499999) {
            discount = 15;
        } else if (yearIncome >= 500000) {
            discount = 18;
        }
        System.out.println("Налог на сумму " + yearIncome + " для отрасли " + name + " составляет " + yearIncome * discount / 100 + ". Это составляет " + discount + " процентов");
    }
}
