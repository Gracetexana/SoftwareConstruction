package activities;

public class PetNames {
    public static void main(String[] args){
        oneLetterPerLine("Atlas");
        oneLetterPerLine("Atlas");
    }

    public static void oneLetterPerLine(String name){
        for(int i=0; i<name.length(); i++){
            System.out.println(name.charAt(i));
        }
    }
}
