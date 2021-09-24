import java.util.Scanner; 
class Table{

public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.println("Enter a natural number");
int n = sc.nextInt();

int fact=1;
for(int i=n;i>0;i--)
{
	fact=fact*i;
}
System.out.println("factorial="+fact);

}}