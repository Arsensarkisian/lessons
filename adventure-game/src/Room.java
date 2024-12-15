public abstract class Room {
    private String name;
    private String description;
    private Item [] items;
    Room(String name, String description){
        this.name = name;
        this.description = description;
    }
    Room(String name){
        this.name = name;
        this.description = "";
    }
    public Item [] getItems() {
        return items;
    }
    public void setItems(Item [] items) {
        this.items = items;
    }

    public abstract void printItems();

     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
