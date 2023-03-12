package section_3_interfaces;



interface FlyingToyWithDefault {
    void fly();

    default void rest() {
        System.out.println("If not told explicitly, " +
                "I rest like this");
    }
}

class FlyingCow implements FlyingToyWithDefault {
    @Override
    public void fly() {
        System.out.println("I am cow; I can fly");
    }
}

public class ConcreteMethods {
    public static void main(String[] args) {
        FlyingToyWithDefault cow = new FlyingCow();
        cow.fly();
        cow.rest();
    }
}
