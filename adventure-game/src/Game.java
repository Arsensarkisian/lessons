import java.util.Scanner;
public class Game {
    static boolean isGameFinished = false;

    static int showMenu(){
        Scanner in = new Scanner(System.in);
        System.out.println("1. Перейти в другую комнату;\n2. Показать инвентарь\n0. Выход.");
        return in.nextInt();
    }
    static int showRooms(Room [] rooms){
        Scanner in = new Scanner(System.in);
        System.out.println("Выбрите номер комнаты:");
        for(int i = 0; i < rooms.length; i++){
            System.out.print(i+1 + "." + rooms[i].name + " ");
        }
        System.out.println();
        return in.nextInt();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Bathroom bathroom = new Bathroom("Ванная комната","Обычный совмещенный санузел");
        Bedroom bedroom = new Bedroom("Спальня","Просторная спальня с двуспальной кроватью");
        Kitchen kitchen = new Kitchen("Кухня","Большая кухня с совмещенной столовой");
        Room [] rooms = {bathroom,bedroom,kitchen};
        System.out.println("Добро пожаловать в игру Дом, твоя цель - найти выход из дома");
        Player player = new Player();
        System.out.println("Введите свое имя");
        player.name = in.nextLine();
        System.out.println("Ваше имя " + player.name);

        while (true){
            if(isGameFinished){
                System.out.println("Поздравляем, вы победили!");
                break;

            }
            switch (showMenu()){
                case 0:
                    isGameFinished = true;
                    break;
                case 1:
                    int i = showRooms(rooms);
                    player.setCurrentRoom(rooms[i-1]);
                    break;
                case 2:
                    player.showItems(player.inventory);
                    break;
            }

        }


    }

}
