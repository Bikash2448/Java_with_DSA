public class Linkedlistpac {
    public static class Function{
        Node head= null;
        Node tail =null;
        int count = 0;
        void insert_in_end(int val){
            Node temp = new Node(val);
            if(head==null){
                head=temp;
            }else{
                tail.next=temp;
            }
            tail=temp;
            count++;
        }
        void insert_in_first(int val){
            Node temp = new Node(val);
            if(head==null){
                head=temp;
                tail = temp;
            }else{
                temp.next=head;
                head=temp;
            }
            count++;
        }
        void insert_in_anywhere(int indx,int val){
            Node n = new Node(val);
            Node temp = head;
            for(int i = 0;i<indx-1;i++){
                temp=temp.next;
            }
            n.next=temp.next;
            temp.next=n;
            count++;
        }
        void display(){
            Node temp = head;
            while (temp!=null) {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }
    public static class Node{
        int data;
        Node next;
        Node(int a){
            data=a;
        }
    }
    public static void main(String[] args) {
        Function L = new Function();
        L.insert_in_end(2);
        L.insert_in_end(4);
        L.insert_in_first(1);
        L.insert_in_anywhere(1,8);
        L.insert_in_first(0);
        L.insert_in_end(100);
        L.display();
        System.out.println();
        L.insert_in_anywhere(4,48);
        L.display();
    }
}
