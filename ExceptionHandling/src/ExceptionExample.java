public class ExceptionExample {
    public static void main(String[] args){
        int i=10;
        int j=0;
    try{
            if(j==0)
                throw new ArithmeticException(" j is equal to 0 ");
        }
    catch(ArithmeticException e){
           j=10/1;
           System.out.println(" Something went wrong "+ e);
        }
    finally{
        System.out.println(j);
    }
    }

}
