import java.util.Scanner;
class Celcius {

public static void main(String args[]){

Scanner sc = new Scanner(System.in);
System.out.print("Enter temperature in farenhite : ");
double F = sc.nextDouble();
double C = 5*(F-32)/9;
System.out.print("Temperature in Celcius is ");
System.out.println(C);
}
}