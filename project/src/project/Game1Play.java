package project;

import demogame.GamePlay;
import src.GameApplication.SnakeAndLadder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;


public class Game1Play{
    public static JFrame frame1;

    Timer time;

    JFrame frame2;

    static Frame e1;

    Game1Play() {

        displayScreen();

        GameSelectPage1();

//        this.setVisible(true);
    }


    private void displayScreen() {
        //front window of the game with the functionalities of the window
        JWindow w = new JWindow(frame1);

        w.setBounds(0, 0, 325, 600);

        w.setBackground(new Color(0, 128, 255));

        w.setLocationRelativeTo(null);

        w.setVisible(true);

        JPanel panel = new JPanel();

        JLabel LabelText1 = new JLabel("Created By : Mitul Prajapati");

        panel.setBackground(new Color(187, 0, 255));

        panel.add(LabelText1);

        w.add(panel);

        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        JProgressBar pb = new JProgressBar(0, 100);

        pb.setBackground(Color.BLACK);

        pb.setForeground(new Color(243, 231, 4));

        pb.setStringPainted(true);

        w.add(pb, BorderLayout.PAGE_END);

        w.setVisible(true);

        w.revalidate();

        time = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int x = pb.getValue();

                if (x == 100) {

                    w.dispose();

                    frame1.setVisible(true);

                    time.stop();

                } else {

                    pb.setValue(x + 5);

                }
            }
        });

        time.start();
    }

    private void GameSelectPage1() {

        frame1 = new JFrame("Game Selection");

        frame1.setSize(325, 600);

        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        frame1.setLocationRelativeTo(null);

//        frame1.setLayout(null);
        JPanel panel4 = new JPanel();

        panel4.setLayout(new GridLayout(5,1));

        panel4.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel Extra  = new JLabel();

        JLabel Extra2  = new JLabel();

        JButton Game1 = new JButton("Game : 1");

        Game1.setBackground(new Color(0, 128, 255));

        Game1.setText("<html>"+Game1.getText()+"<br>"+"Game Title : The Ping Pong Game"+"</html>");

        Game1.setFont(new Font("MV Boli", Font.BOLD, 17));

//        Game1.setBounds(20, 20, 80, 30);
        Game1.setCursor(new Cursor(Cursor.HAND_CURSOR));

        JButton Game2 = new JButton("Game : 2");

        Game2.setText("<html>"+Game2.getText()+"<br>"+"Game Title : The Brick Breaker Game"+"</html>");

        Game2.setBackground(new Color(0, 128, 255));

        Game2.setFont(new Font("MV Boli", Font.BOLD, 14));

//        Game2.setBounds(110, 20, 80, 30);
        Game2.setCursor(new Cursor(Cursor.HAND_CURSOR));

        JButton Game3 = new JButton("Game : 3");

        Game3.setText("<html>"+Game3.getText()+"<br>"+"Game Title : The Snake & Ladders Game"+"</html>");

        Game3.setBackground(new Color(0, 128, 255));

        Game3.setFont(new Font("MV Boli", Font.BOLD, 14));

//        Game3.setBounds(200, 20, 80, 30);
        Game3.setCursor(new Cursor(Cursor.HAND_CURSOR));

        JButton Exit = new JButton("Exit");

        Exit.setCursor(new Cursor(Cursor.HAND_CURSOR));

        Exit.setBackground(new Color(252, 134, 0));

        Exit.setFont(new Font("MV Boli", Font.BOLD, 25));

//        Exit.setBounds(110, 210, 80, 30);
        panel4.setBackground(new Color(0, 243, 39));

        panel4.add(Game1,0);

        panel4.add(Extra,1);

        panel4.add(Game2,2);

        panel4.add(Extra2,3);

        panel4.add(Game3,4);


        Game1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frame1.dispose();

                Game1SetUp();
            }
        });
        Game2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frame1.dispose();

                Game2SetUp();
            }
        });
        Game3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frame1.dispose();

                Game3SetUp();
            }
        });
        Exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frame1.dispose();

                LastExit();
            }
        });
        frame1.add(panel4);

        frame1.add(Exit,BorderLayout.PAGE_END);

        frame1.revalidate();

        frame1.validate();
    }

    //for game 1 setup and do changes according to this
    public void Game1SetUp() {
        Game1Play();
    }

    public void Game2SetUp() {
        Game2Plays();
    }


    public void Game3SetUp() {
        Game3Play();
    }

    public void Game1Play() {

        e1 = new Frame(0,0,1100,600);

        e1.setBounds(200,150,1100,638);

        e1.setVisible(true);
    }


    public void Game2Plays() {

        JFrame f = new JFrame();

        f.setTitle("Brick Breaker");

        f.setSize(700, 600);

        f.setLocationRelativeTo(null);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);

        f.setResizable(false);

        Button Exit = new Button("HOME");

        Exit.setBounds(10, 10, 70, 30);

        Exit.setBackground(Color.green);

        Exit.setFont(new Font("MV Boli", Font.BOLD, 11));

        Exit.setCursor(new Cursor(Cursor.HAND_CURSOR));

        Exit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                f.dispose();

                Game1Play.frame1.setVisible(true);
            }
        });

        f.add(Exit);

        Button pause = new Button("RESET");

        pause.setBounds(610, 10, 65, 30);

        pause.setBackground(Color.green);

        pause.setCursor(new Cursor(Cursor.HAND_CURSOR));

        pause.setFont(new Font("MV Boli", Font.BOLD, 11));

        pause.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                f.dispose();

               Game2Plays();
            }
        });

        f.add(pause);

        GamePlay gamePlay = new GamePlay();

        f.add(gamePlay);

        f.revalidate();

        f.validate();
    }


    public void Game3Play() {
        EventQueue.invokeLater(new Runnable() {

            public void run() {

                try {
                    SnakeAndLadder frame = new SnakeAndLadder();

                    frame.setInitial();

                    // frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public void LastExit(){
        JWindow w = new JWindow(frame1);

        w.setBounds(0, 0, 325, 600);

        w.setBackground(new Color(0, 128, 255));

        w.setLocationRelativeTo(null);

        w.setVisible(true);

        JPanel panel = new JPanel();

        JLabel LabelText1 = new JLabel("Thank You For Playing....");

        panel.setBackground(new Color(187, 0, 255));

        panel.add(LabelText1);

        w.add(panel);

        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        JProgressBar pb = new JProgressBar(0, 100);

        pb.setBackground(Color.BLACK);

        pb.setForeground(new Color(243, 231, 4));

        pb.setStringPainted(true);

        w.add(pb, BorderLayout.PAGE_END);

        w.setVisible(true);

        w.revalidate();

        time = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int x = pb.getValue();

                if (x == 100) {

                    System.exit(0);

                } else {

                    pb.setValue(x + 10);
                }
            }
        });

        time.start();
    }

}