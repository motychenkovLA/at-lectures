package tracker;

public class Repository {
    private final int capacity;
    private Defect[] data;
    private int size;

    public Repository(int capacity) {
        this.capacity = capacity;
        this.data = new Defect[capacity];
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size >= capacity;
    }

    public void add(Defect defect) {
        data[size] = defect;
        size++;
    }

    public Defect getElement(int index) {
        return data[index];
    }

    public Defect[] getAll() {
        Defect[] result = new Defect[size];
        for (int i = 0; i < size; i++) {
            result[i] = data[i];
        }
        return result;
    }
}
