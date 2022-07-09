package lab11;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class FruitBasket implements ActionListener{

	private static final int FRAME_WIDTH = 500;
	private static final int FRAME_HEIGHT = 500;
	private static final int FRAME_X_ORIGIN = 300;
	private static final int FRAME_Y_ORIGIN = 100;
	private static final int BANANA_PRICE = 10;
	private static final int APPLE_PRICE = 20;
	
	private JFrame frmFruitBasket;
	private JTextField txtKilo;
	private JLabel responce, pic, kilo;
	private Integer currentPricePerKilo = 0;
	
	private JMenu chooseMenu;
	
	private ImageIcon basketIcon = new ImageIcon(FruitBasket.class.getResource("/images/Basket.png"));
	private ImageIcon bananaIcon = new ImageIcon(FruitBasket.class.getResource("/images/Banana.png"));
	private ImageIcon appleIcon = new ImageIcon(FruitBasket.class.getResource("/images/Apple.png"));

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FruitBasket window = new FruitBasket();
					window.frmFruitBasket.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FruitBasket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFruitBasket = new JFrame();
		frmFruitBasket.setTitle("Fruit Basket");
		frmFruitBasket.setBounds(FRAME_X_ORIGIN, FRAME_Y_ORIGIN, FRAME_WIDTH, FRAME_HEIGHT);
		frmFruitBasket.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel resultPanel = new JPanel();
		resultPanel.setBackground(Color.WHITE);
		frmFruitBasket.getContentPane().add(resultPanel, BorderLayout.SOUTH);
		
		JButton calButton = new JButton("Calculate");
		calButton.addActionListener(this);
		resultPanel.add(calButton);
		
		responce = new JLabel("Basket worths 0 baht");
		resultPanel.add(responce);
		
		JPanel fruitPanel = new JPanel();
		fruitPanel.setBackground(Color.WHITE);
		frmFruitBasket.getContentPane().add(fruitPanel, BorderLayout.CENTER);
		
		pic = new JLabel("");
		pic.setIcon(basketIcon);
		fruitPanel.add(pic);
		
		txtKilo = new JTextField();
		fruitPanel.add(txtKilo);
		txtKilo.setColumns(5);
		
		kilo = new JLabel("Kilogram");
		fruitPanel.add(kilo);
		
		createChooseMenu();
		JMenuBar menuBar = new JMenuBar();
		frmFruitBasket.setJMenuBar(menuBar);
		menuBar.add(chooseMenu);	
	}
	
	private void createChooseMenu() {
		
		chooseMenu = new JMenu("Choose");
		
		
		JMenuItem bananaItem = new JMenuItem("Banana");
		bananaItem.addActionListener(this);
		chooseMenu.add(bananaItem);
		
		JMenuItem appleItem = new JMenuItem("Apple");
		appleItem.addActionListener(this);
		chooseMenu.add(appleItem);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		if (event.getSource() instanceof JButton) {
			// JButton Zone
			String txtInt = txtKilo.getText();
			if(!txtInt.isEmpty()) {
				int worth = Integer.parseInt(txtInt);
				responce.setText("Basket worths: "+ worth * currentPricePerKilo +" baht");
			}
			
		}else if (event.getSource() instanceof JMenuItem) {
			//JMenuItem Zone
			String menuName = ((JMenuItem)event.getSource()).getText();
			if(menuName.equals("Banana")) {
				pic.setIcon(bananaIcon);
				currentPricePerKilo = BANANA_PRICE;
				kilo.setText("Kilogram x "+ currentPricePerKilo+" baht");
				
			}else if(menuName.equals("Apple")) {
				pic.setIcon(appleIcon);
				currentPricePerKilo = APPLE_PRICE;
				kilo.setText("Kilogram x "+ currentPricePerKilo+" baht");
				
			}
		}
	}

}
