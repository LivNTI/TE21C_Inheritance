public class Main {
    public static void main(String[] args) {

        Fish aFish= new Fish("Green");

        System.out.println("The fish is " + aFish.colour);

        Shark myShark= new Shark("pink","eggs");
        myShark.addAge();
        myShark.addAge();
        System.out.println("the shark eats " + myShark.diet + " and is age "+ myShark.age);
    }
}

