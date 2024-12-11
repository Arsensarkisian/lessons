public class Player {
    private String name;
    private Item [] inventory = new Item[10];
    private Room currentRoom;

    protected void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
        System.out.println("Вы перешли в комнату " + currentRoom.getName());
    }
    protected void showItems(Item[] inventory){

        for (Item item : this.inventory) {
            System.out.print(" " + item);
        }
        System.out.println();
    }
    protected String getName() {
        return name;
    }
    protected Room getCurrentRoom() {
        return currentRoom;
    }
    protected Item [] getInventory() {
        return inventory;
    }
    protected void setName(String name) {
        this.name = name;
    }
}
