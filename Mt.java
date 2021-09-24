
public class Mt extends Thread{
    public void run(){
        for(int k=0;k<24;k++){
            for(int j=0;j<60;j++){
                for (int i=0 ; i <60;i++){
                    try{
                        System.out.println(""+k+" : "+ j+ " : "+i);
                        Thread.sleep(1000);
                        }   
                    catch (InterruptedException ex) {
                    System.out.println(""+ex);
                        } 
                }
            }
        }
    }
}

class Testor {
    public static void main(String[] args) {
        Mt ob = new Mt();        
        ob.start();
    }
}
