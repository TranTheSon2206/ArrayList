package ArrayList;
import java.util.ArrayList;
import java.util.List;
public class AccessElementsFromArrayListExample {
    public static void main(String[] args) {
        List<String> topCompanies = new ArrayList<>();

        //Check if an AraayList is empty
        System.out.println("Is the topCompanies list empty?: "+topCompanies.isEmpty());

        topCompanies.add("Google");
        topCompanies.add("Apple");
        topCompanies.add("Microsoft");
        topCompanies.add("Amazon");
        topCompanies.add("Facebook");

        //Find the size of an ArrayList
        System.out.println("Here are the top "+topCompanies.size()+" companies in the world");
        System.out.println(topCompanies);

        //Retrieve the elements at a given index
        String bestCompany = topCompanies.get(0);
        String secondCompany = topCompanies.get(1);
        String lastCompany = topCompanies.get(topCompanies.size()-1);

        System.out.println("Best Company: "+bestCompany);
        System.out.println("Second Company: "+secondCompany);
        System.out.println("Last Company: "+lastCompany);

        //Modify the elements at a given index
        topCompanies.set(4,"Wallmart");
        System.out.println("Modified top companies list: "+topCompanies);
    }
}
