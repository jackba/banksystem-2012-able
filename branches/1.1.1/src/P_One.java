import java.awt.*;
import javax.swing.*;

import java.awt.event.*;
public class P_One extends JPanel {
   
    private Frame F;
     
    public P_One(Frame f) {
    	JPasswordField pwField;
    	final JTextField idField;
    	JLabel label1;
    	JLabel label2;
    	final JButton jButton1;

    	    	
        setBackground(Color.LIGHT_GRAY);
        setBounds(94, 20, 854, 551);

        setLayout(null);
         
        F = f;
         
       
        pwField = new JPasswordField();
		pwField.setFont(new Font("Dialog.plain", 0, 12));
		pwField.setForeground(new Color(-13421773));
		pwField.setBackground(new Color(-1));
		pwField.setBounds(188, 98, 139, 46);
		add(pwField);

		idField = new JTextField();
		idField.setText("testttttttt"); //수정
		idField.setFont(new Font("Dialog.plain", 0, 12));
		idField.setForeground(new Color(-13421773));
		idField.setBackground(new Color(-1));
		idField.setBounds(188, 50, 140, 42);
		add(idField);

		label1 = new JLabel();
		label1.setText("아이디");
		label1.setFont(new Font("Dialog.plain", 0, 12));
		label1.setIcon(new ImageIcon(""));
		label1.setForeground(new Color(-13421773));
		label1.setBackground(new Color(-1118482));
		label1.setBounds(84, 59, 77, 23);
		add(label1);

		label2 = new JLabel();
		label2.setText("비밀번호");
		label2.setFont(new Font("Dialog.plain", 0, 12));
		label2.setIcon(new ImageIcon(""));
		label2.setForeground(new Color(-13421773));
		label2.setBackground(new Color(-1118482));
		label2.setBounds(81, 108, 69, 24);
		add(label2);

		jButton1 = new JButton();
		jButton1.setText("관리자 로그인");
		jButton1.setFont(new Font("Dialog.plain", 0, 12));
		jButton1.setIcon(new ImageIcon(""));
		jButton1.setForeground(new Color(-13421773));
		jButton1.setBounds(74, 167, 115, 36);
		
		final JButton jButton2 = new JButton();
		jButton2.setText("고객 로그인");
		jButton2.setFont(new Font("Dialog.plain", 0, 12));
		jButton2.setIcon(new ImageIcon(""));
		jButton2.setForeground(new Color(-13421773));
		jButton2.setBounds(198, 167, 139, 36);
		
		jButton1.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent arg0) {
	            	F.changePanel();
	            }
	    });
		
		jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	
            		F.changePanel2();
               
            }
		});
		
		
		add(jButton1);
		add(jButton2);
		
	}

}
