import java.awt.*;
import javax.swing.*;

public class Frame extends JFrame{
    private CardLayout cards = new CardLayout();
    JMenuBar menuBar;
	JMenu menu;
	JMenuItem open, save, logout;


 
    public Frame() {
    	setBounds(94, 20, 854, 551);


        getContentPane().setLayout(cards);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        makeMenuBar(); 
        getContentPane().add("One", new P_One(this));
        getContentPane().add("Two", new P_Two(this));
        getContentPane().add("Three", new P_Three(this));
       
        setVisible(true);
    }
    
    public void makeMenuBar()
	{
		menuBar = new JMenuBar();

		menu = new JMenu("파일");
		open = new JMenuItem("열기");
		save = new JMenuItem("저장");
		logout= new JMenuItem("로그아웃");
		menu.add(open);
		menu.add(save);
		menu.add(logout);
		menuBar.add(menu_0);

		setJMenuBar(menuBar);
	}
     
    public void changePanel() {
    	cards.next(this.getContentPane());
    }
    public void changePanel2() {
    	cards.last(this.getContentPane());
    }
       
    public static void main(String args[]){
        new Frame();
   }
   
    


}