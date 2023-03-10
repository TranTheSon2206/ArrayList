package ArrayList;
import java.util.ArrayList;
import java.util.List;
public class RemoveElementsFromArrayListExample {
    public static void main(String[] args) {
        List<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Python");
        programmingLanguages.add("Perl");
        programmingLanguages.add("Ruby");

        System.out.println("Initial List: "+programmingLanguages);

        // Remove the elements at index `5`
        programmingLanguages.remove(5);
        System.out.println("After remove(5): "+programmingLanguages);

        // Remove the first occurrence of the given elements from the ArrayList
        // (The remove() method returns false if the elements does not exist in the ArrayList)
        boolean isRemoved = programmingLanguages.remove("Kotlin");
        System.out.println("After remove (\"Kotlin\"): "+programmingLanguages);

        // Remove all the elements that satisfy the given predicate
        programmingLanguages.removeIf(n ->(n.charAt(0)=='C'));
        /*
            The above removeIf() call can aslo be written using lambda expression like this -
            programmingLanguages.removeIf(s -> s.startsWith("C"))
         */

        System.out.println("After Removing all elements that start with \"C\":"+programmingLanguages);

        // Remove all elements from the ArrayList
        programmingLanguages.clear();
        System.out.println("After clear(): "+programmingLanguages);
    }
}
