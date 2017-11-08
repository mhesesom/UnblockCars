import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Event;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.GridBagLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.SpringLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UnblockCars {

	private JFrame frmUnblockCras;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UnblockCars window = new UnblockCars();
					window.frmUnblockCras.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UnblockCars() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmUnblockCras = new JFrame();
		frmUnblockCras.setTitle("Unblock Cras");
		frmUnblockCras.getContentPane().setBackground(new Color(176, 224, 230));
		SpringLayout springLayout = new SpringLayout();
		frmUnblockCras.getContentPane().setLayout(springLayout);
		
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SecondFrame fr = new SecondFrame();
				
				fr.setVisible(true);
				fr.setSize(900,900);
				fr.setTitle("Second Page");	
				

			}

		});
		springLayout.putConstraint(SpringLayout.NORTH, btnStart, -291, SpringLayout.SOUTH, frmUnblockCras.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnStart, 357, SpringLayout.WEST, frmUnblockCras.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnStart, -246, SpringLayout.SOUTH, frmUnblockCras.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnStart, 505, SpringLayout.WEST, frmUnblockCras.getContentPane());
		frmUnblockCras.getContentPane().add(btnStart);
		frmUnblockCras.setBounds(100, 100, 916, 673);
		frmUnblockCras.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
