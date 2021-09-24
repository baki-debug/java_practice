
public class StringPracrice {
    public static void main(String[] args) {
        
    
       String s= new String("Bakhshish");
       String s2= new String("Bakhshish");
       String s3= new String("bakhshish");
        System.out.println(""+s);
        System.out.println(""+s.length());
        System.out.println(""+s2.trim().length());
        System.out.println(""+s.toLowerCase());
        System.out.println(""+s.toUpperCase());
        System.out.println(""+s.isEmpty());
        System.out.println(""+s.charAt(3));
        System.out.println(""+s.indexOf("sh"));
        System.out.println(""+s.lastIndexOf("sh"));
    
    if(s.equals(s2))
            System.out.println("true");
    else
            System.out.println("false");
    
    
    if(s2.equals(s3))
            System.out.println("true");
    else
            System.out.println("false");
    
    
    if(s.equalsIgnoreCase(s3))
            System.out.println("true");
    else
            System.out.println("false");
    
    }}

