package pregunta6;

public class Client {

    public static void main(String[] args) {
        Sandwich small = new SmallBreadSandwich();
        small = new Egg(small);
        //small = new Bacon(small);
        small = new Turkey(small);
        small = new Chicken(small);
        System.out.println(small.make());
    }
}
