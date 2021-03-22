class BubbleSort {

    static void bubbleSortForInts(int tab[]) {
        int n = tab.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (tab[j] > tab[j + 1]) {
                    int temp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = temp;
                    }
    }

    static void bubbleSortForStrings(String strings[]) {
        for (int j = 0; j < strings.length; j++) {
            for (int i = j + 1; i < strings.length; i++) {
                if (strings[i].compareTo(strings[j]) < 0) {
                    String temp = strings[j];
                    strings[j] = strings[i];
                    strings[i] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("Przed sortowaniem: ");
        int[] ints = {55,20,14,67,3};
        for (int item : ints)
            System.out.println(item);
        bubbleSortForInts(ints);

        System.out.println("Po sortowaniu: ");
        for (int item : ints)
            System.out.println(item);

        System.out.println("Przed sortowaniem: ");
        String[] strings = {"Czarek","Basia","Kamil","Ala", "Danuta"};
        for (String item : strings)
            System.out.println(item);
        bubbleSortForStrings(strings);

        System.out.println("Po sortowaniu: ");
        for (String item : strings)
            System.out.println(item);

    }

}
