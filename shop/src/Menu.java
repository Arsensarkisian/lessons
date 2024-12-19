import java.util.Scanner;

public class Menu {

    public static int showMenu(){
        Scanner in = new Scanner(System.in);
        System.out.println("1. Показать все товары;\n2. Создать продукт \n0. Выход.");
        int choice = in.nextInt();
        if(choice < 0 || choice > 2){
            System.out.println("Некорректный вариант. Выбирете команду еще раз");
            showMenu();
        }
        return choice;
    }

    public static Product creatProduct(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите информацию о товаре!");
        System.out.print("Введите название продукта: ");
        String name = in.next();
        System.out.print("Введите описание продукта: ");
        String description = in.next();

        //------------Цена продукта-----------------

        System.out.print("Введите цену продукта: ");
        int price = 0;
        boolean isPriceValid = false;
        while (!isPriceValid){
            try {
                price = Integer.parseInt((in.next()));
                if(price < 0) System.out.println("Ошибка: Цена не может быть отрицательной");
                else isPriceValid = true;
            }
            catch (NumberFormatException e){
                System.out.println("Ошибка: Введите коректное число");
            }
        }

        //------------Категория продукта-----------------

        System.out.print("Введите категорию продукта: ");
        boolean isCategorieValid = false;
        String categorieInput;
        Categories category = null;
        while (!isCategorieValid){
            try {
                categorieInput = in.next().trim().toUpperCase();
                category = Categories.valueOf(categorieInput);
                isCategorieValid = true;
            }
            catch (IllegalArgumentException e){
                System.out.println("Ошибка: такой категории не существует");
            }
        }

        return new Product(name,description,price,category);
    }
}
