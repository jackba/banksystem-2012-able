import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;
import javax.swing.table.*;
import javax.swing.border.*;
import java.io.*;

class P_Two extends JPanel 
{
	private Frame f;

	JPanel jPanel1;
	JTabbedPane jTabbedPane1;
	

	public P_Two(Frame f)
	{
		UIManager.put("swing.boldMetal", Boolean.FALSE);

		//setTitle("새 프래임");
		setBounds(94, 20, 854, 551);
		//setDefaultCloseOperation(EXIT_ON_CLOSE);

		//	panel = new JPanel();
		setLayout(null);

		makeComponent();

	
	}

	public void makeComponent()
	{
		jPanel1 = new JPanel();
		jPanel1.setLayout(null);
		jPanel1.setFont(new Font("Dialog.plain", 0, 12));
		jPanel1.setBackground(new Color(-1118482));
		jPanel1.setBounds(7, 5, 816, 476);
		jPanel1.setBorder(new EtchedBorder());
		add(jPanel1);

		jTabbedPane1 = new JTabbedPane();
		JPanel jTabbedPane1_Create = new JPanel();
		jTabbedPane1_Create.setLayout(null);
		jTabbedPane1_Create.setBackground(jTabbedPane1.getBackground());
		
		
		JPanel jTabbedPane1_Del = new JPanel();
		jTabbedPane1_Del.setLayout(null);
		jTabbedPane1_Del.setBackground(jTabbedPane1.getBackground());
		
		JPanel jTabbedPane1_Display = new JPanel();
		jTabbedPane1_Display.setLayout(null);
		jTabbedPane1_Display.setBackground(jTabbedPane1.getBackground());
		
		jTabbedPane1.addTab("계좌생성", jTabbedPane1_Create);
		jTabbedPane1.addTab("계좌삭제", jTabbedPane1_Del);
		jTabbedPane1.addTab("계좌정보보기", jTabbedPane1_Display);
		jTabbedPane1.setFont(new Font("Dialog.plain", 0, 12));
		jTabbedPane1.setForeground(new Color(-13421773));
		jTabbedPane1.setBounds(7, 5, 816, 476);

		jPanel1.add(jTabbedPane1);
		
		
		final JTextField jTextField1 = new JTextField();
		
		jTextField1.setFont(new Font("Dialog.plain", 0, 12));
		jTextField1.setForeground(new Color(-13421773));
		jTextField1.setBackground(new Color(-1));
		jTextField1.setBounds(81, 21, 396, 45);
		jTabbedPane1_Create.add(jTextField1);

		final JTextField jTextField2 = new JTextField();
		
		jTextField2.setFont(new Font("Dialog.plain", 0, 12));
		jTextField2.setForeground(new Color(-13421773));
		jTextField2.setBackground(new Color(-1));
		jTextField2.setBounds(80, 74, 398, 40);
		jTabbedPane1_Create.add(jTextField2);

		final JTextField jTextField3 = new JTextField();
		
		jTextField3.setFont(new Font("Dialog.plain", 0, 12));
		jTextField3.setForeground(new Color(-13421773));
		jTextField3.setBackground(new Color(-1));
		jTextField3.setBounds(82, 126, 397, 41);
		jTabbedPane1_Create.add(jTextField3);

		final JTextField jTextField4 = new JTextField();
		
		jTextField4.setFont(new Font("Dialog.plain", 0, 12));
		jTextField4.setForeground(new Color(-13421773));
		jTextField4.setBackground(new Color(-1));
		jTextField4.setBounds(82, 177, 396, 41);
		jTabbedPane1_Create.add(jTextField4);

		final JTextField jTextField5 = new JTextField();
		
		jTextField5.setFont(new Font("Dialog.plain", 0, 12));
		jTextField5.setForeground(new Color(-13421773));
		jTextField5.setBackground(new Color(-1));
		jTextField5.setBounds(80, 234, 396, 47);
		jTabbedPane1_Create.add(jTextField5);

		final JTextField jTextField6 = new JTextField();
		
		jTextField6.setFont(new Font("Dialog.plain", 0, 12));
		jTextField6.setForeground(new Color(-13421773));
		jTextField6.setBackground(new Color(-1));
		jTextField6.setBounds(81, 292, 396, 41);
		jTabbedPane1_Create.add(jTextField6);

		JLabel idLabel2 = new JLabel();
		idLabel2.setText("아이디");
		idLabel2.setFont(new Font("Dialog.plain", 0, 12));
		idLabel2.setIcon(new ImageIcon(""));
		idLabel2.setForeground(new Color(-13421773));
		idLabel2.setBackground(new Color(-1118482));
		idLabel2.setBounds(12, 20, 57, 47);
		jTabbedPane1_Create.add(idLabel2);

		JLabel pwLabel2 = new JLabel();
		pwLabel2.setText("비밀번호");
		pwLabel2.setFont(new Font("Dialog.plain", 0, 12));
		pwLabel2.setIcon(new ImageIcon(""));
		pwLabel2.setForeground(new Color(-13421773));
		pwLabel2.setBackground(new Color(-1118482));
		pwLabel2.setBounds(10, 88, 50, 26);
		jTabbedPane1_Create.add(pwLabel2);

		JLabel nameLabel = new JLabel();
		nameLabel.setText("이름");
		nameLabel.setFont(new Font("Dialog.plain", 0, 12));
		nameLabel.setIcon(new ImageIcon(""));
		nameLabel.setForeground(new Color(-13421773));
		nameLabel.setBackground(new Color(-1118482));
		nameLabel.setBounds(8, 134, 52, 24);
		jTabbedPane1_Create.add(nameLabel);

		JLabel rnLabel = new JLabel();
		rnLabel.setText("주민등록번호");
		rnLabel.setFont(new Font("Dialog.plain", 0, 12));
		rnLabel.setIcon(new ImageIcon(""));
		rnLabel.setForeground(new Color(-13421773));
		rnLabel.setBackground(new Color(-1118482));
		rnLabel.setBounds(3, 185, 78, 26);
		jTabbedPane1_Create.add(rnLabel);
		
		JLabel addrLabel = new JLabel();
		addrLabel.setText("주소");
		addrLabel.setFont(new Font("Dialog.plain", 0, 12));
		addrLabel.setIcon(new ImageIcon(""));
		addrLabel.setForeground(new Color(-13421773));
		addrLabel.setBackground(new Color(-1118482));
		addrLabel.setBounds(11, 243, 50, 27);
		jTabbedPane1_Create.add(addrLabel);
		
		JLabel balanceLabel = new JLabel();
		balanceLabel.setText("잔고");
		//balanceLabel.setFont(new Font("Dialog.plain", 0, 12));
		balanceLabel.setIcon(new ImageIcon(""));
		balanceLabel.setForeground(new Color(-13421773));
		balanceLabel.setBackground(new Color(-1118482));
		balanceLabel.setBounds(11, 302, 52, 20);
		jTabbedPane1_Create.add(balanceLabel);
		
		JButton okButton= new JButton();
		okButton.setText("확인");
		okButton.setBounds(50, 354, 100,40);
		jTabbedPane1_Create.add(okButton);
		
		JButton saveButton= new JButton();
		saveButton.setText("저장");
		saveButton.setBounds(110, 354, 150,40);
		jTabbedPane1_Create.add(saveButton);
		
		JButton delButton2= new JButton();
		delButton2.setText("삭제");
		delButton2.setBounds(180, 354, 230,40);
		jTabbedPane1_Create.add(delButton2);
		
		final JTextArea infoArea = new JTextArea();
		
		infoArea.setFont(new Font("Dialog.plain", 0, 12));
		infoArea.setForeground(new Color(-13421773));
		infoArea.setBackground(new Color(-1));
		infoArea.setBounds(493, 18, 304, 416);
		infoArea.setEditable(false);
		jTabbedPane1_Create.add(infoArea);
		
		okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
            	infoArea.append("아이디: "+jTextField1.getText()+"\n");
                jTextField1.setText("");
                infoArea.append("비밀번호: "+jTextField2.getText()+"\n");
                jTextField2.setText("");
                infoArea.append("이름: "+jTextField3.getText()+"\n");
                jTextField3.setText("");
                infoArea.append("주민등록번호: "+jTextField4.getText()+"\n");
                jTextField4.setText("");
                infoArea.append("주소: "+jTextField5.getText()+"\n");
                jTextField5.setText("");
                infoArea.append("잔고: "+ jTextField6.getText()+"\n");
                jTextField6.setText("");
                
                //난수생성해서 계좌번호 만들기
                //infoArea.append("계좌번호: "+);
                           
            }
		});
		
		
		saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            
            	try  
                 {  
                 FileWriter fw = new FileWriter("D:/output.txt", true);  
                 BufferedWriter bw = new BufferedWriter(fw);
                 bw.write(infoArea.getText());
                 bw.newLine();
                 bw.close();  
                 }  
                 catch(FileNotFoundException ie2)  
                    {}  
                 catch(IOException ie)  
                    {System.out.println(e+"오류");}  
            	
           }  
            
        });

                           
    
		delButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	 infoArea.setText("");
            }
		});
		
		JLabel idLabel3 = new JLabel();
		idLabel3.setText("아이디");
		idLabel3.setFont(new Font("Dialog.plain", 0, 12));
		idLabel3.setIcon(new ImageIcon(""));
		idLabel3.setForeground(new Color(-13421773));
		idLabel3.setBackground(new Color(-1118482));
		idLabel3.setBounds(31, 34, 59, 25);
		jTabbedPane1_Del.add(idLabel3);
		
		JLabel pwLabel3 = new JLabel();
		pwLabel3.setText("비밀번호");
		pwLabel3.setFont(new Font("Dialog.plain", 0, 12));
		pwLabel3.setIcon(new ImageIcon(""));
		pwLabel3.setForeground(new Color(-13421773));
		pwLabel3.setBackground(new Color(-1118482));
		pwLabel3.setBounds(29, 98, 63, 34);
		jTabbedPane1_Del.add(pwLabel3);
	

		final JTextField delID = new JTextField();
		
		delID.setFont(new Font("Dialog.plain", 0, 12));
		delID.setForeground(new Color(-13421773));
		delID.setBackground(new Color(-1));
		delID.setBounds(98, 23, 495, 52);
		jTabbedPane1_Del.add(delID);

		JPasswordField delpw = new JPasswordField();
		delpw.setFont(new Font("Dialog.plain", 0, 12));
		delpw.setForeground(new Color(-13421773));
		delpw.setBackground(new Color(-1));
		delpw.setBounds(99, 85, 495, 58);
		jTabbedPane1_Del.add(delpw);

		JTextArea jTextArea1 = new JTextArea();
		JScrollPane jTextArea1_scroll = new JScrollPane(jTextArea1);
		//jTextArea1.setText("jTextArea1");
		jTextArea1.setFont(new Font("Dialog.plain", 0, 12));
		jTextArea1.setForeground(new Color(-13421773));
		jTextArea1.setBackground(new Color(-1));
		jTextArea1_scroll.setBounds(26, 167, 570, 265);
		jTabbedPane1_Del.add(jTextArea1_scroll);

		JButton delButton = new JButton();
		delButton.setText("삭제");
		delButton.setFont(new Font("Dialog.plain", 0, 12));
		delButton.setIcon(new ImageIcon(""));
		delButton.setForeground(new Color(-13421773));
		delButton.setBounds(642, 43, 129, 71);
		jTabbedPane1_Del.add(delButton);
		
		delButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	try {
        			File file = new File("D:/output.txt");
        			FileReader fr = new FileReader(file);
        			
        			BufferedReader br = new BufferedReader(fr);
        			
        					
        			br.close();
        		} catch (Exception ex) {
        			ex.printStackTrace();
        		}
            }
		});

		JComboBox jComboBox1 = new JComboBox();
		jComboBox1.addItem("jComboBox1");
		jComboBox1.setFont(new Font("Dialog.plain", 0, 12));
		jComboBox1.setForeground(new Color(-13421773));
		jComboBox1.setBackground(new Color(-1118482));
		jComboBox1.setBounds(13, 12, 185, 422);
		jTabbedPane1_Display.add(jComboBox1);

		JTextField jTextField8 = new JTextField();
		jTextField8.setText("jTextField8");
		jTextField8.setFont(new Font("Dialog.plain", 0, 12));
		jTextField8.setForeground(new Color(-13421773));
		jTextField8.setBackground(new Color(-1));
		jTextField8.setBounds(212, 17, 576, 415);
		jTabbedPane1_Display.add(jTextField8);

	}
}	 



	

