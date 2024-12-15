import java.util.Scanner;
public class Player {
    private String name;
    private Item [] inventory = new Item[10];
    private Room currentRoom;

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
        System.out.println("Вы перешли в комнату " + currentRoom.getName());
    }
    public void showItems(Item[] inventory){

        for (Item item : this.inventory) {
            if(item != null){System.out.print(" " + item.getName());}
            else System.out.print(" " + item);
        }
        System.out.println();
    }
    public String getName() {
        return name;
    }
    public Room getCurrentRoom() {
        return currentRoom;
    }
    public Item [] getInventory() {
        return inventory;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void interact(){
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < getCurrentRoom().getItems().length; i++){
            System.out.println(i+1 + " " + getCurrentRoom().getItems()[i].getName() + " ");
            }
        System.out.println("ВЫбирете предмет");
        int numberOfItem = in.nextInt() - 1;
        if(numberOfItem >= getCurrentRoom().getItems().length || numberOfItem < 0){
            System.out.println("Нет предмета с таким номером, попробуй еще раз");
            interact();

        }
        Item selectedItem = getCurrentRoom().getItems()[numberOfItem];
        if(selectedItem instanceof Collectible){
            System.out.println("1.Положить предмет в инвентарь 2. Использовать его");
            int choiceAction = in.nextInt();
            if(choiceAction ==1 ){
                for(int i = 0; i < inventory.length; i++){
                    if(inventory[i]==null){
                        inventory[i] = selectedItem;
                        break;
                    }
                }
            }
            else if (choiceAction == 2){
                ((Useful) selectedItem).use();
            }
            else System.out.println("Некорректный вариант");

        }
        else ((Useful) selectedItem).use();

    }
}
