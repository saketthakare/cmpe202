public class GumballMachineType3 implements CrankMachine {
    private int num_gumballs;
    private int amount;

    public GumballMachineType3(int size) {
        this.num_gumballs = size;
        this.amount = 0;
    }

    public void insertCoin(int coin) {
        if (coin == 25)
            this.amount += 25;
        else if (coin == 10)
            this.amount += 10;
        else if (coin == 5)
            this.amount += 5;

    }

    public void turnCrank() {
        if (this.amount >= 50) {
            if (this.num_gumballs > 0) {
                System.out.println("Thanks for your quarter.  Gumball Ejected!");
                this.amount = 0;
                this.num_gumballs--;
            } else {
                System.out.println("No More Gumballs!  Sorry, can't return your quarter.");
            }
        } else {
            System.out.println("Please insert " + (50 - this.amount)+ " cents");
        }
    }
}
