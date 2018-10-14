public class PrintContext {

    private SlipPrintStrategy strategy;

    public PrintContext(SlipPrintStrategy strategy){
        this.strategy = strategy;
    }

    public void PrintBill (MenuItem root_item){
        this.strategy.printBill(root_item);
    }
}
