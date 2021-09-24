import java.util.Scanner; 

class Pojo{
private int a,b;

public void setA(int a){
this.a=a;
}
public int getA(){
return a;
}
public void setB(int b){
this.b=b;
}
public int getB(){
return b;
}



}

class BL
{ 
public void swap(Pojo ref)
{	

	int temp=ref.getA();
	ref.setA(ref.getB());
    //ref.getA()=ref.getB();
    ref.setB(temp);	

}
public void display(Pojo ref){
	
System.out.println("a = "+ref.getA()+"  b = "+ref.getB());
}
}
class Test{

public static void main(String args[]){
Scanner sc = new Scanner(System.in);

Pojo ob= new Pojo();
ob.setA(5);
ob.setB(9);
System.out.println("before swapping");
BL ob2=new BL();
ob2.display(ob);
ob2.swap(ob);
System.out.println("after swapping");
ob2.display(ob);

}}