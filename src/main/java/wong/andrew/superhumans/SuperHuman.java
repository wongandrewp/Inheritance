package wong.andrew.superhumans;

/**
 * Created by andrewwong on 5/1/17.
 */
public class SuperHuman extends Human {
    private String heroName;
    private String superAbility;
    private boolean isGood;

    public SuperHuman(String name, int age, String gender, String occupation, String address, String heroName, String superAbility, boolean isGood) {
        super(name, age, gender, occupation, address);
        this.heroName = heroName;
        this.superAbility = superAbility;
        this.isGood = isGood;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getSuperAbility() {
        return superAbility;
    }

    public void setSuperAbility(String superAbility) {
        this.superAbility = superAbility;
    }

    public boolean isGood() {
        return isGood;
    }

    public void setGood(boolean good) {
        isGood = good;
    }
}
