public class testy {

    public static void main(String[] args) {

        MyOwnList myOwnList = new MyOwnList(4);
        myOwnList.add(0,1);
        myOwnList.add(1,2);
        myOwnList.add(2,3);
        myOwnList.add(3,4);

        myOwnList.add(5);
        myOwnList.remove(3);

        System.out.println("Czy lista jest pusta? " + myOwnList.isEmpty());
        System.out.println("Rozmiar listy: " + myOwnList.size());
        System.out.println("Elementy listy: ");

        for (int i=0; i<myOwnList.size();i++)
            System.out.println(myOwnList.get(i));
    }
}
