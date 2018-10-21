  

public class BuildOrder {

    public static Component getOrder()
    {
        Composite order = new Composite( "Order" );

        CustomBurger customBurger = new CustomBurger( "Build Your Own Burger" ) ;

        Burger b = new Burger( "Burger Options" ) ;
        String[] bo = { "Organic Bison*", "1/2lb.", "On A Bun" } ;
        b.setOptions( bo ) ;

        Cheese c = new Cheese( "Cheese Options" ) ;
        String[] co = { "Yellow American", "Spicy Jalapeno Jack" } ;
        c.setOptions( co ) ;
        c.wrapDecorator( b ) ;

        PremiumCheese pc = new PremiumCheese( "Premium Cheese Options" ) ;
        String[] pco = { "Danish Blue Cheese" } ;
        pc.setOptions( pco ) ;
        pc.wrapDecorator( c ) ;

        Sauce s = new Sauce( "Sauce Options" ) ;
        String[] so = { "Mayonnaise", "Thai Peanut Sauce" } ;
        s.setOptions( so ) ;
        s.wrapDecorator( pc ) ;

        Toppings t = new Toppings( "Toppings Options" ) ;
        String[] to = { "Dill Pickle Chips", "Black Olives", "Spicy Pickles" } ;
        t.setOptions( to ) ;
        t.wrapDecorator( s ) ;

        Premium p = new Premium( "Premium Options" ) ;
        String[] po = { "Marinated Tomatoes" } ;
        p.setOptions( po ) ;
        p.wrapDecorator( t ) ;

        Bun bun = new Bun("Bun Options");
        String[] bunOptions = {"Ciabatta (Vegan)"};
        bun.setOptions(bunOptions);
        bun.wrapDecorator( p );

        Side side = new Side("Side Options");
        String[] sideOptions = {"Shoestring Fries"};
        side.setOptions(sideOptions);
        side.wrapDecorator( bun );

        // Setup Custom Burger Ingredients
        customBurger.setDecorator( side ) ;
        customBurger.addChild( b ) ;
        customBurger.addChild( c ) ;
        customBurger.addChild( pc ) ;
        customBurger.addChild( s ) ;
        customBurger.addChild( t ) ;
        customBurger.addChild( p ) ;
        customBurger.addChild( bun ) ;
        customBurger.addChild( side ) ;

        // Add Custom Burger to the
        order.addChild( customBurger );



        CustomBurger customBurger1 = new CustomBurger( "Build Your Own Burger" ) ;

         b = new Burger( "Burger Options" ) ;
        String[] burgerOptions = { "Hormone & Antibiotic Free Beef*", "1/3lb.", "On A Bun" } ;
        b.setOptions( burgerOptions ) ;

         c = new Cheese( "Cheese Options" ) ;
        String[] cheeseOptions = { "Smoked Gouda", "Greek Feta" } ;
        c.setOptions( cheeseOptions ) ;
        c.wrapDecorator( b ) ;

         pc = new PremiumCheese( "Premium Cheese Options" ) ;
        String[]  premiumCheeseOptions = { "Fresh Mozzarella" } ;
        pc.setOptions( premiumCheeseOptions ) ;
        pc.wrapDecorator( c ) ;

         s = new Sauce( "Sauce Options" ) ;
        String[] sauceOptions = { "Habanero Salsa" } ;
        s.setOptions( sauceOptions ) ;
        s.wrapDecorator( pc ) ;

        t = new Toppings( "Toppings Options" ) ;
        String[] toppingsOptions = { "Crushed Peanuts" } ;
        t.setOptions( toppingsOptions ) ;
        t.wrapDecorator( s ) ;

         p = new Premium( "Premium Options" ) ;
        String[] premiumOptions = { "Sunny Side Up Eggs*","Marinated Tomatoes" } ;
        p.setOptions( premiumOptions ) ;
        p.wrapDecorator( t ) ;

         bun = new Bun("Bun Options");
        String[] bunOptions1 = {"Gluten-Free Bun"};
        bun.setOptions(bunOptions1);
        bun.wrapDecorator( p );

         side = new Side("Side Options");
        String[] sideOptions1 = {"Shoestring Fries"};
        side.setOptions(sideOptions1);
        side.wrapDecorator( bun );


        // Setup Custom Burger Ingredients
        customBurger1.setDecorator( side ) ;
        customBurger1.addChild( b ) ;
        customBurger1.addChild( c ) ;
        customBurger1.addChild( pc ) ;
        customBurger1.addChild( s ) ;
        customBurger1.addChild( t ) ;
        customBurger1.addChild( p ) ;
        customBurger1.addChild( bun ) ;
        customBurger1.addChild( side ) ;

        // Add Custom Burger to the
        order.addChild( customBurger1 );


        return order ;
    }

}


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/