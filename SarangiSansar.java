
/**
 * Write a description of class SarangiSansar here.
 *
 * @author (21049656 Avishek Thapa)
 * @version (1.0.0)
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;     
import java.util.ArrayList;     
import javax.swing.JOptionPane;

public class SarangiSansar implements ActionListener
{
    private JFrame frame;
    // Declare for Instrument To Rent and Return Starts --------------------------------------------
    private JLabel
    sarangiLbl, instToRentLbl, instNameLbl,
    chargePerDayLbl, instNameRntLbl, customerNameLbl, panLbl,
    rentingDaysLbl, customerPhoneLbl, rentDateLbl,returnDateLbl,
    instNameRtnLbl;
    
    private JTextField
    instNameTxtFld, chargePerDayTxtFld,instNameRntTxtFld,
    customerNameTxtFld,rentingDaysTxtFld, panTxtFld,
    customerPhoneTxtFld,instNameRtnTxtFld;
    
    private JComboBox
    rentYearCB, rentMonthCB, rentDayCB,
    returnYearCB, returnMonthCB, returnDayCB;
    
    private JButton
    addBtn, rentBtn, clearBtn, returnBtn, displayBtn;
    //Declare Instrument To Rent and Return ENDS----------------------------------------------------
    
    //Declare Instrument To Sell STARTS-------------------------------------------------------------
    private JLabel
    instToSellLbl, instNameLbl2, instPriceLbl,
    instNameSellLbl, customerNameSellLbl, customerPhoneSellLbl,
    panNumSellLbl, discountLbl, sellDateLbl;
    
    private JTextField
    instName2TxtFLd, instPriceTxtFld,
    instNameSellTxtFld, customerNameSellTxtFld, customerPhoneSellTxtFld,
    panNumSellTxtFld, discountTxtFld;
    
    private JComboBox
    sellYearCB, sellMonthCB, sellDayCB;
    
    private JButton
    addBtnSell, sellBtn;
    
    //Declarate Instrument to Sell ENDS---------------------------------------------------------------------------
    private Color rentAddC, rentC, returnDisplayC, sellAddC, sellC, clearC;
    private ArrayList<Instrument> instruments = new ArrayList<Instrument>();
    /**
     * Constructor for objects of class SarangiSansar
     */
    public SarangiSansar() 
    {
        frame = new JFrame("Sarangi Sansar");
        
        
        //GUI for Instrument to Rent and Return STARTS-----------------------------------------------------------------------------------------------------------------------------------------------------------------
        sarangiLbl          = new JLabel("Sarangi Sansar");
        instToRentLbl       = new JLabel("Instrument to Rent");
        instNameLbl         = new JLabel("Instrument Name");
        chargePerDayLbl     = new JLabel("Charge/Day");
        instNameRntLbl      = new JLabel("Instrument Name");
        customerNameLbl     = new JLabel("Customer Name");
        panLbl              = new JLabel("PAN Num");
        rentingDaysLbl      = new JLabel("Renting Days");
        customerPhoneLbl    = new JLabel("Customer Phone");
        rentDateLbl         = new JLabel("Rent Date");
        returnDateLbl       = new JLabel("Return Date");
        instNameRtnLbl      = new JLabel("Instrument Name");
        
        instNameTxtFld       = new JTextField();
        chargePerDayTxtFld   = new JTextField();
        instNameRntTxtFld    = new JTextField();
        customerNameTxtFld   = new JTextField();
        panTxtFld            = new JTextField();
        rentingDaysTxtFld    = new JTextField();
        customerPhoneTxtFld  = new JTextField();  
        instNameRtnTxtFld    = new JTextField();
        
        String year[] = {"2017", "2018", "2019", "2020", "2021", "2022", "2023"};
        
        String month[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
          
        String day[]  = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13",  "14", "15",
        "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}; 
        
        rentYearCB    = new JComboBox(year);
        rentMonthCB   = new JComboBox(month);
        rentDayCB     = new JComboBox(day);
        
        returnYearCB  = new JComboBox(year);
        returnMonthCB = new JComboBox(month);
        returnDayCB   = new JComboBox(day);
        
        addBtn = new JButton("Add");   
        rentBtn = new JButton("Rent");
        clearBtn = new JButton("Clear");
        returnBtn = new JButton("Return");
        displayBtn = new JButton("Display");
        
        //colors for JTEXTFIELD, ComboBOx and JButtons of left side
        rentAddC = new Color(223, 237, 214);
        rentC = new Color(247, 250, 222);
        returnDisplayC = new Color(255, 241, 215);
        clearC = new Color(201,241,253);
        
        instNameTxtFld.setBackground(rentAddC);
        chargePerDayTxtFld.setBackground(rentAddC);
        addBtn.setBackground(rentAddC);
        
        instNameRntTxtFld.setBackground(rentC);
        customerNameTxtFld.setBackground(rentC);
        rentingDaysTxtFld.setBackground(rentC);
        panTxtFld.setBackground(rentC);
        customerPhoneTxtFld.setBackground(rentC);
        rentBtn.setBackground(rentC);
        rentYearCB.setBackground(rentC);
        rentMonthCB.setBackground(rentC);
        rentDayCB.setBackground(rentC);
        returnYearCB.setBackground(rentC);
        returnMonthCB.setBackground(rentC);
        returnDayCB.setBackground(rentC);
        
        instNameRtnTxtFld.setBackground(returnDisplayC);
        returnBtn.setBackground(returnDisplayC);
        
        clearBtn.setBackground(clearC);
        displayBtn.setBackground(returnDisplayC);
        
        
        sarangiLbl.setFont(new Font("Helvetica", Font.BOLD, 40));
        instToRentLbl.setFont(new Font("Helvetica", Font.BOLD, 30));
        

        
        //Setting bounds for labels
        sarangiLbl.setBounds(499, 10, 299, 77);
        instToRentLbl.setBounds(46, 104, 281, 77);
        instNameLbl.setBounds(46, 181, 121, 32);
        chargePerDayLbl.setBounds(46, 245, 86, 22);
        instNameRntLbl.setBounds(46, 309, 121, 32);
        customerNameLbl.setBounds(389, 309, 121, 32);
        panLbl.setBounds(46, 364, 121, 32);
        rentingDaysLbl.setBounds(389, 364, 121, 32);
        customerPhoneLbl.setBounds(46, 416, 121, 32);
        rentDateLbl.setBounds(46, 468, 82, 32);
        returnDateLbl.setBounds(46,527, 91, 32);
        instNameRtnLbl.setBounds(46, 612, 121, 32);
        
        
        //Setting bounds for JTextField
        instNameTxtFld.setBounds(196, 181, 180, 32);
        chargePerDayTxtFld.setBounds(196, 240, 180, 32);
        instNameRntTxtFld.setBounds(196, 309, 180, 32);
        customerNameTxtFld.setBounds(523, 309, 180, 32);
        panTxtFld.setBounds(196, 364, 180, 32);
        rentingDaysTxtFld.setBounds(523, 364, 180, 32);
        customerPhoneTxtFld.setBounds(196, 419, 180, 32);
        instNameRtnTxtFld.setBounds(196, 612, 180, 32);

        
        //Setting bounds for JComboBox
        rentYearCB.setBounds(196, 471, 94, 33);
        rentMonthCB.setBounds(303, 471, 94, 33);
        rentDayCB.setBounds(410, 471, 94, 33);
        returnYearCB.setBounds(196, 527, 94, 33);
        returnMonthCB.setBounds(303, 527, 94, 33);
        returnDayCB.setBounds(410, 527, 94, 33);
        
        //Setting bounds for JButton 
        addBtn.setBounds(389, 240, 72, 32);
        rentBtn.setBounds(517, 527, 72, 32);
        returnBtn.setBounds(389, 612, 72, 32);
        clearBtn.setBounds(46, 676, 72, 32);
        displayBtn.setBounds(474, 612, 75, 32);
        
        //adding componentents to JFrame
        //adding JLabels
        frame.add(sarangiLbl);
        frame.add(instToRentLbl);
        frame.add(instNameLbl);
        frame.add(chargePerDayLbl);
        frame.add(instNameRntLbl);
        frame.add(customerNameLbl);
        frame.add(panLbl);
        frame.add(rentingDaysLbl);
        frame.add(customerPhoneLbl);
        frame.add(rentDateLbl);
        frame.add(returnDateLbl);
        frame.add(instNameRtnLbl);
        
        //adding JTextFields
        frame.add(instNameTxtFld);
        frame.add(chargePerDayTxtFld);
        frame.add(instNameRntTxtFld);
        frame.add(customerNameTxtFld);
        frame.add(panTxtFld);
        frame.add(rentingDaysTxtFld);
        frame.add(customerPhoneTxtFld);
        frame.add(instNameRtnTxtFld);
        
        //adding JComboBox
        frame.add(rentYearCB);
        frame.add(rentMonthCB);
        frame.add(rentDayCB);
        frame.add(returnYearCB);
        frame.add(returnMonthCB);
        frame.add(returnDayCB);
        
        //adding Buttons
        frame.add(addBtn);
        frame.add(rentBtn);
        frame.add(clearBtn);
        frame.add(returnBtn);
        frame.add(displayBtn);
        
        //Action Listener
        addBtn.addActionListener(this);
        rentBtn.addActionListener(this);
        returnBtn.addActionListener(this);
        //works for both rent and sell
        clearBtn.addActionListener(this);    
        displayBtn.addActionListener(this);
        
        //GUI for instrument to Rent and Return ENDS-------------------------------------------------------------------------------------------------------------------------------------------------------------------
        
        //GUI for Instrument to Sell STARTS----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        
        
        instToSellLbl        = new JLabel("Instrument To Sell");
        instNameLbl2         = new JLabel("Instrument Name");
        instPriceLbl         = new JLabel("Price");
        instNameSellLbl      = new JLabel("Instrument Name");
        customerNameSellLbl  = new JLabel("Customer Name");
        customerPhoneSellLbl = new JLabel("Customer Phone");
        panNumSellLbl        = new JLabel("PAN Num");
        discountLbl          = new JLabel("Discount%");
        sellDateLbl          = new JLabel("Sell Date");
        
        instToSellLbl.setFont(new Font("Helvetica", Font.BOLD, 30));
        
        instName2TxtFLd         = new JTextField();
        instPriceTxtFld         = new JTextField();
        instNameSellTxtFld      = new JTextField();
        customerNameSellTxtFld  = new JTextField();
        customerPhoneSellTxtFld = new JTextField();
        panNumSellTxtFld        = new JTextField();
        discountTxtFld          = new JTextField();
        
        sellYearCB = new JComboBox(year);
        sellMonthCB = new JComboBox(month);
        sellDayCB = new JComboBox(day);
        
        addBtnSell = new JButton("Add");
        sellBtn = new JButton("Sell");
        
        //Setting colors for JTEXTFIELDS and JBUTTON or right side
        sellAddC = new Color(255,226,216);
        sellC = new Color(255,236,215);
        
        instName2TxtFLd.setBackground(sellAddC);
        instPriceTxtFld.setBackground(sellAddC);
        addBtnSell.setBackground(sellAddC);
        
        instNameSellTxtFld.setBackground(sellC);
        customerNameSellTxtFld.setBackground(sellC);
        customerPhoneSellTxtFld.setBackground(sellC);
        panNumSellTxtFld.setBackground(sellC);
        discountTxtFld.setBackground(sellC);
        sellYearCB.setBackground(sellC);
        sellMonthCB.setBackground(sellC);
        sellDayCB.setBackground(sellC);
        sellBtn.setBackground(sellC);
        
        
        //Setting Bounds for JLabel
        instToSellLbl.setBounds(986, 104, 264, 68);
        instNameLbl2.setBounds(826, 172, 121, 32);
        instPriceLbl.setBounds(826, 236, 37, 22);
        instNameSellLbl.setBounds(826, 296, 121, 32);
        customerNameSellLbl.setBounds(826, 351, 121, 32);
        customerPhoneSellLbl.setBounds(826, 406, 121, 32);
        panNumSellLbl.setBounds(826, 461, 121, 32);
        discountLbl.setBounds(826, 516, 121, 32);
        sellDateLbl.setBounds(826, 571, 68, 32);
        
        //Setting Bounds for JTextFields
        instName2TxtFLd.setBounds(976, 180, 180, 32);
        instPriceTxtFld.setBounds(976, 231, 180, 32);
        instNameSellTxtFld.setBounds(976, 296, 180, 32);
        customerNameSellTxtFld.setBounds(976, 351, 180, 32);
        customerPhoneSellTxtFld.setBounds(976, 406, 180, 32);
        panNumSellTxtFld.setBounds(976, 461, 180, 32);
        discountTxtFld.setBounds(976, 516, 180, 32);
        
        //Setting Bounds for JComboBox
        sellYearCB.setBounds(826, 612, 94, 33);
        sellMonthCB.setBounds(933, 612, 94, 33);
        sellDayCB.setBounds(1040, 612, 94, 33);
        
        addBtnSell.setBounds(1178, 231, 72, 32);
        sellBtn.setBounds(1178, 612, 72, 32);
        
        //adding components
        frame.add(instToSellLbl);
        frame.add(instNameLbl2);
        frame.add(instPriceLbl);
        frame.add(instNameSellLbl);
        frame.add(customerNameSellLbl);
        frame.add(customerPhoneSellLbl);
        frame.add(panNumSellLbl);
        frame.add(discountLbl);
        frame.add(sellDateLbl);
        
        frame.add(instName2TxtFLd);
        frame.add(instPriceTxtFld);
        frame.add(instNameSellTxtFld);
        frame.add(customerNameSellTxtFld);
        frame.add(customerPhoneSellTxtFld);
        frame.add(panNumSellTxtFld);
        frame.add(discountTxtFld);
        
        frame.add(sellYearCB);
        frame.add(sellMonthCB);
        frame.add(sellDayCB);
        
        frame.add(addBtnSell);
        frame.add(sellBtn);
        
        addBtnSell.addActionListener(this);
        sellBtn.addActionListener(this);
        
        //GUI for Instrument to Sell ENDS-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        
        frame.setSize(1280, 720);
        
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        SarangiSansar sarangiOBJ = new SarangiSansar();
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == addBtn){
        
            try{
                if (instNameTxtFld.getText().isEmpty() || chargePerDayTxtFld.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please enter values on required fields");
                }
                else {
                    String inst = instNameTxtFld.getText().toLowerCase();
                    int charge = Integer.parseInt(chargePerDayTxtFld.getText());
                    
                    if (instruments.isEmpty()){
                        InstrumentToRent rentObj = new InstrumentToRent(inst, charge);
                        instruments.add(rentObj);
                        JOptionPane.showMessageDialog(frame, "The instrument " + inst +" is successfully added" );
                    }
                    
                    else {
                        boolean alreadyExists = false;
                        for (Instrument instrument : instruments){
                            if (inst.equals(instrument.getInstrumentName())){
                                JOptionPane.showMessageDialog(frame, "The instrument " + inst +" already exists" );
                                alreadyExists = true;
                                break;
                            }
                        }
                        if (alreadyExists != true){
                            InstrumentToRent rentObj = new InstrumentToRent(inst, charge);
                            instruments.add(rentObj);
                            JOptionPane.showMessageDialog(frame, "The instrument " + inst +" is successfully added" );
                        }
                    }  
                }
                
            }
            catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(frame, "Please enter a valid value on Charge/Day", "Input Error", JOptionPane.ERROR_MESSAGE );
            }
        }
        
        if(e.getSource() == rentBtn){
            /* 
             * if arraylist empty 
             *   dont rent
             *   show message:
             * else
             *  loop through the arraylist 
             *  check if instrument is rentable (ITR class) instanceof
             *      check if user instrument matches arraylist instrument name
             *      if doesn not match
             *          dont rent
             *       else
             *          if instrument has been already rented //call the getIsRented method (downcasting)
             *              if yes:
             *                  dont rent
             *              if no:
             *                  rent // call the rent method with the parameters (downcasting)
               */
            try{
                if (instNameRntTxtFld.getText().isEmpty() || customerNameTxtFld.getText().isEmpty() ||
                   customerPhoneTxtFld.getText().isEmpty() || panTxtFld.getText().isEmpty() ||
                   rentingDaysTxtFld.getText().isEmpty()){
                   JOptionPane.showMessageDialog(frame, "Please enter all the required fields to rent");
                }
                else {
                    if (instruments.isEmpty()){
                    JOptionPane.showMessageDialog(frame, "Sorry, No instruments available to rent" );
                }
                    else {
                        String inst = instNameRntTxtFld.getText().toLowerCase();
                        String customerName = customerNameTxtFld.getText().toLowerCase();
                        String customerPhone = customerPhoneTxtFld.getText().toLowerCase();
                        int pan = Integer.parseInt(panTxtFld.getText());
                        int rentingDays = Integer.parseInt(rentingDaysTxtFld.getText());
                        
                        String rentYear = (String) rentYearCB.getSelectedItem();
                        String rentMonth = (String) rentMonthCB.getSelectedItem();
                        String rentDay = (String) rentDayCB.getSelectedItem();
                        String rentDate = rentYear + "-" + rentMonth + "-" + rentDay;
                        
                        String returnYear = (String) returnYearCB.getSelectedItem();
                        String returnMonth = (String) returnMonthCB.getSelectedItem();
                        String returnDay = (String) returnDayCB.getSelectedItem();
                        String returnDate = returnYear + "-" + returnMonth + "-" + returnDay;

                        for (Instrument instrument : instruments){
                            if (instrument instanceof InstrumentToRent){
                                if (inst.equals(instrument.getInstrumentName())){
                                    InstrumentToRent instObj = (InstrumentToRent) instrument;
                                    if(instObj.isRented()){
                                        JOptionPane.showMessageDialog(frame, "The instrument '" + inst + "' is already rented");
                                        break;
                                    }
                                    else {
                                        instObj.rentInstrument(customerName, customerPhone,
                                        pan, rentDate, returnDate, rentingDays);
                                        JOptionPane.showMessageDialog(frame, "The instrument '" + inst + "' is rented successfylly");
                                    }
                                }
                                else {
                                    JOptionPane.showMessageDialog(frame, "The instrument is not found and cannot be rented");
                                }
                            }
                        }
                    }
                }
                
              
            } catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(frame, "Please enter numberic values on PAN num and Renting Days", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        if(e.getSource() == returnBtn){
            if(instNameRtnTxtFld.getText().isEmpty()){
                    JOptionPane.showMessageDialog(frame, "Please enter the name of the instrument to return");
                }
            else{
                if (instruments.isEmpty()){
                    JOptionPane.showMessageDialog(frame, "No instrument rented to return");
                    }
                else{
                    String inst = instNameRtnTxtFld.getText().toLowerCase();
                    for (Instrument instrument : instruments){
                        if (instrument instanceof InstrumentToRent){                        
                            if (inst.equals(instrument.getInstrumentName())){
                                InstrumentToRent instObj = (InstrumentToRent) instrument;
                                if (instObj.isRented()){
                                    instObj.returnInstrument();
                                    JOptionPane.showMessageDialog(frame, "The instrument '"+ inst +"' is returned successfully");
                                }
                                else{
                                    JOptionPane.showMessageDialog(frame, "The instrument '"+ inst +"' is not rented so cannot be returned");
                                }
                                }
                                else {
                                    JOptionPane.showMessageDialog(frame, "Instrument Not Found, cannot be returned");
                                }       
                            }
                        }
                    }              
              }
            } 
        
        if(e.getSource() == addBtnSell){
            try{
                if (instName2TxtFLd.getText().isEmpty() || instPriceTxtFld.getText().isEmpty()){
                    JOptionPane.showMessageDialog(frame, "Please fill the information on both Instrument Name and Price");
                }
                else {
                    String inst = instName2TxtFLd.getText().toLowerCase();
                    float price = Float.parseFloat(instPriceTxtFld.getText());
                
                    if (instruments.isEmpty()){
                        InstrumentToSell sellObj = new InstrumentToSell(inst, price);
                        instruments.add(sellObj);
                        JOptionPane.showMessageDialog(frame, "The instrument " + inst +" is successfully added" );
                    }
                    else {
                        boolean alreadyExists = false;
                        for (Instrument instrument : instruments){
                            if (inst.equals(instrument.getInstrumentName())){
                                JOptionPane.showMessageDialog(frame, "The instrument " + inst +" already exists" );
                                alreadyExists = true;
                                break;
                            }
                        }
                        if (alreadyExists != true){
                            InstrumentToSell sellObj = new InstrumentToSell(inst, price);
                            instruments.add(sellObj);
                            JOptionPane.showMessageDialog(frame, "The instrument " + inst +" is successfully added to sell" );
                        }
                    }                  
                }  
              
            } catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(frame, "Please enter numberic value on Price", "Input Error", JOptionPane.ERROR_MESSAGE );
            }
        }
        
        if(e.getSource() == sellBtn){
            
            try{
              if (instNameSellTxtFld.getText().isEmpty() || customerNameSellTxtFld.getText().isEmpty() ||
                  customerPhoneSellTxtFld.getText().isEmpty() || panNumSellTxtFld.getText().isEmpty() ||
                  discountTxtFld.getText().isEmpty()) {
                  JOptionPane.showMessageDialog(frame, "Please fill up all the information needed to sell an instrument" );
              }
              
              else{
                  if (instruments.isEmpty()){
                    JOptionPane.showMessageDialog(frame, "Sorry, No instruments available to sell." );
                  }
                  else{
                    String inst = instNameSellTxtFld.getText().toLowerCase();
                    String customer = customerNameSellTxtFld.getText().toLowerCase();
                    String phone = customerPhoneSellTxtFld.getText().toLowerCase();
                    int pan = Integer.parseInt(panNumSellTxtFld.getText());
                    float discount = Float.parseFloat(discountTxtFld.getText());
                  
                    String sellYear = (String) sellYearCB.getSelectedItem();
                    String sellMonth = (String) sellMonthCB.getSelectedItem();
                    String sellDay = (String) sellDayCB.getSelectedItem();
                    String sellDate = sellYear + "-" + sellMonth + "-" + sellDay;
                    for (Instrument instrument : instruments){
                        if (instrument instanceof InstrumentToSell){
                            if (inst.equals(instrument.getInstrumentName())){
                                InstrumentToSell sellObj = (InstrumentToSell) instrument;
                                if(sellObj.isSold()){
                                    JOptionPane.showMessageDialog(frame, "The instrument '" + inst + "' is already sold");
                                    break;
                                    }
                                else{
                                    sellObj.sellInstrument(customer, phone, pan, sellDate, discount);
                                    JOptionPane.showMessageDialog(frame, "The instrument '" + inst + "' is sold successfully");
                                    }
                                }
                            else{
                                JOptionPane.showMessageDialog(frame, "Instrument NOT Found, Cannot Be Sold");
                            }
                            }
                        }
                    } 
              }
              
            } catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(frame, "Please Enter numeric values on PAN num and Discount %.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        if (e.getSource() == displayBtn){
            if (instNameRtnTxtFld.getText().isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Please enter Instrument Name");
            }
            else {
                if (instruments.isEmpty()){
                    JOptionPane.showMessageDialog(frame, "No instrument available to display");
                }
                else {
                    String inst = instNameRtnTxtFld.getText().toLowerCase();
                    boolean found = false;
                    for (Instrument instrument : instruments){
                        if (instrument instanceof InstrumentToRent && inst.equals(instrument.getInstrumentName())){
                                InstrumentToRent rentObj = (InstrumentToRent) instrument;
                                rentObj.display();
                                found = true;
                                break;
                        }
                        if (instrument instanceof InstrumentToSell && inst.equals(instrument.getInstrumentName())){
                                InstrumentToSell sellObj = (InstrumentToSell) instrument;
                                sellObj.display();
                                found = true;
                                break;
                        }                        
                    } 
                    if (found == false){
                        JOptionPane.showMessageDialog(frame, "No information found for '" + inst +"' ");
                            
                    }
                }    
            }
        }
        
        
        if (e.getSource() == clearBtn){
            //clearing all textfields for rent side
            instNameTxtFld.setText("");
            chargePerDayTxtFld.setText("");
            instNameRntTxtFld.setText("");
            customerNameTxtFld.setText("");
            rentingDaysTxtFld.setText("");
            panTxtFld.setText("");
            customerPhoneTxtFld.setText("");
            instNameRtnTxtFld.setText("");
            rentYearCB.setSelectedIndex(0);
            rentMonthCB.setSelectedIndex(0);
            rentDayCB.setSelectedIndex(0);
            returnYearCB.setSelectedIndex(0);
            returnMonthCB.setSelectedIndex(0);
            returnDayCB.setSelectedIndex(0);
            
            //clearing for sell side
            instName2TxtFLd.setText("");
            instPriceTxtFld.setText("");
            instNameSellTxtFld.setText("");
            customerNameSellTxtFld.setText("");
            customerPhoneSellTxtFld.setText("");
            panNumSellTxtFld.setText("");
            discountTxtFld.setText("");
            sellYearCB.setSelectedIndex(0);
            sellMonthCB.setSelectedIndex(0);
            sellDayCB.setSelectedIndex(0);
        }
    }
}
