import java.util.Scanner; 

class Pojo{
private int a;
public void setA(int a){
this.a=a;
}
public int getA(){
return a;
}

}

class BL
{
public double fact(Pojo ref)
{  double f=1;
   for(int i=ref.getA();i>0;f=f*i,i--);
	return f;
}
}


class Test{

public static void main(String args[]){
Scanner sc = new Scanner(System.in);
Pojo ob=new Pojo();
System.out.println("Enter a number");
int num =sc.nextInt();
ob.setA(num);


System.out.println(new BL().fact(ob));

}}