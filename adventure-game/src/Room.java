public class Room {
    String name;
    String description;
    Item [] items;
    Room(String name, String description){
        this.name = name;
        this.description = description;
    }
    Room(String name){
        this.name = name;
        this.description = "";
    }
    void printItems(){
        System.out.println("В этой комнате нет доступных предметов");
    }
}
