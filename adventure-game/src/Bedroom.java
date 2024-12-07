public class Bedroom {
    String name;
    String description;
    Item [] items = {new Item("Окно","Окно с ручкой в дальней стене"),new Item("тумбочка","Деревянная тумбочка у кровати"),new Item("Кровать","Незаправленная кровать из Икеи")};
    Bedroom(String name, String description){
        this.name = name;
        this.description = description;
    }
    Bedroom(String name){
        this.name = name;
        this.description = "";
    }
}
