// package OOPs_17_5;
public class uid {
    String id;
    void getid(String id) throws MyException{
        int flag = 0;
        if(id.charAt(0)=='C' && id.charAt(1)=='S'){
            if(id.charAt(2)=='0'){
                if(id.charAt(3)>='0' && id.charAt(3)<='5'){
                    if(id.charAt(4)>='0' && id.charAt(4)<='9'){
                        flag = 1;
                    }
                }
            }
        }
        if(id.charAt(0)=='I' && id.charAt(1)=='T'){
            if(id.charAt(2)=='0'){
                if(id.charAt(3)>='0' && id.charAt(3)<='5'){
                    if(id.charAt(4)>='0' && id.charAt(4)<='9'){
                        flag = 1;
                    }
                }
            }
        }
        if(id.charAt(0)=='E' && id.charAt(1)=='C'){
            if(id.charAt(2)=='0'){
                if(id.charAt(3)>='0' && id.charAt(3)<='5'){
                    if(id.charAt(4)>='0' && id.charAt(4)<='9'){
                        flag = 1;
                    }
                }
            }
        }

        if(flag==0 || id.length()>5){
            throw new MyException("Invalid UID!");
        }
    } 
}
