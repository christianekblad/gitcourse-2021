import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> listA = new ArrayList<>();
        listA.add("Rick and morty");
        listA.add("South park");
        listA.add("The Mandalorian");
        listA.add("Breaking Bad");
        listA.add("Alternate Carbon");

        String shortest = shortestString(listA);
        System.out.println(shortest);
    }

    public static String shortestString(List<String> listA) {
        String shortest = listA.get(0);

        for(String str : listA) {
            if (str.length() < shortest.length()) {
                shortest = str;
            }
        }
        return shortest;
    }
}
