import java.util.Scanner;

public class Application {
    private static Product [] products = new Product[10];
    public static boolean isAplicationFinished = false;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true){
            switch (Menu.showMenu()){
                case 0:
                    return;
                case 1:
                    if(products[0] == null) System.out.println("Товаров в списке нет!");
                    else System.out.printf("%-20s | %-20s | %-20s | %-20s %n", "Название", "Описание", "Цена", "Категория");
                    for (int i = 0; i < products.length; i++) {
                        if(products[i] != null) {

                            System.out.printf("%-20s | %-20s | %-20s | %-25s %n",
                                    products[i].getName(),
                                    products[i].getDescription(),
                                    products[i].getPrice(),
                                    products[i].getProductCategories());
                        }
                    }
                    break;
                case 2:
                    Product product = Menu.creatProduct();
                    for(int i = 0; i < products.length; i++){
                        if(products[i] == null){
                            products[i] = product;
                            break;
                        }
                    }
                    break;
                default:
                    System.out.println("Некорректный вариант");
            }

        }

    }
}
