public class Bun extends LeafDecorator {

    private String[] options;

    public Bun(String d) {
        super(d);
    }

    public void setOptions(String[] options) {
        this.options = options;
        String bunType = options[0];
        if ("Hawaiian Bun".equals(bunType) || "Gluten-Free Bun".equals(bunType)) this.price += 1.00;
        if ("Pretzel Bun".equals(bunType)) this.price += 0.50;
    }

    public String getDescription() {
        String desc = "";
        for (int i = 0; i < options.length; i++) {
            if (i > 0) desc += " + " + options[i];
            else desc = options[i];
        }
        return desc;
    }
}
