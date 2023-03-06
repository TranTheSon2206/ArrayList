package ArrayList;
import java.util.ArrayList;
import java.util.List;
public class SearchElementsInArrayListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("Steve");
        names.add("John");
        names.add("Steve");
        names.add("Maria");

        // Check if an ArrayList contains a given elements
        System.out.println("Does names array contains \"Bob\"?: "+names.contains("Bob"));

        // Find the index of the first occurrence of an elements in an ArrayList
        System.out.println("indexOf \"Steve\"; "+names.indexOf("Steve"));
        System.out.println("indexOf \"Mark\"; "+names.indexOf("Mark"));

        //Find the index of the last occurrence of an elements in an Arraylist
        System.out.println("indexOf \"John\"; "+names.indexOf("John"));
        System.out.println("indexOf \"Bill\"; "+names.indexOf("Bill"));
    }
}
