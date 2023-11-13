public class MainShop {
    public static void main(String[] args) {
        System.out.println("Hello Shop!");
        Item myItem= new Item("Apple", 10, 4);
        WeightedItem wItem= new WeightedItem("Candy",129,30, 5); //weight in grams
        String n=  myItem.name;

        myItem.calcCost();
        wItem.calcCost();
    }
}

