
/**
 * Write a description of class Generator here.
 * 
 * @author (Bishwas kalika) 
 * @version (a version number or a date)
 */

/* Question no.1
 * This is a generator class
 * 
 * 
 * 
*/
public class Generator{
    
     
     // Generator class appect four attributes as a string  
     String   theDescription  ; 
     String   thecustomersname;
     String   Size;
     String   Fuelcapacity;
      
    
    
    // Creating the constructor
    public Generator(String Newdescription,  String Newsz, String Newfuel  ){
    
       
       // Attributes are being assigned with equals to new object 
       this.theDescription= Newdescription;
       this.Size = Newsz;
       this. Fuelcapacity= Newfuel;
       this.thecustomersname="";
        
    }
    
    
    
    //  Using set method 
    public void setnewCustomerName(String customerName)
    {
        thecustomersname = customerName;
    }
    
    
    // Using get method
    public  String gettheDescription()
    {
        return theDescription;
    }
    
    // Using get method
    public String   getthecustomersname()
    {
        return    thecustomersname;
    }
    
    // Using get method
    public String   getSize()
    {
        return    Size;
       
    }
    
    // Using get method
    public String   getFuelcapacity()
    {
        return  Fuelcapacity;
    }
    
    // Creating a display mehod
    public void display()
    {
        // Using if/else method 
        if(thecustomersname.equals(""))
        {
            System.out.println("The description of the generator is :"+theDescription); 
            System.out.println("The size of the generator is :" +Size);
            System.out.println("The fuel capacity of the generator is :" +Fuelcapacity);
        }
        else
        {
            System.out.println("The name of the customer is :" +thecustomersname);
            System.out.println("The description of the generator is :"+theDescription); 
            System.out.println("The size of the generator is :" +Size);
            System.out.println("The fuel capacity of the generator is :" +Fuelcapacity);
        }
    }
}
    
    
