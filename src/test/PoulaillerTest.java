package test;

import static org.junit.Assert.*;

import data.Poulailler;
import data.Poulet;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PoulaillerTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PoulaillerTest
{
    private Poulet kiki;
    private Poulailler maisonKiki;

    /**
     * Default constructor for test class PoulaillerTest
     */
    public PoulaillerTest()
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
        this.maisonKiki = new Poulailler(new Poulet("Koko", 3), 100);
        this.maisonKiki.setGraine(150);
        this.kiki = new Poulet("kiki", 4);
        this.maisonKiki.setPoule(this.kiki);
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
    public void poulaillerTest()
    {
        assertEquals(this.kiki, this.maisonKiki.getPoule());
        assertEquals(150, this.maisonKiki.getGraine());
        this.maisonKiki.manger(30);
        assertEquals(120, this.maisonKiki.getGraine());
    }
}


