public class Main {
    public static void main(String[] args) {
        int i=10;
        int j=0;

        //j=18/i;
        try{
            i=18/j;

        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        System.out.println(i);
        System.out.println("Bye");
    }
}