package userScore;

import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Score extends JFrame implements ActionListener {
    
    private JPanel p1, p2, p3, p4, p5, button, button2;
    private JLabel empty, rounds, picture1, picture2, player1name, player2name;
    private JButton boom1,boom2;
    private ImageIcon image[] = { new ImageIcon(new ImageIcon("userScore/image/scissors.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT)), new ImageIcon(new ImageIcon("userScore/image/paper.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT)),
                                  new ImageIcon(new ImageIcon("userScore/image/rock.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT)), new ImageIcon(new ImageIcon("userScore/image/spock.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT)),
                                  new ImageIcon(new ImageIcon("image/lizard.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT)) };
    private JTable table;
    private String score[] = {"0","1"};

    public Score () {

        // panel 1
        p1 = new JPanel(); //create panel for title
        empty = new JLabel("");
        JLabel gametitle = new JLabel("Rock-Paper-Scissors-Lizard-Spock"); //Title
        
        p1.add(gametitle);
        gametitle.setFont(new Font("Verdana",Font.BOLD,15));
        p1.setBackground(Color.orange); //set background for the title to orange
   
        // panel 2 /
        p2 = new JPanel(); //create panel for rounds text
        rounds = new JLabel("Round 1"); // text for rounds
        rounds.setHorizontalAlignment(SwingConstants.CENTER);
        rounds.setFont(new Font("Verdana",Font.BOLD,20));
        p2.add(rounds);

        // panel 3 /
        p3 = new JPanel();//create panel for player 1 name,button and image
        player1name = new JLabel ("Player 1");//Name for player 1
        player1name.setHorizontalAlignment(SwingConstants.CENTER);
        player1name.setFont(new Font("Verdana",Font.BOLD,15));
        p3.add(empty); p3.add(player1name);
        picture1 = new JLabel(image[0]); //Image for player 1
        p3.add(picture1);
        
        button = new JPanel();
        boom1 = new JButton("BOOM!"); //Boom Button for player 1
        boom1.setLayout(new FlowLayout());
        boom1.setPreferredSize(new Dimension(80,30));
        p3.setLayout(new GridLayout(2,2,1,1));
        button.add(boom1);
        p3.add(button);
        
        // panel 4
        p4 = new JPanel(); //create panel for player 2 name,button and image
        picture2 = new JLabel(image[1]);//Image for player 2
        picture2.setHorizontalAlignment(SwingConstants.CENTER);
        picture2.setBounds(400,250,400,200);
        p4.add(empty); p4.add(empty); p4.add(picture2);
        
        player2name = new JLabel ("Player 2");// Name for player2
        player2name.setHorizontalAlignment(SwingConstants.CENTER);
        player2name.setFont(new Font("Verdana",Font.BOLD,15));
        p4.add(player2name);
        
        button2 = new JPanel();
        boom2 = new JButton("BOOM!"); //boom button for player 2
        boom2.setLayout(new FlowLayout());
        boom2.setPreferredSize(new Dimension(80,30));
        button2.add(boom2);         //adding button for player 2 in Button2 JPanel
        p4.add(empty); p4.add(button2);
        p4.setLayout(new GridLayout(2,2,1,1));
        
        // panel 5
        p5 = new JPanel();
        //p5.setBackground(Color.RED);
        JLabel scissors = new JLabel(image[0]); //scissors image
        JLabel paper = new JLabel (image[1]); // paper image
        JLabel rock = new JLabel (image[2]); // rock image
        JLabel spock = new JLabel (image[3]);// spock image
        JLabel lizard = new JLabel (image[4]);// lizard image
        
        JPanel tablepanel = new JPanel();
        String [][] playername  = { {"Team 1: Syed",""+score[1],""+score[1],""+score[1],""+score[1]},{"Team 2: Elton",""+score[0],""+score[0],""+score[0],""+score[0]} };//create row for table
        String [] column = {"Player","Round 1","Round 2","Round 3","Total"}; //create column for table
        table = new JTable(playername,column); //set the table with row and column variables
        table.setRowHeight(60);
        JScrollPane sp = new JScrollPane(table);
        sp.setPreferredSize(new Dimension(600,143));
        tablepanel.add(sp);
        sp.setBounds(21,2,2,2);
        p5.add(tablepanel); //work in progress 
        
        setLayout(new BorderLayout());
        add(p1,BorderLayout.NORTH);
        add(p2,BorderLayout.CENTER);
        add(p3,BorderLayout.WEST);
        add(p4,BorderLayout.EAST);
        add(p5,BorderLayout.SOUTH);
    }

    public JPanel getScoreP2() { return p2; }
    public JPanel getScoreP3() { return p3; }
    public JPanel getScoreP4() { return p4; }
    public JPanel getScoreP5() { return p5; }
    public JPanel getButtonPanel() { return button; }
    public JPanel getButtonPanel2() { return button2; }

    public JLabel getNameLabel() { return player1name; }
    public JLabel getNameLabel2() { return player2name; }
}
