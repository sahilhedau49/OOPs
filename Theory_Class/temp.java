package Theory_Class;

public class temp {
    int uid;
    String password;

    temp(int uid,String password){
        this.uid = uid;
        this.password = password;
    }

    int checkValid(){
        int count1=0;
        int count2=0;
        int count3=0;
        int count4=0;

        if(password.length()<8){
            return 0;
        }
        for(int i=0;i<password.length();i++){
            char c = password.charAt(i);
            if('a'<=c && c<='z'){
                count1++;
            }
            else if('A'<=c && c<='Z'){
                count2++;
            }
            else if(0<=c && c<=9){
                count3++;
            }
            else if(c=='@' || c=='$' || c=='&' || c=='*'){
                count4++;
            }
            else{
                return 0;
            }
        }

        if(count1>0 && count2>0 && count3>0 && count4>0){
            return 1;
        }

        return 0;
    }
}
