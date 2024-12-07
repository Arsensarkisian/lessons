public class Bathroom {
    String name;
    String description;
    Item [] items = {new Item("Зеркало","Круглое зеркало над раковиной"),new Item("раковина","Белая керамическая раковина")};
    Bathroom(String name, String description){
        this.name = name;
        this.description = description;
    }
    Bathroom(String name){
        this.name = name;
        this.description = "";
    }
}
