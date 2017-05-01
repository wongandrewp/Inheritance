package wong.andrew.superhumans;

/**
 * Created by andrewwong on 5/1/17.
 */
public class Main {
    public static void main(String[] args) {
        Human john = new Human("John Doe", 25, "male", "programmer", "1105 N Market St" );
        SuperHuman barry = new SuperHuman("Barry Allen", 25, "male", "Forensic Scientist", "5 Apple St", "The Flash", "super speed", true );
        SuperHuman heath = new SuperHuman("Heath Ledger", 32, "male", "Unemployed", "Underground", "The Joker", "Weaponized Toxins", false );
        System.out.println(barry.getName() + " is a " + barry.getOccupation() + " but is secretly " + barry.getHeroName() + " and has " + barry.getSuperAbility());
        System.out.println(john.getName() + " is a " + john.getOccupation() + " that lives at " + john.getAddress());
        john.setAge(26);
        System.out.println("Today is " + john.getName() + "'s birthday so he is now " + john.getAge());
        System.out.println("Hopefully, " + john.getName() + " doesn't run into " + heath.getHeroName());
    }
}
