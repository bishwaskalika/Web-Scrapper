/**Question no.2
 * 
 * 
 * Creating a Generatortorent class also using extends keyword.Which is  concpet of inheritance.
 * 
 */

public  class GeneratorToRent extends Generator
{
    
     // passing seven attributes in class
     private String dateOfHire; 
     private String dateOfReturn;
     private int  downPayment;
     private int numberOfDays ;
     private int dailyRate;
     private int totalRent; 
     private boolean onLoan;
    
     //  Creating Constructor which will accepts six parameters 
     public  GeneratorToRent (String thedescription, String size, String fuelcapacity, int thedownPayment,  int thedailyRate){
     
         
         super(thedescription,size, fuelcapacity);
         downPayment = thedownPayment;
         this.dailyRate = thedailyRate;
         this.numberOfDays = 0;
         this.totalRent = 0;
         this.dateOfHire = "";
         this.dateOfReturn ="";
         this.onLoan = false;
         
        }
     
     // Creating get method
     public String getdateofHire()
     {
        return dateOfHire;
     } 
     
     // Creating get method
     public String getdateOfReturn()
     {
         return  dateOfReturn;
     }
     
     // Creating get method
     public int getdownPayment()
     {
        return downPayment;
     }
    
     // Creating get method
     public int getnumberOfDays()
     {
        return numberOfDays;
     }
     
     // Creating get method
     public int getdailyRate()
     {
        return dailyRate;
     }
     
     // Creating get method
     public int gettotalRent()
     {
         return totalRent;
     } 
     
     // Creating get method
     private boolean getonLoan()
     {
         return onLoan;
     }
     
     
     //  Creating set method, intialising dailyRate into newdailyrate
     public void  setdailyRate(int newdailyRate)
     {
        dailyRate=newdailyRate;
     }
     
     
     // Creating set method, intialising downpayment into newthedownpayment
     public void setdownPayment(int newtheDownpayment)
     {   
         downPayment=newtheDownpayment;
     }
    
    
     
     // Using set method
     public void setthecustomersname(String newcustomersname,String dateofhire, String dateofreturn, int numberofdays){
                 if(onLoan==true){
                    System.out.println("The generator is on loan" + dateOfReturn );
                    
             }else{
                
                    thecustomersname= newcustomersname;
                    dateOfHire= dateofhire ;
                    numberOfDays=numberofdays ;
                    dateOfReturn=dateofreturn;
                    
                }
            }
             
     // Creating method makingGenerator 
     public void makingGenerator()
     {
         // Using if/else method
         // Check generator is avaliable or not
         if(onLoan==false)
         {
            
             System.out.println("Genetrotor is avaliable");
         }
         else
         {
            super.setnewCustomerName("");
             numberOfDays=0;
             dateOfHire="0";
             dateOfReturn="0";
             onLoan=false;
             
            
             
             
          }
        }
         
        
        // Creating get method
         public void  getgeneratorDesciption()
         {
             System.out.println("descprtion of generator" + super.gettheDescription() + this.totalRent
             );
         }          
          
         // Creating displaydetails method
         public void displayDetails()
         {
            super.display();// this method is  called from generator class
            // Using if/else statement
            if(onLoan=true)
            {
               System.out.println("here is the down payment and daily rate"+  downPayment + dailyRate ); 
            }else{
                super.display();
                System.out.println("here is the display of down payment" +theDescription + dateOfHire + totalRent);
            
            }
         }
     
     
         
    }