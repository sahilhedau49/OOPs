// package 7th_Prac;

public class MyArray<t> {
    t a[];
    int lastIndex = -1;
    int size;

    MyArray(int n) {
        a = (t[]) new Object[n];
        size = n;
        lastIndex = 0;
    }

    private void grow() {
        int l = size;
        size = (int) (1.5 * size);
        t temp[] = (t[]) new Object[size];
        for (int i = 0; i < l; i++) {
            temp[i] = a[i];
        }
        a = temp;
        System.out.println("Resized!!! With Size = " + size);
    }

    void add(t n) {
        if (lastIndex == size) {
            grow();
            a[lastIndex++] = n;
        } else {
            a[lastIndex++] = n;
        }
    }

    void swap(int index1, int index2) {
        if (index1 < 0 && index1 > lastIndex && index2 < 0 && index2 > lastIndex) {
            System.out.println("Invalid Index");
        } else {
            t temp;
            temp = a[index1];
            a[index1] = a[index2];
            a[index2] = temp;
        }
    }

    void display() {
        System.out.print("\nArray --> ");
        for (int i = 0; i < lastIndex; i++) {
            System.out.print(a[i] + " ");
        }
    }

}
