package session;

import java.util.ArrayList;
import java.util.List;

public class ManyCounters {
    public static void main(String[] args){
        CounterThread thread1 = new CounterThread(1);
        CounterThread thread2 = new CounterThread(2);
        CounterThread thread3 = new CounterThread(3);
        CounterThread thread4 = new CounterThread(4);
        CounterThread thread5 = new CounterThread(5);
        CounterThread thread6 = new CounterThread(6);
        CounterThread thread7 = new CounterThread(7);
        CounterThread thread8 = new CounterThread(8);
        CounterThread thread9 = new CounterThread(9);
        CounterThread thread10 = new CounterThread(10);

        List<Thread> list = new ArrayList<>();
        list.add(thread1);
        list.add(thread2);
        list.add(thread3);
        list.add(thread4);
        list.add(thread5);
        list.add(thread6);
        list.add(thread7);
        list.add(thread8);
        list.add(thread9);
        list.add(thread10);

        for (Thread thread : list){
            thread.start();
        }

        for (Thread thread : list){
            try{
                thread.join();
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

        boolean allDead = false;
        while (!allDead){
            allDead = true;
            for (Thread thread : list){
                if (thread.isAlive()){
                    allDead = false;
                }
            }
        }
        System.out.println("All done!");
        
    }
}
