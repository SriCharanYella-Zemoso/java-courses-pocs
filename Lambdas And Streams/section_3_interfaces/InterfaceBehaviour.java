package section_3_interfaces;

interface Vehicle {
    void start();
    void stop();
}

interface Electric {
    void charge();
}

interface HybridVehicle extends Vehicle, Electric {
    void switchToElectricMode();
}

class Prius implements HybridVehicle {
    @Override
    public void start() {
        System.out.println("Prius is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Prius is stopping.");
    }

    @Override
    public void charge() {
        System.out.println("Prius is charging.");
    }

    @Override
    public void switchToElectricMode() {
        System.out.println("Prius is switching to electric mode.");
    }
}

public class InterfaceBehaviour {
    public static void main(String[] args) {
        Prius prius = new Prius();
        prius.start();
        prius.charge();
        prius.switchToElectricMode();
        prius.stop();
    }
}
