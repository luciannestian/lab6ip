package Sources;

public class Item {
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String Name;

    public int Price;

    public int ID;

    public Item(int ID, int Price , String Name)
    {
        this.ID=ID;
        this.Price=Price;
        this.Name=Name;
    }


}
