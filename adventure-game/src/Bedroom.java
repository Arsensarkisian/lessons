public class Bedroom extends Room {
    private Item [] items = {new Item("Окно","Окно с ручкой в дальней стене"),new Item("тумбочка","Деревянная тумбочка у кровати"),new Item("Кровать","Незаправленная кровать из Икеи")};
    Bedroom(String name, String description){
        super(name,description);
    }
    Bedroom(String name){
        super(name);
    }
    protected void printItems() {

        System.out.print("Предметы в комнате " + getName());
        for (Item item : items) {
            System.out.print(" " + item);
        }
    }
}
