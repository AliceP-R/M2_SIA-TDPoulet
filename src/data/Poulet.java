package data;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a description of class Poulet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Poulet
{
    // instance variables - replace the example below with your own
    private String prenom; 
    private int age;
    private List<Poussin> enfants;

    /**
     * Constructor for objects of class Poulet
     */
    public Poulet(String pre, int a)
    {
        this.prenom = pre;
        this.age = a;
        this.enfants = new ArrayList<>();
    }

    public Poulet(String prenom, int age, List<Poussin> enfants) {
        this.prenom = prenom;
        this.age = age;
        this.enfants = enfants;
    }

    /**
     * Accesseurs
     */
    public int getAge()
    {
        return this.age;
    }

    public void setAge(int a)
    {
        this.age = a;
    }

    public String getPrenom()
    {
        return this.prenom;
    }

    public void setPrenom(String p)
    {
        this.prenom = p;
    }

    public List<Poussin> getEnfants() {
        return this.enfants;
    }

    /**
     * Autres méthodes
     */

    public void grandit()
    {
        this.age++; 
    }

    public Poussin agranditSaFamille(String prenom)
    {
        Poussin bebe = new Poussin(this, 0, prenom);
        this.enfants.add(bebe);
        return bebe;
    }
    
}
