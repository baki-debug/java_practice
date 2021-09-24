import java.util.Scanner; 
class Calc{

public static void main(String args[]){
int ch;
Scanner sc = new Scanner(System.in);
do{

System.out.println("1. Addition \n2. Subtraction \n3. Multiplication \n4. Division \n5. Modulous \n6. Exit");
System.out.println("Enter your choice");
ch = sc.nextInt();
System.out.println("Enter first number :");
double a = sc.nextDouble();
System.out.println("Enter second number :");
double b = sc.nextDouble();
switch(ch)
{
case 1: System.out.println("Result="+(a+b));break;

case 2: System.out.println("Result="+(a-b));break;

case 3: System.out.println("Result="+(a*b));break;

case 4: System.out.println("Result="+(a/b));break;

case 5: System.out.println("Result="+(a%b));break;

}}while(ch<6);
}}