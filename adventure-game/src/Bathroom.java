public class Bathroom extends Room{
    private Item [] items = {new Item("Зеркало","Круглое зеркало над раковиной"),new Item("раковина","Белая керамическая раковина")};


    Bathroom(String name, String description) {
        super(name, description);
    }
    Bathroom(String name) {
        super(name);
    }

    @Override
    protected void printItems() {

        System.out.print("Предметы в комнате " + getName());
        for (Item item : items) {
            System.out.print(" " + item);
        }
    }
}
