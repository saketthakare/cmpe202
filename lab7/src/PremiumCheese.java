public class PremiumCheese extends LeafDecorator {

    private String[] options ;

    public PremiumCheese(String d) { super(d); }

    // $1.5 for every premium cheese
    public void setOptions(String[] options) {
        this.options = options ;
        this.price = options.length * 1.5 ;
    }

    public String getDescription() {
        String desc = "   " ;
        for ( int i = 0; i<options.length; i++ )
        {
            if (i>0) desc += " + " + options[i] ;
            else desc = options[i] ;
        }
        return desc ;
    }
}
