package org.launchcode;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(String n, double p, String d, String c, boolean iN) {
        this.name = n;
        this.price = p;
        this.description = d;
        this.category = c;
        this.isNew = iN;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public String isNewResult(Boolean isNew) {
        String result;
        if (isNew){
            result = "NEW!";
        } else {
            result = "";
        }
        return result;
    }

    @Override
    public String toString() {
        return category + ", " + name + ", Price: $" + price + ". " + description + ". " + isNewResult(isNew);
    }
}
