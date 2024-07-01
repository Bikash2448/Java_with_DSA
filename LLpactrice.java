public class LLpactrice {
    public static class Function{
        Node head = null;
        Node tail = null;
        int count = 0;
        void insert_in_end(int a){
            Node temp = new Node(a);
            if(head==null){
                head=temp;
                tail=temp;
            }else{
                tail.next=temp;
                tail=temp;
            }
            count++;

        }
        void insert_in_first(int a){
            Node temp = new Node(a);
            if(head==null){
                head=temp;
                tail=temp;
            }else{
                temp.next=head;
                head=temp;
            }
            count++;
        }
        void insert_in_anywhere(int idx,int val){
            Node temp = new Node(val);
            Node a = head;
            for(int i=0;i<idx-1;i++){
                a=temp.next;
            } 
            temp.next=a.next;
            a.next=temp;
            count++;
        }
        void delete(int idx){
            Node temp = head;
            for(int i=0;i<idx-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            count--;
        }
        void display(){
            Node temp = head;
            while (temp!=null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
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
        L.insert_in_end(4);
        L.insert_in_end(8);
        L.display();
        System.out.println();
        L.insert_in_first(2);
        L.display();
        L.insert_in_end(10);
        System.out.println();
        L.display();
        L.insert_in_anywhere(1, 12);
        System.out.println();
        L.display();
        L.delete(1);
        System.out.println();
        L.display();
        System.out.println();
        System.out.println(L.count);
    }
    
}
