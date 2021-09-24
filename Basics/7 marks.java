import java.util.Scanner; 
class Age{

public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter your marks in Physics");
double p=sc.nextDouble();
System.out.println("Enter your marks in Chem");
double c=sc.nextDouble();
System.out.println("Enter your marks in Maths");
double m=sc.nextDouble();


if(p>32 && c>32 && m>32)
	System.out.println("You Pass in all three subjects");
else if(p<=32 && c<=32 && m<=32)
	System.out.println("You Fail in all three subjects");
else if(p<33 && c<33 && m>=33)
	System.out.println("You Fail in 2 subject");
else if(m<33 && c<33 && p>=33)
	System.out.println("You Fail in 2 subject");
else if(p<33 && m<33 && c>=33)
	System.out.println("You Fail in 2 subject");
else if(p<33 || c<33 || m<33)
	System.out.println("You fail in one subject");

}}