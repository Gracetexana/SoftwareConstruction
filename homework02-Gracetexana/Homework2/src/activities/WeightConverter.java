package activities;

public class WeightConverter {
    public static void main(String[] args){
        System.out.println("Weight in kilograms: " + lbsToKg((float) 5));
        System.out.println("Weight in kilograms: " + lbsToKg((float) 6));
    }

    public static float lbsToKg(float lbs){
        System.out.println("Weight in pounds: " + lbs);
        float kg = lbs / (float) 2.2;
        return kg;
    }
}
