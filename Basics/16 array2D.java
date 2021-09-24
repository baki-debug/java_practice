import java.util.Scanner; 
class Arr{

public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.println("Enter the dimensions for first matrix:");
int m=sc.nextInt();
int n=sc.nextInt();
int a[][]=new int[m][n];


System.out.println("Enter first matrix");
for(int i=0;i<m;i++)
{	
	for(int j=0;j<n;j++)
	{
	a[i][j]=sc.nextInt();
	}
}


System.out.println("Enter the dimensions for second matrix:");
int o=sc.nextInt();
int p=sc.nextInt();
int b[][]=new int[o][p];


System.out.println("Enter second matrix");
for(int i=0;i<o;i++)
{	
	for(int j=0;j<p;j++)
	{
	b[i][j]=sc.nextInt();
	}
}

System.out.println("\tmatrix A is :");

for(int x[]:a)
{
	for(int y:x)
	{
	System.out.print("\t"+y);
	}
System.out.println("");
}

System.out.println("\tmatrix B is :");

for(int x[]:b)
{
	for(int y:x)
	{
	System.out.print("\t"+y);
	}
System.out.println("");
}



if(m==o&&n==p)
{
int c[][]=new int[m][p];
for(int i=0;i<m;i++)
{	
	for(int j=0;j<n;j++)
	{
	c[i][j]=a[i][j]+b[i][j];
	}
}
System.out.println("\tSum of matrix a and b is :");
for(int x[]:c)
{
	for(int y:x)
	{
	System.out.print("\t"+y);
	}
System.out.println("");
}
}
else
{System.out.println("Matrix addition not possible");}





if(n==o)
{
int c[][]=new int[m][p];
for(int i=0;i<m;i++)
{	
	for(int j=0;j<n;j++)
	{
	c[i][j]=a[i][j]*b[j][i];
	}
}
System.out.println("\tProduct of matrix a and b is :");
for(int x[]:c)
{
	for(int y:x)
	{
	System.out.print("\t"+y);
	}
System.out.println("");
}
}
else
{System.out.println("Matrix Multiplication not possible");}

if(m==n)
{
System.out.println("Diagonal of matrix is ");
for(int i=0;i<m;i++)
{	
	for(int j=0;j<n;j++)
	{
	if(i==j)
		System.out.print("\t"+a[i][j]);
	else
		System.out.print("\t"+" ");
	}
System.out.println("");
}

System.out.println("2nd Diagonal of matrix is ");
for(int i=0;i<m;i++)
{	
	for(int j=0;j<n;j++)
	{
	if(i==m-(j+1))
		System.out.print("\t"+a[i][j]);
	else
		System.out.print("\t"+" ");
	}
System.out.println("");
}
}
else
System.out.println("Diagonal matrix not possible");


if(m==n)
{
System.out.println("Lower triangle of matrix is ");
for(int i=0;i<m;i++)
{	
	for(int j=0;j<=i;j++)
	{
	
		System.out.print("\t"+a[i][j]);
		
	}
System.out.println("");
}

System.out.println("Upper triangle of matrix is ");
for(int i=0;i<m;i++)
{	
	for(int j=0;j<=(m-(i+1));j++)
	{
		System.out.print("\t"+a[i][j]);
	}
System.out.println("");
}
}
else
System.out.println("Triangle of matrix not possible");


}}