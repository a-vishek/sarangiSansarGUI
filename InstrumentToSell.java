
/**
 * 
 *
 * @author (21049656 Avishek Thapa)
 * @1.0.0
 */

public class InstrumentToSell extends Instrument
{
    private float price;
    private String sellDate;
    private float disPercent;
    private boolean isSold;
    
    //constructor
    public InstrumentToSell(String instrumentName, float price){
        super(instrumentName);
        this.price = price;
        sellDate = "";
        disPercent = 0.0f;
        isSold = false;
    }
    
    //getter
    public float getPrice(){
        return price;
    }
    
    public String getSellDate(){
        return sellDate;
    }
    
    public float getDisPercent(){
        return disPercent;
    }
    
    public boolean isSold(){
        return isSold;
    }
    
    public void setPrice(float price){
        if (isSold == false){
            this.price = price;  
        }
        else {
           System.out.println("The instrument is already sold.Cannot update price"); 
        }
    }
    
    public void setSellDate(String sellDate){
        this.sellDate = sellDate;
    }
    
    public void setDisPercent(float disPercent){
        this.disPercent = disPercent;
    }
    
    public void setIsSold(boolean isSold){
        this.isSold = isSold;
    }
    
    //Sells an instrument object
    public void sellInstrument(String customerName,String customerPhone,
                                int customerPan, String sellDate,
                                float disPercent){
        if (isSold == true){
            System.out.println("The instrument is already sold. Cannot be sold again"); 
            display();
        } 
        else {
            super.setCustomerName(customerName);
            super.setCustomerPhone(customerPhone);
            super.setCustomerPan(customerPan);
            setSellDate(sellDate);
            setDisPercent(disPercent);
            setIsSold(true);
            price = price - (disPercent/100 * price);  
            display();
        }
        
    }
    
    public void display(){
        System.out.println("=====================INSTRUMENT SELL DETAILS====================");
        System.out.println("== Instrument ID    = "+ super.getInstrumentID());
        System.out.println("== Instrument Name  = "+ super.getInstrumentName());
        if (isSold == true){
        System.out.println("== Customer's name  = "+ super.getCustomerName());
        System.out.println("== Customer's Phone = "+ super.getCustomerPhone());
        System.out.println("== Customer's Pan   = "+ super.getCustomerPan());
        System.out.println("== Date of Sale     = "+ getSellDate());
        System.out.println("== Discount %       = "+ getDisPercent());
        System.out.println("== Discounted Price = "+ price);
        }
        System.out.println("===============================================================");
    }
}
