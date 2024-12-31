// Checkable
//import java.io.IOException;
//
//public class Throws{
//    public static void main(String[] arg){
//        try{
//            file();
//        }
//        catch(IOException e){
//            System.out.println("Exception handeled :  "+ e);
//        }
//        }
//    public static void  file() throws IOException{
//        throw new IOException();
//    }
//}

// Uncheckable

public class Throws{
    public static void main(String[] arg){
        int i=0;
        int j=0;
        try{
            if(j==0);
            arith();
        }
        catch(ArithmeticException e){
            System.out.println("Exception handeled: "+e);
        }
    }
    public static void arith() throws ArithmeticException{
         throw new ArithmeticException();
    }
}
