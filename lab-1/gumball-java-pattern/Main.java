

public class Main {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5,0);

		System.out.println(gumballMachine);

		gumballMachine.insertCoin(25);
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertCoin(25);
		gumballMachine.turnCrank();
		gumballMachine.insertCoin(25);
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);



        System.out.println("\n\nTesting Gumball Machine 2");
        GumballMachine gumballMachine2 = new GumballMachine(2,1);

        System.out.println("\nScenario 1 where only 25 cents are inserted");
        System.out.println(gumballMachine);
        gumballMachine2.insertCoin( 25 );
        gumballMachine2.turnCrank();

        System.out.println("\nScenario 2 where remaining 25 cents are inserted");
        System.out.println(gumballMachine);
        gumballMachine2.insertCoin( 25 );
        gumballMachine2.turnCrank();

        System.out.println("\nScenario 3 where remaining coins other than quarter are inserted");
        System.out.println(gumballMachine);
        gumballMachine2.insertCoin( 5 );
        gumballMachine2.turnCrank();
        gumballMachine2.insertCoin( 50 );
        gumballMachine2.turnCrank();

        System.out.println("\nScenario 4 where total amount is more than 50.");
        System.out.println(gumballMachine);
        gumballMachine2.insertCoin( 25 );
        gumballMachine2.insertCoin( 25 );
        gumballMachine2.insertCoin( 25 );
        gumballMachine2.insertCoin( 25 );
        gumballMachine2.turnCrank();

        System.out.println("\nScenario 5 where all the Gumballs are used.");
        System.out.println(gumballMachine);
        gumballMachine2.insertCoin( 25 );
        gumballMachine2.insertCoin( 25 );
        gumballMachine2.turnCrank();

        

        System.out.println("\n\nTesting Gumball Machine 3");
        GumballMachine gumballMachine3 = new GumballMachine(4,2);


        System.out.println("\n\nScenario 1 where only 25 cents are inserted");
        gumballMachine3.insertCoin( 25 );
        gumballMachine3.turnCrank();

        System.out.println("\nScenario 2 where remaining 25 cents are inserted");
        gumballMachine3.insertCoin( 25 );
        gumballMachine3.turnCrank();

        System.out.println("\nScenario 3 where 3x nickle 1x dime and 1x Quarter inserted");
        gumballMachine3.insertCoin( 5 );
        gumballMachine3.insertCoin( 5 );
        gumballMachine3.insertCoin( 5 );
        gumballMachine3.insertCoin( 10 );
        gumballMachine3.insertCoin( 25 );
        gumballMachine3.turnCrank();

        System.out.println("\nScenario 4 where total amount is more than 50.");
        gumballMachine3.insertCoin( 25 );
        gumballMachine3.insertCoin( 10 );
        gumballMachine3.insertCoin( 5 );
        gumballMachine3.insertCoin( 5 );
        gumballMachine3.turnCrank();

        System.out.println("\nScenario 5 where partial amount is paid");
        gumballMachine3.insertCoin( 25 );
        gumballMachine3.insertCoin( 10 );
        gumballMachine3.insertCoin( 5 );
        gumballMachine3.turnCrank();

        System.out.println("\nScenario 6 where all the Gumballs are used.");
        gumballMachine3.insertCoin( 25 );
        gumballMachine3.insertCoin( 25 );
        gumballMachine3.turnCrank();
	}
}
