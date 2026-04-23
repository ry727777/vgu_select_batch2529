package Array;

public class InsertDelete {
    int[] Elements = new int[100];
    int size = 0;
    int start = -1;

    // insertion in Data Structure array
    public void insertBeg(int value) {

        if (size >= 100) {
            System.out.println("Array is full now");
            return;
        }
        // shift right side first
        for (int i = size; i > 0; i--) {
            Elements[i] = Elements[i - 1];
        }
        Elements[0] = value;
        size++;
        start = size - 1;
    }

    public void insertEnd(int value) {
        if (size >= 100) {
            System.out.println("Array is full now");
            return;
        }
        start++;
        Elements[start] = value;
        size++;
    }

    public void insertAtIndex(int value, int idx) {
        if (size >= 100) {
            System.out.println("Array is full now");
            return;
        }
        for (int i = size; i > idx; i--) {
            Elements[i] = Elements[i - 1];
        }
        Elements[idx] = value;
        size++;
        start = size - 1;
    }

    // Deletion in Data Structure -> Array
    public void deleteBeg() {
        // [20 30 40 50]
        // 30 40 50

        if (size == 0) {
            System.out.println("There is no Element in array");
            return;
        }

        for (int i = 0; i < size; i++) {
            Elements[i] = Elements[i + 1];
        }
        size--;
        start = size - 1;
    }

    public void deleteEnd() {
        // [10, 20, 30, 40, 50]

        if (size == 0) {
            System.out.println("There is no Element in array");
            return;
        }

        size--;
        start = size - 1;
    }

    public void deleteAtIndex(int idx) {
        if (size == 0) {
            System.out.println("There is no Element in array");
            return;
        }

        for (int i = idx; i < size - 1; i++) {
            Elements[i] = Elements[i + 1];
        }
        size--;
        start = size - 1;
    }

    // Traversal of array data structure (Read the array)
    public void traverseArray() {
        for (int i = 0; i < size; i++) {
            System.out.print(Elements[i] + " ");
        }
    }

    public static void main(String[] args) {
        InsertDelete obj = new InsertDelete();

        obj.insertBeg(100);
        obj.insertEnd(20);
        obj.insertBeg(50);
        obj.insertAtIndex(200, 2);

        obj.traverseArray();
    }
}
