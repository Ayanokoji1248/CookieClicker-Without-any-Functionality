import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Cookie {
    JFrame frame=new JFrame();
    ImageIcon bannerImage=new ImageIcon("banner.png");
    JLabel banner=new JLabel(bannerImage);

    JPanel headingPanel=new JPanel();
    JLabel headingLabel=new JLabel();

    Font headingFont=new Font("Montserrat",Font.BOLD,30);

    ImageIcon cookieImage=new ImageIcon("cookie.png");
    JButton Cookie=new JButton(cookieImage);

    JPanel cookieCountPanel=new JPanel();
    JLabel cookieCountLabel=new JLabel("Total Cookies: ");
    Font normatlFont=new Font("Montserrat", Font.BOLD, 22);

    JPanel cookieCounterPanel=new JPanel();
    int counter=0;
    JLabel cookieCounterLabel=new JLabel(counter+"");
    MouseHandler mHandler=new MouseHandler();

    JButton resetButton=new JButton("RESET");


    public Cookie(){
        frame.setSize(500,550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setTitle("Cookie Clicker");

        banner.setBounds(0,0,500,110);
        banner.setOpaque(true);

        headingPanel.setBounds(160,130,185,40);
        // headingPanel.setBackground(Color.red);
        headingLabel.setText("Click Cookie");
        headingLabel.setFont(headingFont);

        headingPanel.add(headingLabel);

        Cookie.setBounds(150,185,200,200);
        Cookie.addMouseListener(mHandler);

        cookieCountPanel.setBounds(120, 410, 180, 40);
        // cookieCountPanel.setBackground(Color.BLUE);
        cookieCountLabel.setFont(normatlFont);
        cookieCountPanel.add(cookieCountLabel);


        cookieCounterPanel.setBounds(330,410,40,40);
        // cookieCounterPanel.setBackground(Color.CYAN);
        cookieCounterPanel.add(cookieCounterLabel);
        cookieCounterLabel.setFont(normatlFont);

        resetButton.setBounds(200,470,100,30);
        resetButton.setFocusPainted(false);
        resetButton.addMouseListener(mHandler);

        frame.add(resetButton);
        frame.add(cookieCounterPanel);
        frame.add(cookieCountPanel);
        frame.add(Cookie);
        frame.add(headingPanel);
        frame.add(banner);

        frame.setVisible(true);
    }

    public class MouseHandler implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {
            // TODO Auto-generated method stub
            // throw new UnsupportedOperationException("Unimplemented method 'mouseClicked'");
            if (e.getSource() == Cookie){
                counter++;
                cookieCounterLabel.setText(counter+"");
                cookieCounterPanel.add(cookieCounterLabel);
                frame.add(cookieCounterPanel);
                System.out.println("Mouse Clicked");
            }
            if(e.getSource()== resetButton){
                counter = 0;
                cookieCounterLabel.setText(counter+"");
                cookieCounterPanel.add(cookieCounterLabel);
                frame.add(cookieCounterPanel);
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
            // TODO Auto-generated method stub
            // throw new UnsupportedOperationException("Unimplemented method 'mousePressed'");
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            // TODO Auto-generated method stub
            // throw new UnsupportedOperationException("Unimplemented method 'mouseReleased'");
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            // TODO Auto-generated method stub
            // throw new UnsupportedOperationException("Unimplemented method 'mouseEntered'");
        }

        @Override
        public void mouseExited(MouseEvent e) {
            // TODO Auto-generated method stub
            // throw new UnsupportedOperationException("Unimplemented method 'mouseExited'");
        }

    }

}
