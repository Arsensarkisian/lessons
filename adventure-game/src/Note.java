public class Note extends Item implements Collectible,Useful{
    private String text;
    Note(String name, String description,String text) {
        super(name, description);
        this.text = text;
    }
    @Override
    public void use() {
        System.out.println("Текст из записки: \"" + text +"\"}");
    }
}
