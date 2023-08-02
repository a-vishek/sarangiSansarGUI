
/**
 * 
 *
 * @author (21049656 Avishek Thapa)
 * @1.0.0
 */

public class InstrumentToRent extends Instrument
{
    private int chargePerDay;
    private String dateOfRent;
    private String dateOfReturn;
    private int noOfDays;
    private boolean isRented;
    
    //constructor
    public InstrumentToRent(String instrumentName, int chargePerDay){
        super(instrumentName);
        this.chargePerDay = chargePerDay;
        dateOfRent = "";
        dateOfReturn = "";
        noOfDays = 0;
        isRented = false;
        
    }
    
    //getter methods
    public int getChargePerDay(){
        return this.chargePerDay;
    }
    
    public String getDateOfRent(){
        return this.dateOfRent;
    }
    public String getDateOfReturn(){
        return this.dateOfReturn;
    }
    
    public int getNoOfDays(){
        return this.noOfDays;
    }
    
    public boolean isRented(){
        return this.isRented;
    }
    
    //setter method
    public void setChargePerDay(int chargePerDay){
         this.chargePerDay = chargePerDay;
    }
    
    public void setDateOfRent(String dateOfRent){
         this.dateOfRent = dateOfRent;
    }
    public void setDateOfReturn(String dateOfReturn){
         this.dateOfReturn = dateOfReturn;
    }
    
    public void setNoOfDays(int noOfDays){
         this.noOfDays = noOfDays;
    }
    
    public void setIsRented(boolean isRented){
         this.isRented = isRented;
    }
    
    //Rents an instrument object
    public void rentInstrument(String customerName, String customerPhone,
                               int customerPan, String dateOfRent,
                               String dateOfReturn, int noOfDays){
        
        if (isRented == true){
            System.out.println("=================================");
            System.out.println("Sorry, the "+ super.getInstrumentName()+"is already rented out and not currently avialable");
            System.out.println("=================================");
        }
        else {
            super.setCustomerName(customerName);
            super.setCustomerPhone(customerPhone);
            super.setCustomerPan(customerPan);
            setDateOfRent(dateOfRent);
            setDateOfReturn(dateOfReturn);
            setNoOfDays(noOfDays);
            setIsRented(true);
            float totalCharge = noOfDays * chargePerDay;
            display();
            System.out.println();
            System.out.println("=> The Total charge is " + totalCharge);
        }
        
    }
    
    public void returnInstrument(){
        if (isRented == false){
            System.out.println("====================================================================================");
            System.out.println("The instrument ( "+super.getInstrumentName() +
                                " ) is not rented, so the returnInstrument method cannot be called. ");
            System.out.println("=====================================================================================");
            
        }
        else {
            super.setCustomerName("");
            super.setCustomerPhone("");
            setDateOfReturn("");
            setDateOfRent("");
            setNoOfDays(0);
            super.setCustomerPan(0);
            setIsRented(false);
            System.out.println("The Instrument is successfully returned");
        }
    }
    
    public void display(){
        System.out.println("=================RENT DETAILS========================");
        System.out.println("== Instrument ID    = "+ super.getInstrumentID());
        System.out.println("== Instrument Name  = "+ super.getInstrumentName());
        if (super.getCustomerName() != "" && super.getCustomerPhone() != "" && super.getCustomerPan() != 0 ){
        System.out.println("== Customer's name  = "+ super.getCustomerName());
        System.out.println("== Customer's Phone = "+ super.getCustomerPhone());
        System.out.println("== Customer's Pan   = "+ super.getCustomerPan());
        System.out.println("== Rent Date        = "+ getDateOfRent());
        System.out.println("== Date to Return   = "+ getDateOfReturn());
        }
    }
}
