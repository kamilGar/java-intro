import java.util.*;

public class Names {

    public static void main(String[] args) {

        List<String> names;
        names = Arrays.asList("Anna", "Katarzyna", "Tymon", "Tadeusz", "Anna",
                "Karolina", "Dorota", "Piotr");

        System.out.println("Lista bez duplikatów: " + delDuplicates(names));
        System.out.println("Lista w odwrotnej kolejności: " + reversedList(names));
        System.out.println("Elementy 'Anna' zmienione na 'Joanna': " + insertElement(names, "Anna", "Joanna"));

    }

    public static List delDuplicates(List list) {
        Set<String> targetSet = new HashSet<>(list);
        List<String> newList = new ArrayList<>(targetSet);
        return newList;
    }

    public static List reversedList(List list) {
        Collections.reverse(list);
        return list;
    }

    public static List insertElement(List list, String originalStr, String newStr) {
        for (int i=0; i<list.size(); i++) {
            if (list.get(i).equals(originalStr)) {
                list.set(i,newStr);
            }
        } return list;
    }

}



