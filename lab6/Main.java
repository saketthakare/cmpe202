import java.io.Console;

public class Main {

    public static void main(String[] args) {
        PrintContext customerSlip = new PrintContext( new CustomerSlipPrint());
        PrintContext packingSlip = new PrintContext( new PackingSlipPrint());
        System.out.println("********* Customer Slip *********\n");
        customerSlip.PrintBill();
        System.out.println("\n\n********* Packing  Slip *********\n");
        packingSlip.PrintBill();
    }
}
