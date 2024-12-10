public class Player {
    String name;
    Item [] inventory = new Item[10];
    Room currentRoom;

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
        System.out.println("Вы перешли в комнату " + currentRoom.name);
    }
    public void showItems(Item[] inventory){

        for (Item item : this.inventory) {
            System.out.print(" " + item);
        }
        System.out.println();

    }
}
