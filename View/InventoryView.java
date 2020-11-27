package View;
//Generated by GuiGenie - Copyright (c) 2004 Mario Awad.
//Home Page http://guigenie.cjb.net - Check often for new versions!

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class InventoryView extends JPanel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton checkInvButton;
    private JButton searchButton;
    private JButton addButton;
    private JButton deleteButton;
    private JButton clearButton;
    private JButton decreaseButton;
    private JTextField searchText;
    private JRadioButton idRadio;
    private JRadioButton nameRadio;
    private DefaultListModel<String> listModel;
    private JList<String> inventoryField;
    private JScrollPane scrollPane;
    private JTextField orderText;
    private JButton orderButton;
    private JTextField toolIdText;
    private JTextField toolNameText;
    private JTextField stockText;
    private JTextField priceText;
    private JTextField supplierText;
    private JComboBox<String> toolTypeField;
    private JTextField powerText;
    private JLabel jcomp1;
    private JLabel jcomp2;
    private JLabel jcomp3;
    private JLabel jcomp4;
    private JLabel jcomp5;
    private JLabel jcomp6;
    private JLabel jcomp7;
    private JLabel jcomp8;
    private JLabel jcomp9;
    private JLabel jcomp10;
    private JButton quitButton;
    
    public InventoryView() {
        //adjust size and set layout
        setPreferredSize (new Dimension (903, 759));
        setLayout (null);

        addLabelsInventory();
        addInventoryInformation();
        addSearchInventory();
        addMiscInventory();
        
        quitButton = new JButton("Quit");
        add(quitButton);
        quitButton.setBounds (400, 700, 100, 20);
    }
    
    public void addQuitListener(ActionListener quit) {
    	quitButton.addActionListener(quit);
    }
    
    //---------------------------------------------------------------------------------------
	// LABELS IN THE JFRAME
	//---------------------------------------------------------------------------------------
    private void addLabelsInventory() {
    	jcomp1 = new JLabel ("Inventory Management");
    	jcomp2 = new JLabel ("Search Tools By:");
    	jcomp3 = new JLabel ("Tool Id");
        jcomp4 = new JLabel ("Name");
        jcomp5 = new JLabel ("Tool Type");
        jcomp6 = new JLabel ("Stock");
        jcomp7 = new JLabel ("Price");
        jcomp8 = new JLabel ("Supplier Id");
        jcomp9 = new JLabel ("Tool Information");
        jcomp10 = new JLabel ("Power Type");
        
        add(jcomp1);
        add(jcomp2);
        add(jcomp3);
        add(jcomp4);
        add(jcomp5);
        add(jcomp6);
        add(jcomp7);
        add(jcomp8);
        add(jcomp9);
        add(jcomp10);
        
        jcomp1.setBounds (375, 50, 155, 45);
        jcomp2.setBounds (100, 130, 100, 25);
        jcomp3.setBounds (610, 290, 80, 25);
        jcomp4.setBounds (610, 330, 80, 25);
        jcomp5.setBounds (610, 370, 80, 25);
        jcomp6.setBounds (610, 410, 80, 25);
        jcomp7.setBounds (610, 450, 80, 25);
        jcomp8.setBounds (610, 490, 80, 25);
        jcomp9.setBounds (640, 250, 100, 25);
        jcomp10.setBounds (610, 530, 80, 25);
    }
    
    //---------------------------------------------------------------------------------------
    // FOR INVENTORY INFORMATION INCLUDES ADDING OR DELETING TOOLS
    //---------------------------------------------------------------------------------------
    private void addInventoryInformation() {
    	String[] toolTypeFieldItems = {"Electrical", "Non-Electrical"};
    	
    	addButton = new JButton ("Add");
        deleteButton = new JButton ("Delete");
        clearButton = new JButton ("Clear");
        decreaseButton = new JButton ("Buy");
        toolIdText = new JTextField (5);
        toolNameText = new JTextField (5);
        stockText = new JTextField (5);
        priceText = new JTextField (5);
        supplierText = new JTextField (5);
        toolTypeField = new JComboBox<String> (toolTypeFieldItems);  
        powerText = new JTextField (5);

        add (addButton);
        add (deleteButton);
        add (clearButton);
        add (decreaseButton);
        add (toolIdText);
        add (toolNameText);
        add (stockText);
        add (priceText);
        add (supplierText);
        add (toolTypeField);
        add (powerText);
        
        addButton.setBounds (585, 590, 100, 25);
        deleteButton.setBounds (715, 590, 100, 25);
        clearButton.setBounds (650, 630, 100, 25);
        decreaseButton.setBounds (650, 670, 100, 25);
        toolIdText.setBounds (690, 290, 100, 25);
        toolNameText.setBounds (690, 330, 100, 25);
        stockText.setBounds (690, 410, 100, 25);
        priceText.setBounds (690, 450, 100, 25);
        supplierText.setBounds (690, 490, 100, 25);
        toolTypeField.setBounds (690, 370, 100, 25);
        powerText.setBounds (690, 530, 100, 25);
    }
    
    //-----------------------------------------
    // Tool Id Field
    public JTextField getToolIdField() {
    	return toolIdText;
    }
    public String getToolIdText() {
    	return toolIdText.getText();
    }
    
    //-----------------------------------------
    // Tool Name Field
    public JTextField getToolNameField() {
    	return toolNameText;
    }
    public String getToolNameText() {
    	return toolNameText.getText();
    }
    
    //-----------------------------------------
    // Stock Quantity Field
    public JTextField getStockField() {
    	return stockText;
    }
    public String getStockText() {
    	return stockText.getText();
    }
    
    //-----------------------------------------
    // Price Field
    public JTextField getPriceField() {
    	return priceText;
    }
    public String getPriceText() {
    	return priceText.getText();
    }
    
    //-----------------------------------------
    // Supplier Id Field
    public JTextField getSupplierField() {
    	return supplierText;
    }
    public String getSupplierText() {
    	return supplierText.getText();
    }
    
    //-----------------------------------------
    // Tool Type Field
    public JComboBox<String> getToolTypeField() {
    	return toolTypeField;
    }
    public String getToolTypeText() {
    	return (String) toolTypeField.getSelectedItem();
    }
    
    //-----------------------------------------
    // Power Type Field
    public JTextField getPowerField() {
    	return powerText;
    }
    public String getPowerText() {
    	return powerText.getText();
    }
    
    //-----------------------------------------
    // ACTION LISTENERS
    public void addDeleteListener(ActionListener del) {
    	deleteButton.addActionListener(del);
    }
    
    public void addAddListener(ActionListener add) {
    	addButton.addActionListener(add);
    }
    
    public void addDecreaseListener(ActionListener dec) {
    	decreaseButton.addActionListener(dec);
    }
    public void addItemChangeListener(ItemListener change) {
    	toolTypeField.addItemListener(change);
    }
    //---------------------------------------------------------------------------------------
    // FOR SEARCHING TOOLS BY ID, NAME, OR TYPE
    //---------------------------------------------------------------------------------------
    private void addSearchInventory() {   	
    	searchButton = new JButton ("Search");
    	searchText = new JTextField (5);
    	
    	idRadio = new JRadioButton ("id");
    	nameRadio = new JRadioButton ("name");
    	ButtonGroup group = new ButtonGroup();
        group.add(idRadio);
        group.add(nameRadio);
        
        listModel = new DefaultListModel<String>();
        inventoryField = new JList<String> (listModel);
        inventoryField.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        scrollPane = new JScrollPane(inventoryField);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
        
    	add (searchButton);
    	add (searchText);
        add (idRadio);
        add (nameRadio);
        add (scrollPane);
        
    	searchButton.setBounds (275, 200, 100, 25);
		searchText.setBounds (95, 200, 160, 25);
	    idRadio.setBounds (100, 160, 50, 25);
	    nameRadio.setBounds (150, 160, 100, 25);
	    scrollPane.setBounds (90, 245, 415, 415);
    }
    
    //-----------------------------------------
    // Search Text Field
    public JTextField getSearchField() {
    	return searchText;
    }
    public String getSearchText() {
    	return searchText.getText();
    }
    
    //-----------------------------------------
    // Search Type Field
    public String getSearchTypeField() {
    	if(idRadio.isSelected()) 
    		return idRadio.getText();
    	
    	if(nameRadio.isSelected())
    		return nameRadio.getText();
    	
    	return null;
    }
    
    //-----------------------------------------
    // Search Results Field
    public JList<String> getSearchList(){
    	return inventoryField;
    }
    public DefaultListModel<String> getListModel(){
    	return listModel;
    }
    
    //-----------------------------------------
    // ACTION LISTENERS
    public void addSearchListener(ActionListener search) {
    	searchButton.addActionListener(search);
    }
       
    public void addSearchListListener(ListSelectionListener search) {
    	inventoryField.addListSelectionListener(search);
    }
      
    //---------------------------------------------------------------------------------------
    // FOR GETTING ORDER AND CHECKING INVENTORY, DISPLAY INVENTORY
    //---------------------------------------------------------------------------------------
    private void addMiscInventory() {
    	checkInvButton = new JButton ("Check Inverntory");
    	orderText = new JTextField (5);
        orderButton = new JButton ("Print Order");
        
    	add (checkInvButton);
    	add (orderText);
        add (orderButton);
        
    	checkInvButton.setBounds (625, 120, 140, 35);
    	orderText.setBounds (575, 185, 105, 25);
        orderButton.setBounds (720, 185, 100, 25);
    }
    
    //-----------------------------------------
    // Order Date Field
    public String getOrderText() {
    	return orderText.getText();
    }
    
    //-----------------------------------------
    // ACTION LISTENERS
    public void addClearListener(ActionListener clear) {
    	clearButton.addActionListener(clear);
    }
    public void addCheckListener(ActionListener check) {
    	checkInvButton.addActionListener(check);
    }
    public void addOrderListener(ActionListener order) {
    	orderButton.addActionListener(order);
    }
    
    //-----------------------------------------
    // FOR POP-UPS
    public void showError(String errMessage) {
        JOptionPane.showMessageDialog(this, errMessage);
    }
}