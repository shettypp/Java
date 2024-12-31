import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arraylist =new ArrayList<>();
        // add
        arraylist.add(1);
        System.out.println(arraylist);
        for (int i=1;i<10;i++){
            int n=sc.nextInt();
            arraylist.add(n);
        }
        System.out.println(arraylist);
        // delete
        arraylist.remove(0);
        System.out.println(arraylist);
        //add in between
        arraylist.add(3,4);
        System.out.println(arraylist);
        //get
        arraylist.get(2);
        System.out.println(arraylist);
        //set
        arraylist.set(2,9);
        System.out.println(arraylist);
        //size
        arraylist.size();
        //loops
        for(int i=0;i<arraylist.size();i++){
            System.out.println("Array List : "+ arraylist.get(i));
        }

    }
}