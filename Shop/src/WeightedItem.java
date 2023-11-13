/** this is a SUB-class*/
public class WeightedItem extends Item{
    /** Atributes */
    private double weight;

    /** constructor */
    public WeightedItem(String name, double value, int number, double weight){
        super(name, value, number);
        this.weight = weight;
    }

    @Override
    public void calcCost(){
        double cost= value*number*(weight/1000);
        System.out.println("the cost of " + this.name + " is "+ cost);
    }

}
