package Shirokov.Filipp;

/**
 * @Author Fil
 * @create 2022-04-01 13:36
 **/

public class Person {
    private final Boolean man;
    private final String name;
    private Person spouse;
    public Person(Boolean man, String name) {
        this.man = man;
        this.name = name;
    }

    /**
     * This method checks gender of persons. If genders are not equal - tries to marry.
     * If one of them has another spouse - execute divorce(sets spouse = null for husband and wife. Example: if both persons have spouses -
     * then divorce will set 4 spouse to null) and then executes marry().
     * @param person - new husband/wife for this person.
     * @return - returns true if this person has another gender than passed person and they are not husband and wife, false otherwise
     */
    public boolean marry(Person person) {
        //если пол разный и они не женаты
        if (!this.man.equals(person.getMan()) && this.spouse != person) {
            //если есть супруга/супруг у 1го, то развести и его и супругу/супруга
            if (this.spouse != null) {
                this.spouse.divorce();
                divorce();
            }
            //если есть супруга/супруг у 2го, то развести и его и супругу/супруга
            if (person.getSpouse() != null) {
                person.getSpouse().divorce();
                person.divorce();
            }
            //само marry (назначаем поля spouse)
            this.spouse = person;
            person.setSpouse(this);
            return true;
        } else {
            return false;
        }
    }
    /**
     * Sets spouse = null if spouse is not null
     * @return true - if person status has been changed
     */
    public boolean divorce() {
        if (spouse != null) {
            spouse = null;
            return true;
        } else {
            return false;
        }
    }

    public Boolean getMan() {
        return man;
    }

    public Person getSpouse() {
        if (spouse != null) {
            return spouse;
        } else return null;
    }

    public String getName() {
            return name;
    }

    public void setSpouse(Person spouse) {
        this.spouse = spouse;
    }
}
