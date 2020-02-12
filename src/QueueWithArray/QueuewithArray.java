package QueueWithArray;

/*
    Created by Abhinav Bhardwaj on IntelliJ IDEA
    on   12-02-2020 ,  Time :-    16 : 09
 
 */
public class QueuewithArray {
     int arr[];
     int top;
     int beginning;

     public QueuewithArray ( int size ){
         arr = new int[size];
         top = -1;
         beginning = -1;
     }


     public boolean isQueueFull(){
         if (top == arr.length-1){
             return true;
         }
         else {
             return false;
         }
     }

     public boolean isQueueEmpty(){
         if (beginning == -1  || beginning == arr.length){
             return true;
         }
         else {
             return false;
         }
     }
     public void enqueue( int val ){
         if (arr == null){
             System.out.println("Create queue first. ");
         }
         else {
             if(beginning == 0 && top==arr.length-1){
                 System.out.println("Queue is full. ");
             }
             else if(isQueueEmpty()){
                 beginning ++;
                 top++;
                 arr[top] = val;
             }
             else {
                 top ++;
                 arr[top] = val;
             }
         }
     }

     public void dequeue(){
         if (isQueueEmpty()){
             System.out.println("Underflow... ");
         }
         else {
             beginning ++;
             System.out.println(arr[beginning-1]);
             arr[beginning-1]=0;

             if(beginning > top){
                 beginning = top = -1;
             }
         }
     }

     public void printQueue(){
         if (isQueueEmpty()){
             System.out.println("Queue is empty ( Underflow Condition ) ... ");
         }
         else {
             for(int i = beginning ; i <= top ; i++ ){
                 System.out.print(arr[i] + ", ");
             }
         }
     }

     public void peekQueue(){
         if (isQueueEmpty()){
             System.out.println("Underflow Condition... ");
         }
         else {
             System.out.print(arr[beginning]);
         }
     }

     public void deleteQueue(){
         arr = null ;
         System.out.println("Queue deleted... ");
     }
}