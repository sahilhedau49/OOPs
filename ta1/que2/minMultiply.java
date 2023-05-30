// package ta1.que2;

public class minMultiply {

    private static int countMultiplications(int base, int exponent){
        if(exponent == 0){
            return 0;
        }
        else if(exponent%2 == 0){
            int halfExp = countMultiplications(base, exponent/2);
            return halfExp+1;
        }
        else{
            int halfExp = countMultiplications(base, (exponent-1)/2);
            return halfExp+2;
        }
    }

    public int findMinMultications(int n){
        if(n <= 1){
            return 0;
        }

        int minMultiplication = Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            int multiplications = countMultiplications(i,n);
            minMultiplication = Math.min(minMultiplication,multiplications);
        }

        return minMultiplication;
    }
}
