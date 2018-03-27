package Sources;

public class OrderCommand extends Command {
    public int orderID;

    public Item item;

    @Override
    public boolean execute() {
        return false;
    }

    public void newOrder() {
    }

}
