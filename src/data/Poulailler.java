package data;

/**
 * Write a description of class Poulailler here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Poulailler
{
    // instance variables - replace the example below with your own
    private Poulet poule; 
    private int graine; 
    
    public Poulailler(Poulet p, int f)
    {
        this.poule = p; 
        this.graine = f; 
    }
    
    public Poulet getPoule()
    {
        return this.poule; 
    }
    
   public int getGraine()
   {
       return this.graine; 
   }

   public void setPoule(Poulet p)
   {
       this.poule = p;
   }

   public void setGraine(int f)
   {
       this.graine = f;
   }

    public void manger(int quantité)
    {
        this.graine = this.graine - quantité;
    }
}
