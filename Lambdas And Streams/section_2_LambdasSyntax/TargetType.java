package section_2_LambdasSyntax;

public class TargetType {

    public interface Email {
        String constructEmail(String name);
    }

    public String getEmail(String name, Email email) {
        return email.constructEmail(name);
    }
    public static  void main(String[] args) {
        System.out.println(new TargetType().getEmail("Charan", (name) ->  name + "@gmail.com"));
    }

}
