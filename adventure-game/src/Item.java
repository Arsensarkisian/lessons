public class Item {
    private String name;
    private String description;
    Item(String name, String description){
        this.name = name;
        this.description = description;
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
