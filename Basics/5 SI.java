import java.util.Scanner; 
class Si {

public static void main(String args[]){

Scanner sc = new Scanner(System.in);
System.out.print("Enter Principal ");
double p = sc.nextDouble();
System.out.print("Enter Rate of interest ");
double r = sc.nextDouble();
System.out.print("Enter time ");
double t = sc.nextDouble();

double si= (p*r*t)/100;

System.out.print("Simple interest is " + si);
}
}