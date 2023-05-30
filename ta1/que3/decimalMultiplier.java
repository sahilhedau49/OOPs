// package ta1.que3;

public class decimalMultiplier {
    int[] darray;

    decimalMultiplier(int[] decimalArray){
        darray = decimalArray;
    }

    int multiplyarray(int x){
        int carry = 0;
        for (int i = darray.length - 1; i >= 0; i--) {
        int a = darray[i]*x + carry;
        darray[i] = a % 10;
        carry = a/10;
        }
        return carry;
    }

    int[] returnarray(){
        return darray;
    }
}
