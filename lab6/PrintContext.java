public class PrintContext {

    private SlipPrintStrategy strategy;

    public PrintContext(SlipPrintStrategy strategy){
        this.strategy = strategy;
    }

    public void PrintBill (){
        this.strategy.printBill();
    }
}
