package section_2_LambdasSyntax;

public class ConstructorReferences {

    static class Movie {
        int id;
        String name;
        public Movie(int id) {
            this(id, "");
        }
        public Movie(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    @FunctionalInterface
    interface MovieFactory {
        Movie create(int id);
    }



    interface MovieFactory2 {
        Movie create(int id, String name);
    }


    interface StringArray {
        String[] create(int size);
    }

    public static void main(String[] args) {

        MovieFactory m1 = i -> new Movie(i);
        MovieFactory m2 = Movie::new;  // calls new Movie(int id)
        MovieFactory2 m3 = Movie::new; // calls new Movie(int id, String name)

        StringArray stringArray1 = (size) -> new String[size];
        StringArray stringArray2 = String[]::new; // calls new String[size]

    }

}
