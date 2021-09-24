import java.util.Scanner; 

class Pojo{
private int a;
public void setA(int a)
{
this.a=a;
}
public int getA()
{
return a;
}
}

class BL
{
public boolean prime(Pojo ref)
{  
	if(ref.getA()==0||ref.getA()==1)
		System.out.print("Not prime");		
	else 
	{
	for(int i=2;i<(ref.getA()/2);i++)
	{
	  if(ref.getA()%i==0)
		{ return false; 
		break  }
	  else
	    return true;
	}
	}	
}
}

class Test{

public static void main(String args[]){
Scanner sc = new Scanner(System.in);
Pojo ob=new Pojo();
System.out.println("Enter a number");
int num =sc.nextInt();
ob.setA(num);
new BL().prime(ob);
}}