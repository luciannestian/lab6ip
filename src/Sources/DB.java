package Sources;

import java.util.ArrayList;
import java.util.List;

public class DB {
    private static final String name = null;

    private static final List<User> userList = null;

    private static final List<User> listUsers = new ArrayList<User>();

    private String itemList;

    public void getInstance() {
    }

    public static String getName() {
        return name;
    }

    public static List<User> getUserList() {
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
        //Authentification auth = new Authentification();
        //listUsers.add(auth.newUser());
    }

}