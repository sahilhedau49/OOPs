// package OOPs_17_5;
public class main {
    public static void main(String[] args) {
        uid u1 = new uid();
        try{
            u1.getid("CS0001");
        }
        catch(MyException e){
            String error = e.displayException();
            System.out.print("Exception Found "+error);
        }
    }
}
