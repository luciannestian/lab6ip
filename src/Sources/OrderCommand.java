package Sources;

import java.util.List;

public class OrderCommand extends Command {
    public int orderID;

    public Item item;

    @Override
    public boolean execute() {
        return false;
    }

    public void newOrder() {
    }


    public boolean execute(List<ShoppingCartItem> orders) {
        System.out.println("Ordered items:");
        String orderLine;
        int total=0;
        for (int i=0;i<orders.size();i++)
        {
            orderLine = i + ". " + orders.get(i).getName() + "-" + orders.get(i).getPrice();
            System.out.println(orderLine);
            total+=orders.get(i).getPrice();
        }
        System.out.println("Total : " + total);
        return true;
    }

}
