import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPopupMenu;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JMenuItem;
import java.awt.Color;
import javax.swing.SwingConstants;

public class ProbA_MainWindow {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	
	
	JPopupMenu menu = new JPopupMenu("Popup");
	class MyLabel extends JLabel
	{
		public MyLabel(String text) {
			super(text);
			addMouseListener(new PopupTriggerListener());
	    }

	    class PopupTriggerListener extends MouseAdapter {
	    	public void mousePressed(MouseEvent ev) {
	    		if (ev.isPopupTrigger()) {
	    			menu.show(ev.getComponent(), ev.getX(), ev.getY());
	    		}
	    	}

	    	public void mouseReleased(MouseEvent ev) {
	    		if (ev.isPopupTrigger()) {
	    			menu.show(ev.getComponent(), ev.getX(), ev.getY());
	    		}
	    	}

	    	public void mouseClicked(MouseEvent ev) {
	    	}
	    }
	}
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProbA_MainWindow window = new ProbA_MainWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ProbA_MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JLabel lblChangeProperties = new MyLabel("Change Properties");
		lblChangeProperties.setForeground(Color.BLACK);
		//lblChangeProperties.setBackground(Color.WHITE);
		lblChangeProperties.setBounds(163, 119, 112, 36);
		frame.getContentPane().add(lblChangeProperties);
		lblChangeProperties.setOpaque(true);
		
		ProbA_EditWindow editobj=new ProbA_EditWindow(lblChangeProperties,frame);
		
		JMenuItem item = new JMenuItem("Option1");
	    item.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		System.out.println("Menu item Option1");
	    	}
	    });
	    menu.add(item);

	    item = new JMenuItem("Option2");
	    item.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		System.out.println("Menu item Option2");
	    	}
	    });
	    menu.add(item);
	    
	    item = new JMenuItem("Properties");
	    item.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		System.out.println("Menu item Properties");
	    		frame.setVisible(false);
	    		//frame.dispose();
	    		editobj.setVisible(true);
	    	}
	    });
	    menu.add(item);
	    
	    
		
		
	}
}
