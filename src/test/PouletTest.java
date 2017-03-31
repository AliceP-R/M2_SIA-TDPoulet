package test;

import data.Poulet;
import data.Poussin;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * The test class PouletTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PouletTest
{
    Poulet coco;
    /**
     * Default constructor for test class PouletTest
     */
    public PouletTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        this.coco = new Poulet("kiki", 4);
        System.out.println("nom : " + this.coco.getPrenom());
        this.coco.setAge(2);
        this.coco.setPrenom("coco");

        List<Poussin> enfants = new ArrayList<>();
        Poulet maman = new Poulet("Babette", 6, enfants);
        Poussin bebe = new Poussin(maman,0,"Bébé 1");
        System.out.println("maman : " + bebe.getMaman() + " de " + bebe.getPrenom());
        enfants.add(new Poussin(this.coco, 1, "Bébé 2"));
        bebe.setMaman(this.coco);
        enfants.add(new Poussin(this.coco, 2, "Bébé 3"));
        maman.agranditSaFamille("Bébé 4");

    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testPouletGrandit()
    {
        assertEquals(2, this.coco.getAge());
        this.coco.grandit();
        assertEquals(3, this.coco.getAge());
    }

    @Test
    public void testPouletFamille()
    {
        checkNaissance();
    }

    private void checkNaissance() {
        assertEquals(1, this.coco.getEnfants().size());
        this.coco.agranditSaFamille("Bébé");
        assertEquals(2, this.coco.getEnfants().size());
    }
}

