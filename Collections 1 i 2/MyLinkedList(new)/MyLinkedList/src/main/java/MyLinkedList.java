public class MyLinkedList {

    private Element head;

    class Element {
        private Element next;
        private Element prev;
        private String data;

        public Element(String d){
            next = null;
            prev = null;
            data = d;
        }
    }

    MyLinkedList() {
        this.head = null;
    }

    public void addElement(String s) {
        Element w = head;
        Element last = null;
        Element temp = new Element(s);

        while(w != null) {
            last = w;
            w = w.next;
        }
        if(last == null) {
            this.head = temp;
        } else {
            last.next = temp;
            temp.prev = last;
        }
    }

    public int getSize() {
        Element e = this.head;
        int result = 0;
        while(e != null) {
            result += 1;
            e = e.next;
        }
        return result;
    }

    @Override
    public String toString() {
        Element e = this.head;
        String result = "";
        while(e != null) {
            result += e.data + " ";
            e = e.next;
        }
        return "[ " + result + "]";
    }

    public Element getElement(int index) throws IndexOutOfBoundsException {

        int i = 0;
        Element e = this.head;
        while(e != null && i++ < index) {
            e = e.next;
        }

        if (e == null) {
            throw new IndexOutOfBoundsException("No object found");
        }

        return e;
    }

    public void removeElement(int index) {
        Element e = getElement(index);

        if(e.prev == null) {
            this.head = e.next;
            this.head.prev = null;
        }
        else if(e.next == null) {
            e = e.prev;
            e.next = null;
        }
        else {
            e.prev.next = e.next;
            e.next.prev = e.prev;
        }
    }

    public void insertElement(int index, String s) {

        int i = 0;
        Element e = this.head;
        while(e != null && i++ < index) {
            e = e.next;
        }
        if (e == null) {
            throw new IndexOutOfBoundsException("Given index does not exist on this list");
        }
        e.data = s;

    }
}
