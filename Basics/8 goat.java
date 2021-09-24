import java.util.Scanner; 
class Goat{

public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int p,c,m,b;
System.out.println("Enter First number");
p=sc.nextInt();
System.out.println("Enter Second number");
c=sc.nextInt();
System.out.println("Enter Third number");
m=sc.nextInt();
System.out.println("Enter Fourth number");
b=sc.nextInt();

int x,y;
if(p>c)
	x=p;
else 
	x=c;

if(m>b)
	y=m;
else
	y=b;

if(x>y)
	System.out.println("Greatest of all numbers is "+x);

else if(x<=y)
	System.out.println("Greatest of all numbers is "+y);

}}