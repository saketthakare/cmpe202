package decorator;

import java.util.function.Function;

public class Tester {

    public static void runTest()
    {
        Function<String, String> em = (input) -> "<em>" + input + "</em>";
        Function<String, String> h1 = (input) -> "<h1>" + input + "</h1>";
        Component hw =  new ConcreteComponent();
        String result = em.andThen(h1).apply(hw.operation());
        System.out.println( result );
    }

    public static void main( String [] args )
    {
        Tester t = new Tester() ;
        t.runTest() ;
    }

}
