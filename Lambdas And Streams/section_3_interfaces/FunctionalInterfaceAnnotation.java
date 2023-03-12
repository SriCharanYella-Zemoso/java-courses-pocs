package section_3_interfaces;

public class FunctionalInterfaceAnnotation {

    @FunctionalInterface
    interface CrunchService {
        int crunch(int a, int b);
//         void munch(int i);
    }

    public int crunchService(int i, int j, CrunchService cruncher) {
        return cruncher.crunch(i, j);
    }


    public static void main(String[] args) {
        FunctionalInterfaceAnnotation client = new FunctionalInterfaceAnnotation();

        int result = client.crunchService(3, 4, (p, q) -> p * q);
        System.out.println(result);
        result = client.crunchService(3, 4, (p, q) -> p - q);
        System.out.println(result);
        result = client.crunchService(3, 4, (p, q) -> p + q);
        System.out.println(result);
        result = client.crunchService(3, 4, (p, q) -> p / q);
        System.out.println(result);
    }



}
