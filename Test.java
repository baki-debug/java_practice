
class Emp{
    int id ;
    String name;
    int sal;

    public Emp() {
    }

    public Emp(int id, String name, int sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }
}
public class Test {
    public static void main(String[] args) {
    Emp e=new Emp(101,"baki",600);
    System.out.println("id="+e.id+"\n"+"name="+e.name+"\n"+"sal="+e.sal);     
} 
}

