package Stacks;

import javax.sound.midi.SysexMessage;
import java.lang.reflect.Array;

public class StackWithArrays {
    int top=-1;
    int size;
    int[] stackArr;

    public void push(int data) {
        if (isEmpty()) {
            stackArr = new int[10];
        }
        if (size >= stackArr.length) {
            System.out.println("Stack is full. Cannot add new Elements");
        } else {
            top=top+1;
            stackArr[top]=data;
            size++;
        }
    }

    public void pop() {
        if(isEmpty()){
            System.out.println("Stack is empty");
        }else{
            int item=stackArr[top];
            stackArr[top]=-1;
            top=top-1;
            System.out.println(item);
        }
    }

   public void peek() {
        if(isEmpty()) System.out.println("Stackis empty");
        else {
            System.out.println(stackArr[top]);
        }
    }

    public void traverse(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }else {
            int topValue=top;
            while (topValue>-1){
                System.out.println(stackArr[topValue]);
                System.out.println("-----");
                topValue=topValue-1;
            }
        }
    }

    boolean isEmpty() {
        return top == -1;
    }


}
