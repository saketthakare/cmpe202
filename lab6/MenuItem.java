import java.util.ArrayList;
import java.util.List;

public class MenuItem {

    public String name;
    public String type;
    public double price;
    private List<MenuItem> subItems;

    public MenuItem(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
        subItems = new ArrayList<MenuItem>();
    }

    public void addSubItem(MenuItem i) {
        subItems.add(i);
    }

    public List<MenuItem> getAllItems() {
        List<MenuItem> items = new ArrayList<MenuItem>();
        items.add(this);
        for (MenuItem i : this.subItems) {
            List<MenuItem> subItemList = i.getAllItems();
            if(subItemList.size() > 0){
                for (MenuItem smi : subItemList) {
                    items.add(smi);
                }
            }
        }
        return items;
    }
}
