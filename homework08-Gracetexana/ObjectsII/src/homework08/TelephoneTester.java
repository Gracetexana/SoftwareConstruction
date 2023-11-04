package homework08;
/*
 * Grace Texana Long Torales
 * gtl1500@g.rit.edu
 */

public class TelephoneTester {
    
    /**
     * creates 4 Telephone objects
     * attempts several calls between the phones, with some successes and some failures
     * prints information about each Telephone
     * tests equality between 3 of the phones
     * prints total number of calls made by all phones
     * @param args
     */
    public static void main(String[] args){
        Telephone phone1 = new Telephone(Type.LANDLINE);
        Telephone phone2 = new Telephone(Type.MOBILE, 5550001);
        Telephone phone3 = new Telephone(Type.SATELLITE, 5550002);
        Telephone phone4 = new Telephone(Type.LANDLINE);

        phone1.disconnect();
        phone1.dial(phone1.getSequence());
        phone1.dial(phone2.getSequence());
        phone1.dial(phone3.getSequence());
        phone1.dial(phone4.getSequence());
        phone1.disconnect();
        phone1.dial(phone4.getSequence());

        phone2.redial();
        phone2.dial(phone4.getSequence());
        phone2.disconnect();
        phone2.redial();
        phone2.disconnect();
        phone2.dial(phone3.getSequence());
        phone2.disconnect();
        phone2.dial(phone4.getSequence());
        phone2.disconnect();
        phone2.redial();
        phone2.disconnect();
        phone2.dial(phone3.getSequence());
        phone2.disconnect();
        phone2.dial(phone4.getSequence());
        phone2.disconnect();
        phone2.redial();
        phone2.disconnect();
        phone2.dial(phone3.getSequence());
        phone2.disconnect();
        phone2.dial(phone4.getSequence());
        phone2.disconnect();
        phone2.redial();
        phone2.disconnect();
        phone2.dial(phone3.getSequence());
        phone2.disconnect();
        phone2.dial(phone4.getSequence());
        phone2.disconnect();
        phone2.redial();
        phone2.disconnect();
        phone2.dial(phone3.getSequence());
        phone2.disconnect();
        System.out.println();

        System.out.println("Phone1:\n" + phone1 + phone1.recentCallsList());

        System.out.println("Phone2:\n" + phone2 + phone2.recentCallsList());

        System.out.println("Phone1 equals Phone2? " + phone1.equals(phone2) + "\n");

        System.out.println("Phone3:\n" + phone3 + phone3.recentCallsList());

        System.out.println("Phone2 equals Phone3? " + phone2.equals(phone3) + "\n");

        System.out.println("Phone4:\n" + phone4 + phone4.recentCallsList());

        System.out.print("Total number of calls made by all phones: " + Telephone.getNumberOfCalls());
    }
}
