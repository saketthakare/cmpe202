

public class Main {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5);

		System.out.println(gumballMachine);

		gumballMachine.insertCoin( 25 );
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);

		gumballMachine.insertCoin( 25 );
		gumballMachine.turnCrank();
		gumballMachine.insertCoin( 25 );
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);


		GumballMachineType2 gbm2 = new GumballMachineType2(3);

        System.out.println("\nScenario 1 where only 25 cents are inserted");
		gbm2.insertCoin( 25 );
        gbm2.turnCrank();

        System.out.println("\nScenario 2 where remaining 25 cents are inserted");
        gbm2.insertCoin( 25 );
        gbm2.turnCrank();

        System.out.println("\nScenario 3 where remaining coins other than quarter are inserted");
        gbm2.insertCoin( 5 );
        gbm2.turnCrank();
        gbm2.insertCoin( 50 );
        gbm2.turnCrank();

        System.out.println("\nScenario 4 where total amount is more than 50.");
        gbm2.insertCoin( 25 );
        gbm2.insertCoin( 25 );
        gbm2.insertCoin( 25 );
        gbm2.insertCoin( 25 );
        gbm2.turnCrank();

        System.out.println("\nScenario 5 where all the Gumballs are used.");
        gbm2.insertCoin( 25 );
        gbm2.insertCoin( 25 );
        gbm2.turnCrank();
        gbm2.insertCoin( 25 );
        gbm2.insertCoin( 25 );
        gbm2.turnCrank();



    }
}
