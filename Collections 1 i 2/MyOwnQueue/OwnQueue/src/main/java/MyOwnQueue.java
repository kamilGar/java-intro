public class MyOwnQueue implements OwnQueue {

    private final int maxSize;

    protected int[] queArray;
    protected int front;
    protected int rear;
    protected int nItems;

    MyOwnQueue(Integer maxSize) {
        this.maxSize = maxSize;
        queArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    @Override
    public boolean add(Integer e) {
        if (rear == maxSize - 1)
            rear = -1;
        queArray[++rear] = e;
        nItems++;
        return queArray.length <= maxSize;
    }

    @Override
    public Integer remove() {
        int temp = queArray[front++];
        int[] newQueArray = new int[queArray.length-1];
        System.arraycopy(queArray, 1, newQueArray, 0, queArray.length - 1);
        queArray = newQueArray;
        return temp;
    }

    @Override
    public Integer element() {
        return queArray[0];
    }

    @Override
    public String toString() {
        String result = " ";
        for (int i : queArray) {
            result += + i + " ";
        }
        return "[" + result + "]";
    }

}
