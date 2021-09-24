import java.util.Scanner;
class Peris {

public static void main(String args[]){
final double pi = 3.14;
Scanner sc = new Scanner(System.in);
System.out.print("Enter radius of circle : ");
double r = sc.nextDouble();
double peri = 2*pi*r;
System.out.print("Circumference of circle is ");
System.out.println(peri);	

System.out.print("Enter side of square : ");
double s=sc.nextDouble();
double peri2 = 4*s;
System.out.print("Perimeter of square is ");
System.out.println(peri2);

System.out.print("Enter sides of rectangle : ");
double a=sc.nextDouble();
double b=sc.nextDouble();
double peri3 = 2*(a+b);
System.out.print("Perimeter of rectangle is ");
System.out.println(peri3);
}
}