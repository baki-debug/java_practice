import java.util.Scanner; 
class Table{

public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.println("Enter a number");
int x = sc.nextInt();
System.out.println("Enter the power");
int y = sc.nextInt();

int fact=1;
for(int i=1;i<=y;i++)
{
	fact=fact*x;
}
System.out.println("Result="+fact);

}}