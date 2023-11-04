package session;

public class BlastOff extends Thread{
    @Override
    public void run(){
        for (int i=-10; i>-11; i++){
            System.out.println("T" + ((i>=0) ? "+" : "") + i);
            try{
                sleep(1000);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args){
        BlastOff myThread = new BlastOff();
        myThread.start();
    }
}
