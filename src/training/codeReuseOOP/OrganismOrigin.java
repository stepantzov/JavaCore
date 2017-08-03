package training.codeReuseOOP;

/**
 * Created by Ivan_Stepantsov on 8/3/2017.
 */
class OrganismOrigin implements OrganismConcept {

    @Override
    public void birth() {
        System.out.println("Birth of organism.");
    }

    @Override
    public void nutrition(String nutrition) {
        System.out.println("nutrition of organism made mostly by " + nutrition);
    }

    @Override
    public void movement() {
        System.out.println("movement of organism made mostly by");
    }

    @Override
    public void reproduction() {
        System.out.println("reproduction of organism");
    }

    @Override
    public int deathAge(int deathAge) {
        System.out.println("deathAge of organism=" + deathAge);
        return deathAge;
    }

    @Override
    public boolean alive(int age, int lifeLimitAge) {
        boolean deathAgeFlag = false;
        OrganismOrigin a = new OrganismOrigin();
        if (age > lifeLimitAge) {
            return deathAgeFlag;
        } else return deathAgeFlag;
    }
}