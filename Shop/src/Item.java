/** this is a SUPER-class */
public class Item {
    /** Attributes */
    protected String name;
    protected double value;
    protected int number;

    /** constructor */
    public Item(){} //default constructor

    public Item(String name, double value, int number) {
        this.name = name;
        this.value = value;
        this.number = number;
    }

    public void calcCost(){
        double cost= value*number;
        System.out.println("the cost of " + this.name + " is "+ cost);
    }

}
