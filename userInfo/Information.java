package userInfo;

import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import userScore.Score;
public class Information extends JFrame implements ActionListener {
    
    private JTextField tfPlayer1,tfPlayer2,tfPlayer3,tfPlayer4;
    private JButton btEnter,btEnter1;
    private JPanel p1, p2, p3, p4, addPlayer1Team1, addPlayer1Team2, addPlayer2Team1, addPlayer2Team2, buttonSize1, buttonSize2;

    private String player1nameLabel;
    private String player2nameLabel;

    Score GM = new Score();
  
    public Information() {

        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();

        //////////
        JLabel Information = new JLabel("Rock-Paper-Scissors-Lizard-Spock"); 
        p1.add(Information);
        Information.setFont(new Font("Verdana",Font.BOLD,15));
        p1.setBackground(Color.orange);
        
        /////////
        JLabel Team = new JLabel("Team 1"); 
        Team.setHorizontalAlignment(SwingConstants.CENTER);
        JLabel Player = new JLabel("Enter player names:");
        Player.setHorizontalAlignment(SwingConstants.CENTER);
        JLabel Team2 = new JLabel("Team 2"); 
        Team2.setHorizontalAlignment(SwingConstants.CENTER);
        JLabel Player2 = new JLabel("Enter player names:");
        Player2.setHorizontalAlignment(SwingConstants.CENTER);
       
        ////////
        p2.setLayout(new GridLayout(5,3));
        p2.add(new JLabel(""));p2.add(Team); p2.add(new JLabel(""));
        p2.add(new JLabel(""));p2.add(Player); p2.add(new JLabel(""));
        
        ////////
        JLabel player1team1 = new JLabel("Player 1 :");
        player1team1.setFont(new Font("Verdana",Font.BOLD,13));
        p2.add(player1team1);
        tfPlayer1= new JTextField(10);
        tfPlayer1.setPreferredSize(new Dimension(10,60));
        tfPlayer1.setFont(new Font("Verdana",Font.BOLD,11));
        addPlayer1Team1 = new JPanel();
        addPlayer1Team1.add(tfPlayer1);
        p2.add(addPlayer1Team1);
        p2.add(new JLabel(""));
        
        ///////////
        JLabel player2team1= new JLabel("Player 2 :");
        player2team1.setFont(new Font("Verdana",Font.BOLD,13));
        p2.add(player2team1);
        tfPlayer2 = new JTextField(10);
        tfPlayer2.setPreferredSize(new Dimension(10,60));
        tfPlayer2.setFont(new Font("Verdana",Font.BOLD,11));
        addPlayer2Team1 = new JPanel();
        addPlayer2Team1.add(tfPlayer2);
        p2.add(addPlayer2Team1);
        p2.add(new JLabel(""));      
        
        ///////////
        p3.setLayout(new GridLayout(5,3));
        p3.add(new JLabel("")); p3.add(Team2);p3.add(new JLabel(""));
        p3.add(new JLabel(""));p3.add(Player2);p3.add(new JLabel(""));
        JLabel player1team2 = new JLabel("Player 1 :");
        player1team2.setFont(new Font("Verdana",Font.BOLD,13));
        p3.add(player1team2);
        
        tfPlayer3 = new JTextField(10);
        tfPlayer3.setPreferredSize(new Dimension(10,60));
        tfPlayer3.setFont(new Font("Verdana",Font.BOLD,11));
        addPlayer1Team2 = new JPanel();
        addPlayer1Team2.add(tfPlayer3);
        p3.add(addPlayer1Team2);
        p3.add(new JLabel(""));
        
        JLabel player2team2 = new JLabel("Player 2 :");
        p3.add(player2team2);
        player2team2.setFont(new Font("Verdana",Font.BOLD,13));
        tfPlayer4 = new JTextField(10);
        tfPlayer4.setPreferredSize(new Dimension(10,60));
        tfPlayer4.setFont(new Font("Verdana",Font.BOLD,11));
        addPlayer2Team2 = new JPanel();
        addPlayer2Team2.add(tfPlayer4);
        p3.add(addPlayer2Team2);
        p3.add(new JLabel(""));
        
        p4.setLayout(new GridLayout(3,6));
        p4.add(new JLabel(""));
        btEnter = new JButton("Enter");
        btEnter.setPreferredSize(new Dimension(100,20));
        btEnter1 = new JButton("Enter");
        btEnter1.setPreferredSize(new Dimension(100,20));
        buttonSize1 = new JPanel();
        buttonSize2 = new JPanel();
        buttonSize1.add(btEnter);
        buttonSize2.add(btEnter1);
        
        
        p4.add(new JLabel(""));p4.add(buttonSize1);p4.add(buttonSize2);p4.add(new JLabel(""));

        setLayout(new BorderLayout());
        add(p1,BorderLayout.NORTH);
        add(p2,BorderLayout.WEST);
        add(p3,BorderLayout.EAST);
        add(p4,BorderLayout.SOUTH);

        btEnter.addActionListener(this);
        btEnter1.addActionListener(this);
    }

    public JPanel getInfoP2() { return p2; }
    public JPanel getInfoP3() { return p3; }
    public JPanel getInfoP4() { return p4; }
    public JPanel getInfoAddPlayer1Team1() { return addPlayer1Team1; }
    public JPanel getInfoAddPlayer1Team2() { return addPlayer1Team2; }
    public JPanel getInfoAddPlayer2Team1() { return addPlayer2Team1; }
    public JPanel getInfoAddPlayer2Team2() { return addPlayer2Team2; }
    public JPanel getInfoButtonSize1() { return buttonSize1; };
    public JPanel getInfoButtonSize2() { return buttonSize2; };

    // call Score.java
    public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btEnter /*|| e.getSource() == btEnter1*/) {
			
            try {

                player1nameLabel = tfPlayer1.getText();
                player2nameLabel = tfPlayer2.getText();

                GM.setBounds(100,100,200,500);
                GM.setTitle("Assignment");
                GM.setSize(900,600);
                GM.setVisible(true);
                GM.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
                GM.getScoreP2().setBackground(p2.getBackground()); GM.getScoreP3().setBackground(p2.getBackground()); 
                GM.getScoreP4().setBackground(p2.getBackground()); GM.getScoreP5().setBackground(p2.getBackground());
                GM.getButtonPanel().setBackground(p2.getBackground()); GM.getButtonPanel2().setBackground(p2.getBackground());
    
                GM.getNameLabel().setText(player1nameLabel);
                GM.getNameLabel2().setText(player2nameLabel);
                GM.getTablePlayerName().setValueAt("Player 1: "+player1nameLabel, 0, 0);
                GM.getTablePlayerName().setValueAt("Player 2: "+player2nameLabel, 1, 0);

            } catch(Exception err) {
                 
                err.printStackTrace();
            }  
        }
	}  
}

