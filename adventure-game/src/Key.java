import java.util.Objects;
public class Key extends Item implements Collectible,Useful{
    Key(String name, String description) {
        super(name, description);
    }
    @Override
    public void use() {
        if(Objects.equals(getName(), "Старинный ключ")){
            Game.isGameFinished = true;
        }
        else{
            System.out.println("Ничего не произошло");
        }
    }
}
