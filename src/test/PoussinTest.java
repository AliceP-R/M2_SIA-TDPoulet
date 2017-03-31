package test;

import data.Poulet;
import data.Poussin;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by alice on 24/03/2017.
 */
public class PoussinTest {

    Poulet kiki;
    Poussin bebe, bebe2;

    @Before
    public void setUp() {
        this.kiki = new Poulet("kiki", 4);
        this.bebe = this.kiki.agranditSaFamille("Bébé");
        this.bebe.setPrenom("Chouchou");
        this.bebe2 = this.kiki.agranditSaFamille("Gabi");
        this.bebe2.setAge(1);

    }

    @After
    public void tearDown() {

    }

    @Test
    public void testGrandit()
    {
        assertEquals(0, this.bebe.getAge());
        this.bebe.grandit();
        assertEquals(1, this.bebe.getAge());

    }
}
