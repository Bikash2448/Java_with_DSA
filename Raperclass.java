// Array List.................................

import java.util.ArrayList;
public class Raperclass {
    public static void main(String[] args) {
        // Integer i=new Integer(4);
        // Float f=Float.valueOf(4.5f);
        // Integer g=Integer.valueOf(5);
        // System.out.println(i+" "+f+" "+g);
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(2);
        ar.add(4);
        ar.add(6);
        ar.add(8);
        System.out.println(ar.get(1));
        for(int i=0;i<ar.size();i++){
            System.out.print(ar.get(i)+" ");
        }
        System.out.println();
        System.out.println(ar);
        ar.add(2,5);
        System.out.println(ar);
        ar.remove(2);
        System.out.println(ar);
        // Add Element any Where
        ar.set(0,1);
        System.out.println(ar);
        // Removing value of Array
        ar.remove(Integer.valueOf(1));
        System.out.println(ar);
        // Checking if element exit or not
        Boolean ans = ar.contains(Integer.valueOf(6));
        System.out.println(ans);
        ar.add(0, 2);
        System.out.println(ar);
        System.out.println(ar.indexOf(Integer.valueOf(2)));
    }
}
