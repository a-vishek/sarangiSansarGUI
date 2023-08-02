
/**
 * 
 *
 * @author (21049656 Avishek Thapa)
 * @1.0.0
 */

public class Instrument
{
    private static int instrumentID = 0; //static variable
    private String instrumentName;
    private String customerName;
    private String customerPhone;
    private int customerPan;
 
    
    //constructor 
    public Instrument(String instrumentName){
                            this.instrumentName = instrumentName;
                            customerName = "";
                            customerPhone = "";
                            customerPan = 0;
                            instrumentID = instrumentID + 1;
                        }
    
    //getter methods
    
    public int getInstrumentID(){
        return instrumentID;
    }
    
    public String getInstrumentName(){
        return this.instrumentName;
    }
    
    public String getCustomerName(){
        return this.customerName;
    }
    
    public String getCustomerPhone(){
        return this.customerPhone;
    }
    
    public int getCustomerPan(){
        return this.customerPan;
    }
    
    //setter methods
     public void setInstrumentID(int instrumentID){
         Instrument.instrumentID = instrumentID;
    }
    
    public void setInstrumentName(String instrumentName){
         this.instrumentName = instrumentName;
    }
    
    public void setCustomerName(String customerName){
         this.customerName = customerName;
    }
    
    public void setCustomerPhone(String customerPhone){
         this.customerPhone = customerPhone;
    }
    
    public void setCustomerPan(int customerPan){
         this.customerPan = customerPan;
    }
    
    //display method
    public void display(){
        System.out.println("=================INSTRUMENT DETAILS==================");
        System.out.println("== Instrument ID    = "+ getInstrumentID());
        System.out.println("== Instrument Name  = "+ getInstrumentName());
        if (this.customerName != "" && this.customerPhone != "" && this.customerPan != 0 ){
        System.out.println("== Customer's name  = "+ getCustomerName()+"       ==");
        System.out.println("== Customer's Phone = "+ getCustomerPhone()+"      ==");
        System.out.println("== Customer's Pan   = "+ getCustomerPan()+"        ==");
        }
        System.out.println("=====================================================");
    }
}
