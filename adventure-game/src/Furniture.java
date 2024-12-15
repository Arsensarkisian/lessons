public class Furniture extends Item implements Useful{
    private String text;
    public Furniture(String name, String description,String text) {
        super(name, description);
        this.text = text;
    }
    @Override
    public void use() {
        System.out.println(text);
    }
}
