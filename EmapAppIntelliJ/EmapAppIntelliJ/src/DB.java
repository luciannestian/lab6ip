package Sources;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DB {
    static final public String name = null;

    static final public List<User> userList = null;

    static final public List<User> listUsers = new ArrayList<User>();

    public String itemList;

    public void getInstance() {
    }

    public static String getName() {
        return name;
    }

    public static Date getUserList() {
        return userList;
    }

    public static List<User> getListUsers() {
        return listUsers;
    }

    public String getItemList() {
        return itemList;
    }

    public void setItemList(String itemList) {
        this.itemList = itemList;
    }

    public void getUsers() {
    }

    public void getItems() {
    }

    public void AddUser(User user1){
        Authenitcation auth = new Authenitcation();
        listUsers.add(auth.newUser());
    }

}
