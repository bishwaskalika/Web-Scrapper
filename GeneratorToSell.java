
/**
 * This is a generator to sell class using extends keyword
 * 
 */
public class GeneratorToSell extends Generator
{

    private int price;
    private String dateOfSell;
    private int discount;
    private int totalCost;
    private boolean sold;
    
    
    public GeneratorToSell (String thedescription, String Size,  String Fuelcapacity , int theprice)
    {
        super(thedescription, Size,  Fuelcapacity);
        
        
       
        this.price=theprice;
        this.Fuelcapacity=Fuelcapacity;
        this.Size=Size;
        
        this.sold=false;
        this.discount=0;
    }
    
     
    
    
    public   int getprice()
    {
        return price;
    }
    
    public String getdateOfSell()
    {
        return dateOfSell;
    }
    
    public int getdiscount()
    {
        return  discount;
    }
    
    public int gettotalCost()
    {
        return  totalCost;
    }
    
    public boolean getsold()
    {
        return sold;
    }
    
    
    public void setprice(int newprice)
    {
        price=newprice;
        
        if(sold==true){
            System.out.println("Genertaor hasnot been sold"+ newprice);
        }else{
            System.out.println("Generator has been sold");
        }
        
    }
    
    
    public void sellingGenerator(String  thecustomersname, String dateOfSel, String  discount)
    {
       
        super.getthecustomersname();
        if(sold==true){
            System.out.println("Generator has been sold" + thecustomersname  );
            System.out.println("thetotal cost is"  + (this.price- this.discount));
        }else{
            
            System.out.println("Genertor is on sold");
        }
    }    
    public void theDetails()
    {
        super.display();
        if(sold==false)
        {
            System.out.println("The generator details" + thecustomersname);
        }else{
            System.out.println("generator has been sold" + theDescription + Size + Fuelcapacity);
        }
    }

     }

        
    
    
    
    
    
   
