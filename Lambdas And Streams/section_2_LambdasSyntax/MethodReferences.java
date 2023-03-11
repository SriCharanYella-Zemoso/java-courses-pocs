package section_2_LambdasSyntax;

@FunctionalInterface
interface IMovie {
    public boolean check(int rank);
}

public class MethodReferences {

    // Static Method reference usage
    public static void testMovieStaticMethodRef() {
        IMovie m1 = i -> i < 100;
        IMovie m2 = MethodReferences::isClassic;
    }

    // Instance Method reference usage
    public static void testMovieInstanceMethodRef() {
        MethodReferences ref = new MethodReferences();
        IMovie m1 = i -> i < 10;
        IMovie m2 = ref::isTop10;
    }

    public boolean isTop10(int movieRank) {
        return movieRank <= 10;
    }

    public static boolean isClassic(int movieRank) {
        return movieRank < 100;
    }
    public static void main(String[] args) {

    }

}
