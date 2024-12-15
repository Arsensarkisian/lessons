public class Bedroom extends Room {
    //private Item [] items = {new Item("Окно","Окно с ручкой в дальней стене"),new Item("тумбочка","Деревянная тумбочка у кровати"),new Item("Кровать","Незаправленная кровать из Икеи")};
    Bedroom(String name, String description){
        super(name,description);
        super.setItems(new Item[]{
                new Window("Окно","Окно с ручкой в дальней стене","окно"),
                new Furniture("тумбочка","Деревянная тумбочка у кровати","Просто тумбочка"),
                new Key("Ключ синий","Сломанный ключ")});
    }

    Bedroom(String name){
        super(name);
    }
    public void printItems() {

        System.out.print("Предметы в комнате " + getName());
        for (Item item : getItems()) {
            if(item != null) {
                System.out.print(" " + item.getName());
            }
        }
    }
}
