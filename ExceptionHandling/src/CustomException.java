class MyException extends Exception{
    public MyException(String msg){
        super(msg);
    }
}
public class CustomException {
    public static void main(String[] arg){
        int i=0,j=0;
        try{
            if(j==0)
               throw new MyException("It is nothing");
        }
        catch(MyException e){
            j=10/1;
            System.out.println(e);
        }
        finally {
            System.out.println(j);
        }
    }
}
