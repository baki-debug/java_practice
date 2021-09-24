import java.util.Scanner;

class Area{
    final public double pi=3.14;
    protected int r;
    public Area(int r){
        return pi*r*r; 
        System.out.print(pi*r*r);
    }
}
class Vol extends Area{
    public Vol(int r){
        return 4*(Area()*r)/3;
        System.out.print(4*(Area()*r)/3);
    }
}


class Circle{
    Vol ob=new Vol();
    ob.Vol(3);
    //System.out.print(ob.Area(3));
    
}