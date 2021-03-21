import java.util.Objects;

public class MyOwnList implements OwnList {

    private int size;
    private static final Integer[] empty = {};
    Integer[] elementData;

    MyOwnList(int size) {
        this.size = size;
        if (size > 0) {
            this.elementData = new Integer[size];
        } else if (size == 0) {
            this.elementData = empty;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void add(Integer element) {
        size++;

        Integer[] newElementData = new Integer[size];
        for (int i = 0; i < elementData.length; i++) {
            newElementData[i] = elementData[i];
        }
        newElementData[size - 1] = element;
        elementData = newElementData;
    }

    @Override
    public Integer get(int i) {
        Objects.checkIndex(i, size);
        return elementData[i];
    }

    @Override
    public void add(int index, Integer element) {
        elementData[index] = element;
    }

    @Override
    public Integer remove(int index) {
        final Integer removed = elementData[index];
        final Integer[] es = elementData;
        final int newSize;
        if ((newSize = size - 1) > index)
            System.arraycopy(es, index + 1, es, index, newSize - index);
        es[size = newSize] = null;
        return removed;
    }
}
