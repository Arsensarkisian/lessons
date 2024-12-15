public class Furniture extends Item implements Useful{
    String text;
    Furniture(String name, String description,String text) {
        super(name, description);
        this.text = text;
    }

    @Override
    public void use() {
        System.out.println(text);
    }
}
