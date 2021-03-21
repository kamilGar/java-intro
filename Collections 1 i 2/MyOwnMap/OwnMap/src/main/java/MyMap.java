public class MyMap<K,V> implements OwnMap {

    private final Entry<String, String>[] buckets;
    private static final int INITIAL_CAPACITY = 1;
    private int size = 0;

    MyMap() {
        this(INITIAL_CAPACITY);
    }

    MyMap(int capacity) {
        this.buckets = new Entry[capacity];
    }

    public int getSize() {
        return size;
    }

    @Override
    public boolean put(String key, String value) {
        {
            Entry<String, String> entry = new Entry<>(key, value, null);

            int bucket = key.hashCode() % buckets.length;

            Entry<String, String> existing = buckets[bucket];
            if (existing == null) {
                buckets[bucket] = entry;
                size++;
            } else {
                while (existing.next != null) {
                    if (existing.key.equals(key)) {
                        existing.value = value;
                        return true;
                    }
                    existing = existing.next;
                }

                if (existing.key.equals(key)) {
                    existing.value = value;
                } else {
                    existing.next = entry;
                    size++;
                }
            }
        } return false;
    }

    @Override
    public boolean containsKey(String key) {
        int bucket = key.hashCode() % buckets.length;
        Entry<String, String> existing = buckets[bucket];
        try {
            if (existing.key.equals(key)) {
                return true;
            }
            while (true) {
                existing = existing.next;
                if (existing.key.equals(key)) {
                    return true;
                }
            }
        } catch (NullPointerException ignored) {
        }
        return false;
    }

    @Override
    public boolean containsValue(String value) {
        int bucket = value.hashCode() % buckets.length;
        Entry<String, String> existing = buckets[bucket];
        try {
            if (existing.value.equals(value)) {
                return true;
            }
            while (true) {
                existing = existing.next;
                if (existing.value.equals(value)) {
                    return true;
            }
            }
        } catch (NullPointerException ignored) {
        }
        return false;
    }

    @Override
    public String remove(String key) {
        String removedValue = get(key);
        int bucket = key.hashCode() % buckets.length;
        Entry<String,String> previous = null;
        Entry<String,String> current = buckets[bucket];

        while(current != null) {
            if(current.key.equals(key)) {
                if(previous==null) {
                    buckets[bucket]=buckets[bucket].next;
                }
                else{
                    previous.next=current.next;
                }
            }
            previous = current;
            current = current.next;
        }
        return removedValue;
    }


    @Override
    public String get(String key) {
        Entry<String, String> bucket = buckets[key.hashCode() % buckets.length];

        while (bucket != null) {
            if (bucket.key.equals(key)) {
                return bucket.value;
            }
            bucket = bucket.next;
        }
        return null;
    }

}