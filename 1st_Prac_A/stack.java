// package 1st_Prac_A;

public class stack {
    int top;
    int MAXSIZE = 20;
    int a[] = new int[MAXSIZE];
    
    stack(){
        top = -1;
    }
    
    int pop(){
        if(isEmpty()==0){
            System.out.println("Popped Element: "+ a[top]);
            int data = a[top];
            top--;
            return data;
        }
        System.out.println("STACK UNDERFLOW");
        return -1;
    }
    
    void push(int num){
        if(isFull()==0){
            top++;
            a[top] = num;
        }
    }
    
    int isEmpty(){
        if(top == -1){
            System.out.println("Stack Empty!");
            return 1;
        }
        return 0;
    }
    
    int isFull(){
        if(top == MAXSIZE-1){       
            System.out.println("Stack Full!");
            return 1;
        }
        return 0;
    }
    
    int peek(){
        if(isEmpty()==0){
            System.out.println("Peek --> "+ a[top]);
            return a[top];
        }
        System.out.println("STACK UNDERFLOW");
        return -1;
    }
}
