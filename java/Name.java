import java.util.Arrays;
import java.util.List;

class Name {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Arun","Guru","Nandu","Jaggu");
//        names.forEach(s -> System.out.println(s));
        names.forEach(System.out::println);
    }
}