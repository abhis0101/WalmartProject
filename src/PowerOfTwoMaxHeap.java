public class PowerOfTwoMaxHeap {
    private int[] data;
    private int size;
    private final int maxChildren;

    public PowerOfTwoMaxHeap(int maxChildren) {
        this.maxChildren = (int) Math.pow(2, maxChildren);
        data = new int[10];
        size = 0;
    }

    private int parent(int index) {
        return (index - 1) / maxChildren;
    }

    private int leftChild(int index) {
        return index * maxChildren + 1;
    }

    private int rightChild(int index) {
        return index * maxChildren + 2;
    }

    private void ensureCapacity() {
        if (size == data.length) {
            int[] newData = new int[data.length * 2];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }
    }

    private void swap(int index1, int index2) {
        int temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;
    }

    private void siftUp(int index) {
        while (index > 0 && data[parent(index)] < data[index]) {
            swap(index, parent(index));
            index = parent(index);
        }
    }

    private void siftDown(int index) {
        int maxIndex = index;
        int left = leftChild(index);
        if (left < size && data[left] > data[maxIndex]) {
            maxIndex = left;
        }
        int right = rightChild(index);
        if (right < size && data[right] > data[maxIndex]) {
            maxIndex = right;
        }
        if (index != maxIndex) {
            swap(index, maxIndex);
            siftDown(maxIndex);
        }
    }

    public void insert(int value) {
        ensureCapacity();
        data[size] = value;
        size++;
        siftUp(size - 1);
    }

    public int popMax() {
        int result = data[0];
        data[0] = data[size - 1];
        size--;
        siftDown(0);
        return result;
    }
}
