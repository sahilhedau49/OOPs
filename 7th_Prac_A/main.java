// package 7th_Prac;

public class main {
    public static void main(String[] args) {

        try {
            MyArray<Integer> a = new MyArray<>(5);
            a.add(2);
            a.add(49);
            a.add(1);
            a.add(10);
            a.add(6);
            a.add(19);
            a.add(18);
            a.add(7);
            a.display();
            a.swap(1, 3);
            System.out.print("\n\nAfter swaping!");
            a.display();
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}
