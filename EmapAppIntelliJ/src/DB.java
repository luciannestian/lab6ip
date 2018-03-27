import java.util.Date;

public class DB {
    public String name;

    public List <User> userList = new ArrayList<>();

    public List <ShoppingCart> itemList = new ArrayList<>();

    public void getInstance() {
        return name;
    }

    public void getUsers() {
        return userList;
    }


    public void getItems() {
        return itemList;
    }

}
