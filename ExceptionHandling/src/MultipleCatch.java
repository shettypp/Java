public class MultipleCatch {
    public static void main(String[] arg){
        int i=10;
        int j=0;
        int[] arr={1,2,3};
        try{
            j=10/i;
            System.out.println(arr[4]);
        }
        catch(ArithmeticException e){
            System.out.println("Its Arithametic Exception ");
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("It's index out of bound exception " );
        }
        finally{
            System.out.println(j);
        }
    }
}
