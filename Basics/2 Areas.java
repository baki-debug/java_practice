import java.util.Scanner;
class Area {

public static void main(String args[]){
final double pi = 3.14;
Scanner sc = new Scanner(System.in);
System.out.print("Enter radius of circle : ");
double r = sc.nextDouble();
double area = pi*r*r;
System.out.print("Area of circle is " + area);

System.out.print("Enter side of square : ");
double s=sc.nextDouble();
double area2 = s*s;
System.out.print("Area of square is "+area2);

System.out.print("Enter sides of rectangle : ");
double a=sc.nextDouble();
double b=sc.nextDouble();
double area3 = a*b ;
System.out.print("Area of rectangle is "+area3);
}
}