import java.util.ArrayList;

public class CollectionsExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        for (String lang : list) {
            System.out.println(lang);
        }
    }
}