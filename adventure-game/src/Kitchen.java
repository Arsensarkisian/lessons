public class Kitchen extends Room {
    public Kitchen(String name, String description){
        super(name,description);
        super.setItems(new Item[]{
                new Furniture("Выдвижной ящик","Верхний ящик под столешницей","ящик")});
    }
    public Kitchen(String name){
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
