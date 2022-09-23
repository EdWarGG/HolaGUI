package dad.holagui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HolaMundoSwing {

	public static void main(String[] args) {
		
		
		JLabel saludarLabel=new JLabel();
		saludarLabel.setText("Aquí saldrá el saludo");
		saludarLabel.setBounds(20, 20, 120, 50);
		
		
		JButton saludarButton=new JButton();
		saludarButton.setText("Saludar");
		saludarButton.setBounds(20, 20, 120, 30);
		saludarButton.addActionListener(e ->  saludarLabel.setText("¡Hola Mundo!"));
		
			
		JPanel rootPanel=new JPanel();
		rootPanel.setLayout(null);
		rootPanel.add(saludarLabel);
		rootPanel.add(saludarButton);
		
		
		final JFrame frame=new JFrame();
		frame.setTitle("Hola mundo con Swing");
		frame.setSize(320, 200);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.add(rootPanel);
		frame.setVisible(true);

	}
	

}
