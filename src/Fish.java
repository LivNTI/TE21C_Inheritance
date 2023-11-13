public class Fish {
    /** Atributes */
    String colour;
    String nose;
    String climate;
    int age;

    /** Constructor */
    public Fish(){ // default constructor
        age= 0;
    }

    public Fish(String colour){

        this.colour= colour;
    }

    /** Methods */
    public void addAge(){
        this.age++;
    }
    
}
