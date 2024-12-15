import java.util.Scanner;
public class Game {
    public static boolean isGameFinished = false;

    private static int showMenu(){
        Scanner in = new Scanner(System.in);
        System.out.println("1. Перейти в другую комнату;\n2. Показать инвентарь\n0. Выход.");
        int choice = in.nextInt();
        if(choice < 0 || choice > 2){
            System.out.println("Некорректный вариант. Выбирете команду еще раз");
            showMenu();
        }
            return choice;
        }

    private static int showRooms(Room [] rooms){
        Scanner in = new Scanner(System.in);
        System.out.println("Выбрите номер комнаты:");
        for(int i = 0; i < rooms.length; i++){
            System.out.print(i+1 + "." + rooms[i].getName() + " ");
        }
        System.out.println();
        return in.nextInt();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Room [] rooms = {new Bathroom("Ванная комната","Обычный совмещенный санузел"),new Bedroom("Спальня","Просторная спальня с двуспальной кроватью"), new Kitchen("Кухня","Большая кухня с совмещенной столовой")};
        System.out.println("Добро пожаловать в игру Дом, твоя цель - найти выход из дома");
        Player player = new Player();
        System.out.println("Введите свое имя");
        player.setName(in.nextLine());
        System.out.println("Ваше имя " + player.getName());
        while (true){
            if(isGameFinished){
                System.out.println("Поздравляем, вы победили!");
                break;

            }
            switch (showMenu()){
                case 0:
                    return;

                case 1:
                    int i = showRooms(rooms);
                    player.setCurrentRoom(rooms[i-1]);
                    break;
                case 2:
                    player.showItems(player.getInventory());
                    if(player.getCurrentRoom()!= null) {
                        player.interact();
                    }
                    break;
                default:
                    System.out.println("Некорректный вариант");
            }

        }


    }

}
