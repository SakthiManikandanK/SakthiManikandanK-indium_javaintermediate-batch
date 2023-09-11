package collections;

public class Skill {
    int id;
    String skills;
    boolean isPrimary;

    public Skill(){

    }

    public Skill(int id, String skills, boolean isPrimary) {
        this.id = id;
        this.skills = skills;
        this.isPrimary = isPrimary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public boolean isPrimary() {
        return isPrimary;
    }

    public void setPrimary(boolean primary) {
        isPrimary = primary;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "id=" + id +
                ", skills='" + skills + '\'' +
                ", isPrimary=" + isPrimary +
                '}';
    }
}
