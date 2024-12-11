public class Kitchen extends Room {
    private Item [] items = {new Item("Выдвижной ящик","Верхний ящик под столешницей")};
    Kitchen(String name, String description){
        super(name,description);
    }
    Kitchen(String name){
        super(name);
    }
    protected void printItems() {

        System.out.print("Предметы в комнате " + getName());
        for (Item item : items) {
            System.out.print(" " + item);
        }
    }
}
