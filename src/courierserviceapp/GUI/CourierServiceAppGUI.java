package courierserviceapp.GUI;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

import courierserviceapp.domain.*;

public class CourierServiceAppGUI extends JFrame implements ActionListener{
	
	private AppController controller;
	
	private JLabel lblName;
	private JLabel lblPhone;
	private JLabel lblTrackNo;
	private JLabel lblPAddr;
	private JLabel lblDAddr;
	private JLabel lblDate;
	private JLabel lblCharge;
	private JLabel lblDStaff;
	private JLabel lblDStaffStatus;
	private JLabel lblStatus;

	private JTextField tfdName;
	private JTextField tfdPhone;
	private JTextField tfdTrackNo;
	private JTextField tfdDate;
	private JTextField tfdCharge;
	private JTextField tfdStatus;
	
	private JTextArea txaPAddr;
	private JTextArea txaDAddr;

	private JComboBox<String[]> cbxDStaff;
	
	private JButton btnAddClient;
	private JButton btnSearchClient;
	private JButton btnAddService;
	private JButton btnTrackService;
	private JButton btnCheck;
	private JButton btnAssign;
	private JButton btnUpdate;
	private JButton btnClearClient;
	private JButton btnClearService;
	
	public CourierServiceAppGUI(){
		controller = new AppController();
		
		//component
		lblName = new JLabel("Name:");
		lblPhone = new JLabel("Phone:");
		lblTrackNo = new JLabel("Tracking no.:");
		lblPAddr = new JLabel("Pickup Address:");
		lblDAddr = new JLabel("Delivery Address:");
		lblDate = new JLabel("Date:");
		lblCharge = new JLabel("Charge: (RM)");
		lblDStaff = new JLabel("Delivery Staff ID:");
		lblDStaffStatus = new JLabel("");
		lblStatus = new JLabel("Service Status");
		
		tfdName = new JTextField();
		tfdPhone = new JTextField();
		tfdTrackNo = new JTextField();
		tfdDate = new JTextField();
		tfdCharge = new JTextField();
		tfdStatus = new JTextField();
		
		txaPAddr = new JTextArea();
		txaDAddr = new JTextArea();
		
		cbxDStaff = new JComboBox(controller.getAllId());
		
		btnAddClient = new JButton("Add");
		btnSearchClient = new JButton("Search");
		btnAddService = new JButton("Add");
		btnTrackService = new JButton("Track");
		btnCheck = new JButton("Check Availability");
		btnAssign = new JButton("Assign");
		btnUpdate = new JButton("Update");
		btnClearClient = new JButton("Clear");
		btnClearService = new JButton("Clear");
		
		//component layout
		JPanel content = new JPanel();
		JPanel pnlClient = new JPanel();	
		JPanel pnlService = new JPanel();
		
		GroupLayout layoutClient = new GroupLayout(pnlClient);
		GroupLayout layoutService = new GroupLayout(pnlService);

        content.setBorder(
            BorderFactory.createEmptyBorder(5, 5, 5, 5));
        content.setLayout(new BorderLayout(5, 5));
        
		pnlClient.setLayout(layoutClient);
		pnlClient.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createTitledBorder("Client"),
                BorderFactory.createEmptyBorder(5,5,5,5)));
		
		pnlService.setLayout(layoutService);
		pnlService.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createTitledBorder("Service"),
                BorderFactory.createEmptyBorder(5,5,5,5)));
		
		layoutClient.setAutoCreateGaps(true);
		layoutClient.setAutoCreateContainerGaps(true);
		
		layoutService.setAutoCreateGaps(true);
		layoutService.setAutoCreateContainerGaps(true);
		
		//horizontal grouping
		layoutClient.setHorizontalGroup(layoutClient.createSequentialGroup()
				.addGroup(layoutClient.createParallelGroup(
						GroupLayout.Alignment.LEADING)
						.addComponent(lblName)
						.addComponent(lblPhone)
						.addComponent(btnClearClient))
				.addGroup(layoutClient.createParallelGroup(
						GroupLayout.Alignment.LEADING)
						.addComponent(tfdName)
						.addComponent(tfdPhone))
				.addGroup(layoutClient.createParallelGroup(
						GroupLayout.Alignment.LEADING)
						.addComponent(btnSearchClient)
						.addComponent(btnAddClient))
				);
		
		layoutService.setHorizontalGroup(layoutService.createSequentialGroup()
				.addGroup(layoutService.createParallelGroup(
						GroupLayout.Alignment.LEADING)
						.addComponent(lblTrackNo)
						.addComponent(lblPAddr)
						.addComponent(lblDAddr)
						.addComponent(lblDate)
						.addComponent(lblCharge)
						.addComponent(lblDStaff)
						.addComponent(lblStatus)
						.addComponent(btnClearService))
				.addGroup(layoutService.createParallelGroup(
						GroupLayout.Alignment.LEADING)
						.addComponent(tfdTrackNo)
						.addComponent(txaPAddr)
						.addComponent(txaDAddr)
						.addComponent(tfdDate)
						.addComponent(tfdCharge)
						.addComponent(cbxDStaff)
						.addComponent(lblDStaffStatus)
						.addComponent(tfdStatus))
				.addGroup(layoutService.createParallelGroup(
						GroupLayout.Alignment.LEADING)
						.addComponent(btnTrackService)
						.addComponent(btnAddService)
						.addComponent(btnCheck)
						.addComponent(btnAssign)
						.addComponent(btnUpdate))
		);
		
		//vertical grouping
		layoutClient.setVerticalGroup(layoutClient.createSequentialGroup()
				.addGroup(layoutClient.createParallelGroup(
						GroupLayout.Alignment.BASELINE)
						.addComponent(lblName)
						.addComponent(tfdName)
						.addComponent(btnSearchClient))
				.addGroup(layoutClient.createParallelGroup(
						GroupLayout.Alignment.BASELINE)
						.addComponent(lblPhone)
						.addComponent(tfdPhone)
						.addComponent(btnAddClient))
				.addGroup(layoutClient.createParallelGroup(
						GroupLayout.Alignment.BASELINE)
						.addComponent(btnClearClient))
		);
		
		layoutService.setVerticalGroup(layoutService.createSequentialGroup()
				.addGroup(layoutService.createParallelGroup(
						GroupLayout.Alignment.BASELINE)
						.addComponent(lblTrackNo)
						.addComponent(tfdTrackNo)
						.addComponent(btnTrackService))
				.addGroup(layoutService.createParallelGroup(
						GroupLayout.Alignment.BASELINE)
						.addComponent(lblPAddr)
						.addComponent(txaPAddr))
				.addGroup(layoutService.createParallelGroup(
						GroupLayout.Alignment.BASELINE)
						.addComponent(lblDAddr)
						.addComponent(txaDAddr))
				.addGroup(layoutService.createParallelGroup(
						GroupLayout.Alignment.BASELINE)
						.addComponent(lblDate)
						.addComponent(tfdDate))
				.addGroup(layoutService.createParallelGroup(
						GroupLayout.Alignment.BASELINE)
						.addComponent(lblCharge)
						.addComponent(tfdCharge)
						.addComponent(btnAddService))
				.addGroup(layoutService.createParallelGroup(
						GroupLayout.Alignment.BASELINE)
						.addComponent(lblDStaff)
						.addComponent(cbxDStaff)
						.addComponent(btnCheck))
				.addGroup(layoutService.createParallelGroup(
						GroupLayout.Alignment.BASELINE)
						.addComponent(lblDStaffStatus)
						.addComponent(btnAssign))
				.addGroup(layoutService.createParallelGroup(
						GroupLayout.Alignment.BASELINE)
						.addComponent(lblStatus)
						.addComponent(tfdStatus)
						.addComponent(btnUpdate))
				.addGroup(layoutService.createParallelGroup(
						GroupLayout.Alignment.BASELINE)
						.addComponent(btnClearService))
		);
		
		//set button same size
		layoutService.linkSize(SwingConstants.HORIZONTAL, 
				btnAddService, btnTrackService, btnAssign, btnUpdate);
		
		content.add(pnlClient,BorderLayout.PAGE_START);
		content.add(pnlService,BorderLayout.CENTER);
		
		btnAddClient.addActionListener(this);
		btnSearchClient.addActionListener(this);
		btnAddService.addActionListener(this);
		btnTrackService.addActionListener(this);
		btnCheck.addActionListener(this);
		btnAssign.addActionListener(this);
		btnUpdate.addActionListener(this);
		btnClearClient.addActionListener(this);
		btnClearService.addActionListener(this);
		cbxDStaff.addItemListener(new ItemChangeListener());
		
		this.setContentPane(content);
		this.pack();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Courier Service App");
		this.setSize(500, 600);
		
		lblName.setMinimumSize(new Dimension(80, 0));
		tfdName.setMaximumSize(new Dimension(200, 20));
		tfdPhone.setMaximumSize(new Dimension(200, 20));
		
		lblDStaffStatus.setFont(new Font("Courier New", Font.ITALIC, 12));
		
		btnAddService.setEnabled(false);
		btnAssign.setEnabled(false);
		btnUpdate.setEnabled(false);
		btnCheck.setEnabled(false);
		tfdStatus.setEditable(false);
		
		tfdDate.setText(controller.getDate());
		cbxDStaff.setSelectedIndex(-1);
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		
		if(event.getSource() == btnAddClient){
			String name = tfdName.getText();
			String phone = tfdPhone.getText();
			
			if(name.equals("") || phone.equals("")){
				JOptionPane.showMessageDialog(null, "Please fill in complete detail.");
			}
			else{
				
				if(controller.searchClient(name) == null){
					controller.addClient(name, phone);
					JOptionPane.showMessageDialog(null, "Client added!");
					btnAddService.setEnabled(true);
					
				}
				else {
					JOptionPane.showMessageDialog(null, "Client already exists!");
					btnAddService.setEnabled(false);
				}
			}
				
		}
		
		else if(event.getSource() == btnSearchClient) {
			String name = tfdName.getText();
			String phone = tfdPhone.getText();
			
			if(name.equals("")){
				JOptionPane.showMessageDialog(null, "Please fill in name.");
			}
			else{
				if(controller.searchClient(name) != null) {
					JOptionPane.showMessageDialog(null, "Client found!");
					tfdName.setText(controller.getCurrentClient().getName());
					tfdPhone.setText(controller.getCurrentClient().getPhone());
					btnAddService.setEnabled(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Client not found!");
					btnAddService.setEnabled(false);
				}
			}
		}
		
		
		else if(event.getSource() == btnAddService) {
			String trackNoString = tfdTrackNo.getText();
			String pAddr = txaPAddr.getText();
			String dAddr = txaDAddr.getText();
			String date = tfdDate.getText();
			String chargeString = tfdCharge.getText();
			
			if(trackNoString.equals("") || pAddr.equals("") || dAddr.equals("")
					|| date.equals("") || chargeString.equals("")){
				JOptionPane.showMessageDialog(null, "Please fill in complete details.");
			}
			else{
				int trackNo = Integer.parseInt(tfdTrackNo.getText());
				double charge = Double.parseDouble(tfdCharge.getText());
				
				if(controller.trackService(trackNo) == null){
					controller.addService(trackNo, pAddr, dAddr, date, 
							charge, controller.getCurrentClient());

					JOptionPane.showMessageDialog(null, "Service added!");
					btnCheck.setEnabled(true);
					tfdStatus.setText(controller.getCurrentService().getStatus());
					
				}
				else{
					JOptionPane.showMessageDialog(null, "Tracking number exists!");
					btnCheck.setEnabled(false);
					btnUpdate.setEnabled(false);
				}
			}
		}
		
		else if(event.getSource() == btnTrackService) {
			
			if(tfdTrackNo.getText().equals("")){
				JOptionPane.showMessageDialog(null, "Please fill in tracking no.");
			}
			else{
				int trackNo = Integer.parseInt(tfdTrackNo.getText());
				
				if(controller.trackService(trackNo) == null){
					JOptionPane.showMessageDialog(null, "Service record not found!");
					btnCheck.setEnabled(false);
					btnUpdate.setEnabled(false);
					
				}
				else{
					JOptionPane.showMessageDialog(null, "Service found.");
					
					tfdName.setText(controller.getCurrentClient().getName());
					tfdPhone.setText(controller.getCurrentClient().getPhone());
					txaPAddr.setText(controller.getCurrentService().getPickupAddr());
					txaDAddr.setText(controller.getCurrentService().getDeliveryAddr());
					tfdDate.setText(controller.getCurrentService().getDate());
					tfdCharge.setText(Double.toString(controller.getCurrentService().getCharge()));
					tfdStatus.setText(controller.getCurrentService().getStatus());
					btnCheck.setEnabled(true);
					
					if(controller.getCurrentDStaff() != null){
						btnCheck.setEnabled(false);
						cbxDStaff.setSelectedItem(Integer.toString(controller.getCurrentDStaff().getId()));
						
						if(controller.getCurrentService().getStatus() == "delivering"){
							btnUpdate.setEnabled(true);
						}
					}
					
					
				}
			}
		}
		
		else if(event.getSource() == btnCheck) {
			if(cbxDStaff.getSelectedIndex() < 0){
				JOptionPane.showMessageDialog(null, "Please select a staff.");
			}
			else{
				boolean available = controller.checkAvailable(
						Integer.parseInt(cbxDStaff.getSelectedItem().toString()));
				if(available){
					JOptionPane.showMessageDialog(null, "Staff available.");
					lblDStaffStatus.setText("*Available!");
					btnAssign.setEnabled(true);
				}
				else{
					btnAssign.setEnabled(false);
					JOptionPane.showMessageDialog(null, "Staff not available. Try again.");
					lblDStaffStatus.setText("*Not Available!");
				}
			}
		}
		
		else if(event.getSource() == btnAssign) {
			controller.assignDStaff(controller.getCurrentService(), controller.getCurrentDStaff());
			JOptionPane.showMessageDialog(null, "Staff assigned! Item delivering.");
			tfdStatus.setText(controller.getCurrentService().getStatus());
			lblDStaffStatus.setText("");
			btnAssign.setEnabled(false);
			btnUpdate.setEnabled(true);
		}
		
		
		
		else if(event.getSource() == btnUpdate) {
				controller.updateDelivered(controller.getCurrentService());
				tfdStatus.setText(controller.getCurrentService().getStatus());
				JOptionPane.showMessageDialog(null, "Service complete!");
		}
		
		else if(event.getSource() == btnClearClient) {
			controller.setCurrentClient(null);
			
			tfdName.setText("");
			tfdPhone.setText("");
			
			btnAddService.setEnabled(false);
		}
		else if(event.getSource() == btnClearService) {
			controller.setCurrentService(null);
			controller.setCurrentDStaff(null);
			
			tfdTrackNo.setText("");
			txaPAddr.setText("");
			txaDAddr.setText("");
			tfdDate.setText(controller.getDate());
			tfdCharge.setText("");
			cbxDStaff.setSelectedIndex(-1);
			lblDStaffStatus.setText("");
			tfdStatus.setText("");
			
			btnCheck.setEnabled(false);
			btnAssign.setEnabled(false);
			btnUpdate.setEnabled(false);
		}
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try{
					CourierServiceAppGUI frame = new CourierServiceAppGUI();
					frame.setVisible(true);
				} catch(Exception e){
					e.printStackTrace();
				}
			}
		});
	}
	
	class ItemChangeListener implements ItemListener{
	    @Override
	    public void itemStateChanged(ItemEvent event) {
	       if (event.getStateChange() == ItemEvent.SELECTED) {
	    	   btnAssign.setEnabled(false);
	       }
	    }       
	}
}


