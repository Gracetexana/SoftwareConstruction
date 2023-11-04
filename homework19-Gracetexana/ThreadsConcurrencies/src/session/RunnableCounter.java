package session;

public class RunnableCounter implements Runnable{
    private int number;

    public RunnableCounter(int number){
        this.number = number;
    }

    @Override
    public void run() {
        for (int i=1; i<101; i++){
            System.out.println("runnable " + number + ": " + i);
        }
    }

    public static void main(String[] args){
        RunnableCounter myCounter = new RunnableCounter(1);
        Thread myThread = new Thread(myCounter);
        myThread.start();
    }
    
}
