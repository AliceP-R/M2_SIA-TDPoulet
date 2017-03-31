package data;

/**
 * Created by alice on 24/03/2017.
 */
public class Poussin
{
    Poulet maman;
    int age;
    String prenom;

    public Poussin(Poulet maman, int age, String prenom) {
        this.maman = maman;
        this.age = age;
        this.prenom = prenom;
    }

    public Poulet getMaman() {
        return this.maman;
    }

    public void setMaman(Poulet maman) {
        this.maman = maman;
        maman.getEnfants().add(this);
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void grandit()
    {
        this.age = this.age+1;
    }
}
