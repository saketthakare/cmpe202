public class GumballMachineType2 implements CrankMachine {
    private int num_gumballs;
    private int quarter_count;

    public GumballMachineType2(int size) {
        this.num_gumballs = size;
        this.quarter_count = 0;
    }

    public void insertCoin(int coin) {
        if (coin == 25)
            this.quarter_count++;
    }

    public void turnCrank() {
        if (this.quarter_count >= 2) {
            if (this.num_gumballs > 0) {
                this.num_gumballs--;
                this.quarter_count = 0;
                System.out.println("Thanks for your quarter.  Gumball Ejected!");
            } else {
                System.out.println("No More Gumballs!  Sorry, can't return your quarter.");
            }
        } else if (this.quarter_count == 1) {
            System.out.println("Please insert one more quarter");
        } else {
            System.out.println("Please insert two quarters");
        }
    }
}
