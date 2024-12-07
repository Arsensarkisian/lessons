public class Kitchen {
    String name;
    String description;
    Item [] items = {new Item("Выдвижной ящик","Верхний ящик под столешницей")};
    Kitchen(String name, String description){
        this.name = name;
        this.description = description;
    }
    Kitchen(String name){
        this.name = name;
        this.description = "";
    }
}
