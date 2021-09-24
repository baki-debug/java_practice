import java.util.Scanner; 
class Arr{

public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.println("Enter the number of elements you want :");
int n=sc.nextInt();
int a[]=new int[n];


System.out.println("Enter an array");
for(int i=0;i<a.length;i++)
{
	a[i]=sc.nextInt();
}

System.out.println("Original array is :");

for(int x:a)
{
	System.out.print("  "+x);
}
System.out.println("");

int sum =0;
for(int i=0;i<a.length;i++)
{
	sum=sum+a[i];
}
System.out.println("sum of elements="+sum);

int max=a[0];
for(int i=0;i<a.length;i++)
{
	if(max<a[i])
		max=a[i];
}
System.out.println("Max element = "+max);

int min=a[0];
for(int i=0;i<a.length;i++)
{
	if(min>a[i])
		min=a[i];
}
System.out.println("Min element = "+min);


int max2=a[0];
for(int i=0;i<a.length;i++)
{
	if(max2<a[i] && a[i]!=max)
			max2=a[i];
}
System.out.println("Second Largest "+max2);



for(int i=0;i<(a.length/2);i++)
{
	a[i]=a[i]+a[a.length-(i+1)];
	a[a.length-(i+1)]=a[i]-a[a.length-(i+1)];
	a[i]=a[i]-a[a.length-(i+1)];
}
for(int i=0;i<a.length;i++)
{

System.out.print("\t"+a[i]);
}

}}