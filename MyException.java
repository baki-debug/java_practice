
public class MyException extends Exception{
    
    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
        
}


class Testis extends MyException {
    public static void main(String[] args) {
        
    int a=6;
    try { 
        if(a==5){
        for(int i=0;i<a;i++){
            System.out.println(""+i);
        }
        
        }
        throw new MyException("Exception works");
    }
    catch (MyException ref){
        System.out.println(""+ref);
    }
}
}