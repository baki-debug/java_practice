import java.util.Scanner; 

class Height{
private int a,b;

public Height(){};
public Height(int a,int b){
this.a=a;
this.b=b;
}

public void get(){
System.out.println("Feet="+a+" Inches="+b);
}

public void addHeight(Height k1,Height k2){
this.a=k1.a+k2.a;
this.b=k1.b+k2.b;
if(this.b>=12)
	{
	this.a=this.a+this.b/12;
	this.b=this.b%12;
}
}
}

class HeightOreo{

public static void main(String args[]){
Height ob1=new Height(68,96);
Height ob2=new Height(33,85);
ob1.get();
ob2.get();
Height ob3=new Height();
ob3.addHeight(ob1,ob2);
ob3.get();

}}