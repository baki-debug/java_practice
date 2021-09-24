class Test {
public static void main(String []args)
{
int a=Integer.parseInt(args[0]);

int b=Integer.parseInt(args[1]);

try {
int c=a/b;
System.out.println("result="+c);
}

catch(ArithmeticException ref){
System.out.println("Doing it Wrong !!! change approach ");
System.out.println(""+ref);
System.out.println("");

System.out.println(""+ref.getMessage());

System.out.println("");
ref.printStackTrace();


}

System.out.println("Hello ");
}}
