import java.util.Scanner; 
class Odd{

public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.println("Enter a natural number");
int n = sc.nextInt();
int sum=0;
for(int i=1;i<=2*n;i++)
{
if(i%2==1)
	sum=sum+i;
}
System.out.println(sum);
}}