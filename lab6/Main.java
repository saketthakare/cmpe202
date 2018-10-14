import java.io.Console;

public class Main {

    public static void main(String[] args) {


        MenuItem baseItem = new MenuItem("ORDER","BASE_ITEM",0);

        MenuItem burger = new MenuItem("LBB","MAIN_ITEM",5.59);
        MenuItem fries = new MenuItem("LTL CAJ", "MAIN_ITEM", 2.79);

        burger.addSubItem(new MenuItem("BACON","MEAT",0));
        burger.addSubItem(new MenuItem("LETTUCE","TOP_BUN",0));
        burger.addSubItem(new MenuItem("TOMATO","TOP_BUN",0));

        burger.addSubItem(new MenuItem("G ONION","BOTTOM_BUN",0));
        burger.addSubItem(new MenuItem("JALA Grilled","BOTTOM_BUN",0));

        baseItem.addSubItem(burger);
        baseItem.addSubItem(fries);

//        System.out.println("\n\n********* Dynamic  Slip *********\n");
//
//        for ( String item :
//                baseItem.getItems()) {
//            System.out.println(item);
//        }


        PrintContext customerSlip = new PrintContext( new CustomerSlipPrint());
        PrintContext packingSlip = new PrintContext( new PackingSlipPrint());
        System.out.println("********* Customer Slip *********\n");
        customerSlip.PrintBill(baseItem);
        System.out.println("\n\n********* Packing  Slip *********\n");
        packingSlip.PrintBill(baseItem);

    }
}
