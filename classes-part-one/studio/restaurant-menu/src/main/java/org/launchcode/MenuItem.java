import java.util.Date;

public class MenuItem {
    private String name;
    private Double price;
    private String description;
    private String category;
    private Date dateAdded;
    private Boolean isNew;

    public String getName() {
        return name;
    }
    public String getPrice() {
        return price;
    }
    public String getDescription() {
        return description;
    }
    public String getCategory() {
        return category;
    }

    public void setName(String aName) {
        name = aName;
    }

    public MenuItem(String name, Double price, String description, String category, Date dateAdded, Boolean isNew){
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this. dateAdded = dateAdded;
        this.isNew = isNew;
    }

}
