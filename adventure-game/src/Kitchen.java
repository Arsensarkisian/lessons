public class Kitchen extends Room {

    Item [] items = {new Item("Выдвижной ящик","Верхний ящик под столешницей")};
    Kitchen(String name, String description){
        super(name,description);
    }
    Kitchen(String name){
        super(name);
    }
    void printItems() {

        System.out.print("Предметы в комнате " + super.name);
        for (Item item : items) {
            System.out.print(" " + item);
        }
    }
}
