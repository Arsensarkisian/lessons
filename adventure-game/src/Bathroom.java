public class Bathroom extends Room{
    public Bathroom(String name, String description) {
        super(name, description);
        super.setItems(new Item[]{
                new Furniture("Зеркало","Круглое зеркало над раковиной","Увмдел себя в зеркале, я прекрасен"),
                new Furniture("раковина","Белая керамическая раковина","Раковина с кровью, ничего особенного"),
                new Key("Старинный ключ","Старый деревянный ключ"),
                new Key("Золотой ключ","Старый золотой ключ")});
    }
    public Bathroom(String name) {
        super(name);
    }
    @Override
    public void printItems() {

        System.out.print("Предметы в комнате " + getName());
        for (Item item : getItems()) {
            if(item != null) {
                System.out.print(" " + item.getName());
            }
        }
    }
}
