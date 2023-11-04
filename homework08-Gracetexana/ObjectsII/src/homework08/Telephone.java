package homework08;
/*
 * Grace Texana Long Torales
 * gtl1500@g.rit.edu
 */

import java.util.ArrayList;

public class Telephone {
    private static int nextSequence = 5550001;
    private static ArrayList<Integer> taken = new ArrayList<>(); // to keep track of used sequences to avoid duplication (unless the number is manually entered-- then it may be duplicated)
    private static int numberOfCalls = 0;

    private Type type; // I did not know how to make it so that only certain Strings were allowed
    private int sequence;
    private ArrayList<Integer> recentCalls = new ArrayList<>();
    private boolean callInProgress = false;
    
    public Telephone(Type type){      
        this.type = type;

        nextAvailableSequence(); // avoid duplicates
        this.sequence = nextSequence;
        taken.add(this.sequence);
    }

    public Telephone(Type type, int sequence){
        this.type = type;
        this.sequence = sequence;
        taken.add(this.sequence);
    }

    public static int getNumberOfCalls(){
        return numberOfCalls;
    }

    public Type getType(){
        return type;
    }

    public int getSequence(){
        return sequence;
    }

    public boolean getCallInProgress(){
        return callInProgress;
    }

    public void setType(Type newType){
        type = newType;
    }

    public void setSequence(int newSequence){
        taken.remove(sequence); // if we are keeping track of the numbers in use, the old number is no longer in use (by this phone)
        sequence = newSequence;
        taken.add(sequence);
    }

    /**
     * increases nextSequence until there is a sequence that has not yet been assigned to a phone
     */
    public void nextAvailableSequence(){
        while (taken.contains(nextSequence)){
            nextSequence++;
        }
    }

    /**
     * dials the specified number if possible
     * it is not possible to dial the phone's own number; an error message is printed
     * it is not possible to dial a number while a call is already in progress (the current call must be disconnected in order to place a new call); an error message is printed
     * if the call is possible, numberOfCalls (which keeps track of the count of all calls made by all phones created) is increased by 1 and callInProgress is assigned a value of true
     * @param dialedNumber the number to call
     */
    public void dial(int dialedNumber){
        if (dialedNumber == this.sequence){
            System.out.println("Error: You are dialing yourself.");

        } else if (callInProgress){
            System.out.println("Error: You are already in another call.");

        } else{
            System.out.println("Starting call to " + dialedNumber);
            switch (recentCalls.size()){
                case 10:
                    recentCalls.remove(0);
                default:
                    recentCalls.add(dialedNumber);
            }
            callInProgress = true;
            numberOfCalls++;
        }
    }

    /**
     * ends a call that is currently in progress if there is one; assigns callInProgress a value of false
     * if there is no call currently in progress, an error message is printed
     */
    public void disconnect(){
        if (!callInProgress){
            System.out.println("Error: No call in progress");

        } else{
            System.out.println("Ending call with " + latestCall());
            callInProgress = false;
        }
    }

    /**
     * returns the number most recently dialed or 0 if no number has been dialed
     * @return the number most recently dialed or 0 if no number has been dialed
     */
    public int latestCall(){
        switch (recentCalls.size()){
            case 0:
                return 0;
            default:
                return recentCalls.get(recentCalls.size() - 1);
        }
    }

    /**
     * calls the number most recently dialed if there is one
     * if no calls have been made previously, prints an error message
     */
    public void redial(){
        if (latestCall() == 0){
            System.out.println("Error: There is no number to redial.");
        } else{
            dial(latestCall());
        } 
    }

    /**
     * returns a string listing the numbers of the 10 most recent (successful) calls starting with most recent
     * @return a list of recent calls
     */
    public String recentCallsList(){
        StringBuilder list = new StringBuilder("Recent calls:\n");

            if (latestCall() == 0){
            list.append("N/A\n");

        } else{
            for (int i=recentCalls.size()-1; i>=0; i--){
                list.append(recentCalls.get(i) + "\n");
            }
        }

        return list.toString();
        
    }

    /**
     * two telephones are considered equal if they have the same sequence (phone number)
     * @param other a telephone with which to compare
     */
    @Override
    public boolean equals(Object other){
        if (other instanceof Telephone){
            Telephone otherTelephone = (Telephone) other;

            return (otherTelephone.getSequence() == this.sequence);
        } 
        
        return false;
    }

    @Override
    public String toString(){
        return "Number: " + this.sequence + 
        "\nType: " + type +
        "\nMost recently dialed: " + ((latestCall() == 0) ? "N/A" : latestCall()) + "\n";
    }
}
