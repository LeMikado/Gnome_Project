
import java.util.*;

/**
 * 
 */
public class Gnome {
    PriceMap = {Colour={blue=69,red=666,white=1,black=1,yellow=0.5,metis=0.75},Sex={female=5,male=3,other=0.1},Size={extra_small=0.5,small=2,medium=1,large=0.5,extra_large=0.25},Build={thin=0.5,normal=1,thick=2,obese=0.25}}
     /**
     * Default constructor
     */
    public Gnome(int id,String name,float age,String skincolour,String size,String build,String sex) {
        this.Id = id;
        this.Name = name;
        this.Age = age;
        this.SkinColour = skincolour;
        this.Size=size;
        this.Build=build;
        this.Sex=sex;
        this.Price=this.GetPrice();
    }
    /**
     *
     */
    public int Id;
    /**
     * 
     */
    public float Age;

    /**
     * 
     */
    public String SkinColour;

    /**
     * 
     */
    public float Size;

    /**
     * 
     */
    public String Build;

    /**
     * 
     */
    public String Sex;

    /**
     * 
     */
    public String Name;

    /**
     * 
     */
    public float Price;







    /**
     * 
     */
    public void Work() {
        // TODO implement here
    }

    /**
     * 
     */
    public void Idle() {
        // TODO implement here
    }

    /**
     * 
     */
    public void HandCrafting() {
        // TODO implement here
    }

    /**
     * 
     */
    public void GetPrice() {
        // TODO implement here
    }

}