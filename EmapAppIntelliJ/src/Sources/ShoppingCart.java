package Sources;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    public int Id;

    public List <Item> shoppingCartItem = new ArrayList<> ();

    public void addItem(Item item) {
        shoppingCartItem.add(item);
    }

    public void checkOut() {
        new OrderCommand().execute(shoppingCartItem);
        shoppingCartItem.clear();
        try{
            if (this.Id <= 0);
           }
        catch (Exception exception)
        {
            System.out.println(exception + " You entered 0 or less");
        }
    }

    public void remove(Item item) {

        for(int i=0; i<shoppingCartItem.size(); i++)
        {
            if(shoppingCartItem.get(i).getId() == item.ID)
                shoppingCartItem.remove(shoppingCartItem.get(i));
        }
    }

}
