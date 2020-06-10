package DailyPrac;

import java.util.Scanner;

public class QueueTest {
    private Node first;
    private Node last;
    private int N;

    private class Node {
        int item;
        Node next;
    }

    public QueueTest() {
        first = null;
        last  = null;
        N = 0;
    }

    public boolean isEmpty() { return first==null; }
    public int size(){return N;}

    public void enqueue(int item){
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) first = last;
        else           oldlast.next = last;
        N++;
    }

    public void dequeue(){
        if (isEmpty())
            return;
        else{
            int item = first.item;
            first = first.next;
            N--;
        }
        if (isEmpty()) last = null;   // to avoid loitering
        //return item;
    }

    public int top(){
        if (isEmpty())
            return -1;
        int item = first.item;
        return item;
    }

    public void clear(){
        while(!isEmpty()){
            dequeue();
        }
    }

    public void Clear(){
        first = null;
        last  = null;
        N = 0;
    }



    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        QueueTest queue = new QueueTest();
        String test1=in.nextLine();

        int T=Integer.parseInt(test1);
        int[] groupLength = new int[T];
        while(in.hasNext()){
            for(int m=0;m<T;m++)
            {
                groupLength[m]=Integer.parseInt(in.nextLine());
                for(int j=0;j<groupLength[m];j++)
                {
                    String str=in.nextLine();
                    String[] word=str.split("\\s+");
                    if(word[0].equals("PUSH")){
                        int i=Integer.parseInt(word[1]);
                        queue.enqueue(i);
                        continue;
                    }
                    if(word[0].equals("POP")){
                        if(queue.isEmpty()){
                            System.out.println(-1);
                            continue;
                        }
                        queue.dequeue();
                        continue;
                    }
                    if(word[0].equals("SIZE")){
                        System.out.println(queue.size());
                        continue;
                    }
                    if(word[0].equals("CLEAR")){
                        queue.Clear();
                        continue;
                    }
                    if(word[0].equals("TOP")){
                        System.out.println(queue.top());
                        continue;
                    }
                }
            }
        }



    }

}