
package pack5;

public interface Anonym {
    double cal(int a , int b);
}

class Testis{
    public static void main(String[] args) {
        Anonym ob1=new Anonym(){
            public double cal(int a ,int b) {
                return a+b;
            }      
        };
        Anonym ob2=new Anonym(){
            public double cal(int a ,int b) {
                return a-b;
            }      
        };
        Anonym ob3=new Anonym(){
            public double cal(int a ,int b) {
                return a*b;
            }      
        };
        Anonym ob4=new Anonym(){
            public double cal(int a ,int b) {
                return 1.0*a/b;
            }      
        };
        
        System.out.println(""+ob1.cal(5, 6));  
        System.out.println(""+ob2.cal(5, 6));  
        System.out.println(""+ob3.cal(5, 6));  
        System.out.println(""+ob4.cal(5, 6));  
            }
}