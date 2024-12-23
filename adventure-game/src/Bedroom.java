public class Bedroom extends Room {
    public Bedroom(String name, String description){
        super(name,description);
        super.setItems(new Item[]{
                new Window("Окно","Окно с ручкой в дальней стене","окно"),
                new Furniture("тумбочка","Деревянная тумбочка у кровати","Просто тумбочка"),
                new Key("Ключ синий","Сломанный ключ")});
    }
    public Bedroom(String name){
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
