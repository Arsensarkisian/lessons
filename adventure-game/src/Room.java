public class Room {
    private String name;
    private String description;
    Room(String name, String description){
        this.name = name;
        this.description = description;
    }
    Room(String name){
        this.name = name;
        this.description = "";
    }
    protected void printItems(){
        System.out.println("В этой комнате нет доступных предметов");
    }

     protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected String getDescription() {
        return description;
    }

    protected void setDescription(String description) {
        this.description = description;
    }
}
