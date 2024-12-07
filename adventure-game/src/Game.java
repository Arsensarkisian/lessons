import java.util.Scanner;
public class Game {
    static boolean isGameFinished = false;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Bathroom bathroom = new Bathroom("Ванная комната","Обычный совмещенный санузел");
        Bedroom bedroom = new Bedroom("Спальня","Просторная спальня с двуспальной кроватью");
        Kitchen kitchen = new Kitchen("Кухня","Большая кухня с совмещенной столовой");

        System.out.println("Добро пожаловать в игру Дом, твоя цель - найти выход из дома");
        Player player = new Player();
        System.out.println("Введите свое имя");
        player.name = in.nextLine();
        System.out.println("Ваше имя " + player.name);

        System.out.printf("название комнаты - %s, описание - %s \n", bathroom.name,bathroom.description);
        System.out.printf("название комнаты - %s, описание - %s \n", bedroom.name,bedroom.description);
        System.out.printf("название комнаты - %s, описание - %s \n", kitchen.name,kitchen.description);
    }
}
