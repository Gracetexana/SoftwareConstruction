package session;

public class CounterThread extends Thread{
    private int number;

    public CounterThread(int number){
        this.number = number;
    }

    @Override
    public void run(){
        for (int i=1; i<101; i++){
            System.out.println("thread " + number + ": " + i);
        }
    }

    public static void main(String[] args){
        CounterThread myThread = new CounterThread(1);

        System.out.println(myThread.isAlive());

        myThread.start();
        System.out.println(myThread.isAlive());
        
        try{
            myThread.sleep(1000);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(myThread.isAlive());
        
    }
}
