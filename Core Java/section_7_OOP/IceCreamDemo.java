package section_7_OOP;

public class IceCreamDemo {
    public static void main(String[] args) {
        IceCream chocolate = new IceCream("Chocolate", 3, 2);
        IceCream strawberry = new IceCream("Strawberry", 2, 1);

        chocolate.addTopping("nuts");
        chocolate.addTopping("cherries");

        strawberry.addTopping("sprinkles");

        printIceCream(chocolate);
        printIceCream(strawberry);

    }

    public static void printIceCream(IceCream iceCream) {
        System.out.println(iceCream.getName());
        System.out.println("cost: $" + iceCream.getCost());
        iceCream.printToppings();
        System.out.println();
    }



}
