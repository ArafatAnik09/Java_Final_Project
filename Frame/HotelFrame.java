package Frame;
import Entity.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class HotelFrame extends JFrame implements MouseListener, ActionListener
{
    private Font f1, f2;
    private Color c1, c2, c3, c4, c5;
    private BackgroundPanel panel;
    private JLabel label1, label2, label3, label4, label5, label6, label7, label8, label10;
    private JTextField tf1, tf2;
    private JPasswordField pf1;
    private JButton bt1, bt2, bt3;
    private JRadioButton rb1, rb2, rb3, rb4;
    private ButtonGroup bg1, bg2;
    private JCheckBox cb1, cb2, cb3;
    private JComboBox<String> jb;
    private JTextArea ta, ta2;
    private boolean isNidHidden = true;
    
    public HotelFrame()
    {
        super("Hotel Management System");
        super.setBounds(600, 140, 800, 900);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new BackgroundPanel(new ImageIcon("Picture/hotel.png").getImage());
        panel.setLayout(null);

        // Fonts and Colors
        f1 = new Font("Cambria", Font.BOLD, 28);
        f2 = new Font("Cambria", Font.PLAIN, 18);
        c1 = new Color(255, 255, 255); 
        c2 = new Color(255, 140, 66);  
        c3 = new Color(255, 255, 153, 200); 
        c4 = new Color(64, 196, 162);   
        c5 = new Color(255, 245, 225);  
		
        // Header
        label1 = new JLabel("Hotel Management System");
        label1.setBounds(0, 0, 800, 50);
        label1.setFont(f1);
        label1.setForeground(c1);
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        label1.setOpaque(true);
        label1.setBackground(c2);
        label1.addMouseListener(this);
        panel.add(label1);

        // Booking Panel
        JPanel bookingPanel = new JPanel();
        bookingPanel.setLayout(null);
        bookingPanel.setBounds(150, 55, 500, 550);
        bookingPanel.setBackground(c3);
        bookingPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel bookLabel = new JLabel("Book a Room");
        bookLabel.setBounds(10, 10, 480, 30);
        bookLabel.setFont(f1);
        bookLabel.setForeground(Color.BLACK);
        bookingPanel.add(bookLabel);

        label2 = new JLabel("Guest Name");
        label2.setBounds(10, 50, 120, 30);
        label2.setFont(f2);
        bookingPanel.add(label2);

        tf1 = new JTextField();
        tf1.setBounds(130, 50, 150, 30);
        tf1.setFont(f2);
        bookingPanel.add(tf1);

        label3 = new JLabel("Contact No.");
        label3.setBounds(10, 90, 120, 30);
        label3.setFont(f2);
        bookingPanel.add(label3);

        tf2 = new JTextField();
        tf2.setBounds(130, 90, 150, 30);
        tf2.setFont(f2);
        bookingPanel.add(tf2);

        label4 = new JLabel("NID");
        label4.setBounds(10, 130, 120, 30);
        label4.setFont(f2);
        bookingPanel.add(label4);

        pf1 = new JPasswordField();
        pf1.setBounds(130, 130, 150, 30);
        pf1.setFont(f2);
        pf1.setEchoChar('*');
        pf1.addActionListener(this);
        bookingPanel.add(pf1);

        bt3 = new JButton("Show");
        bt3.setBounds(290, 130, 100, 30);
        bt3.setFont(f2);
        bt3.setBackground(new Color(255, 165, 0));
        bt3.addActionListener(this);
        bookingPanel.add(bt3);

        label8 = new JLabel("Gender");
        label8.setBounds(10, 170, 120, 30);
        label8.setFont(f2);
        bookingPanel.add(label8);

        rb3 = new JRadioButton("Male");
        rb3.setBounds(130, 170, 100, 30);
        rb3.setFont(f2);
        bookingPanel.add(rb3);

        rb4 = new JRadioButton("Female");
        rb4.setBounds(250, 170, 100, 30);
        rb4.setFont(f2);
        bookingPanel.add(rb4);

        bg2 = new ButtonGroup();
        bg2.add(rb3);
        bg2.add(rb4);

        label5 = new JLabel("Room Type");
        label5.setBounds(10, 210, 120, 30);
        label5.setFont(f2);
        bookingPanel.add(label5);

        rb1 = new JRadioButton("Single");
        rb1.setBounds(130, 210, 100, 30);
        rb1.setFont(f2);
        bookingPanel.add(rb1);

        rb2 = new JRadioButton("Double");
        rb2.setBounds(250, 210, 100, 30);
        rb2.setFont(f2);
        bookingPanel.add(rb2);

        bg1 = new ButtonGroup();
        bg1.add(rb1);
        bg1.add(rb2);

        label6 = new JLabel("Services");
        label6.setBounds(10, 250, 120, 30);
        label6.setFont(f2);
        bookingPanel.add(label6);

        cb1 = new JCheckBox("Breakfast");
        cb1.setBounds(130, 250, 180, 30);
        cb1.setFont(f2);
        bookingPanel.add(cb1);

        cb2 = new JCheckBox("Wi-Fi");
        cb2.setBounds(130, 290, 180, 30);
        cb2.setFont(f2);
        bookingPanel.add(cb2);

        cb3 = new JCheckBox("Parking");
        cb3.setBounds(130, 330, 180, 30);
        cb3.setFont(f2);
        bookingPanel.add(cb3);

        label7 = new JLabel("Room View");
        label7.setBounds(10, 370, 150, 30);
        label7.setFont(f2);
        bookingPanel.add(label7);

        String items[] = new String[] {"", "Sea View", "City View", "Garden View"};
        jb = new JComboBox<String>(items);
        jb.setBounds(130, 370, 150, 30);
        jb.setFont(f2);
        bookingPanel.add(jb);

        label10 = new JLabel("Comments");
        label10.setBounds(10, 410, 180, 30);
        label10.setFont(f2);
        label10.setForeground(Color.RED);
        label10.setOpaque(true);
        label10.addMouseListener(this);
        bookingPanel.add(label10);

        ta = new JTextArea();
        ta.setBounds(10, 450, 480, 60);
        ta.setFont(f2);
        bookingPanel.add(ta);

        bt1 = new JButton("Submit");
        bt1.setBounds(10, 520, 125, 35);
        bt1.setFont(f2);
        bt1.setBackground(new Color(255, 165, 0));
        bt1.setForeground(Color.WHITE);
        bt1.addMouseListener(this);
        bt1.addActionListener(this);
        bookingPanel.add(bt1);

        panel.add(bookingPanel);

        // Bookings Section
        JLabel bookingsHeader = new JLabel("Bookings");
        bookingsHeader.setBounds(150, 610, 500, 35);
        bookingsHeader.setFont(f1);
        bookingsHeader.setForeground(Color.WHITE);
        bookingsHeader.setHorizontalAlignment(SwingConstants.CENTER);
        bookingsHeader.setOpaque(true);
        bookingsHeader.setBackground(c4);
        panel.add(bookingsHeader);

        JPanel bookingsPanel = new JPanel();
        bookingsPanel.setLayout(null);
        bookingsPanel.setBounds(150, 645, 500, 200); 
        bookingsPanel.setBackground(c5);
        bookingsPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        ta2 = new JTextArea();
        ta2.setFont(f2);
        ta2.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(ta2); 
        scrollPane.setBounds(0, 0, 500, 180); 
        bookingsPanel.add(scrollPane);

        panel.add(bookingsPanel);

        bt2 = new JButton("Exit");
        bt2.setBounds(660, 700, 115, 35);
        bt2.setFont(f2);
        bt2.setBackground(new Color(255, 165, 0));
        bt2.setForeground(Color.WHITE);
        bt2.addActionListener(this);
        panel.add(bt2);

        super.add(panel);
    }
    
    public void mouseClicked(MouseEvent me) 
    {	
        if(me.getSource() == label1)
        {
            label1.setText("Radisson Blu");
        }
    }
    public void mousePressed(MouseEvent me) 
    { 
        if(me.getSource() == label10)
        {
            label10.setText("Guest Comments");
        }
    }
    public void mouseReleased(MouseEvent me) 
    { 
        if(me.getSource() == label10)
        {
            label10.setText("Comments");
        }
    }
    public void mouseEntered(MouseEvent me) 
    { 
        if(me.getSource() == bt1)
        {
            bt1.setBackground(Color.BLUE);
            bt1.setForeground(Color.WHITE);
        }
    }
    public void mouseExited(MouseEvent me) 
    {
        if(me.getSource() == bt1)
        {
            bt1.setBackground(new Color(255, 165, 0));
            bt1.setForeground(Color.WHITE);
        }
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == bt2)
        {
            System.exit(0);
        }
        if(ae.getSource() == bt3)
        {
            isNidHidden = !isNidHidden;
            pf1.setEchoChar(isNidHidden ? '*' : (char)0); 
        }
        if(ae.getSource() == bt1)
        {
            String s1, s2, s3, s4, s5, s6, s7, s8;
            
            s1 = tf1.getText().trim();
            s2 = tf2.getText().trim();
            s3 = new String(pf1.getPassword()).trim();
            s4 = rb3.isSelected() ? rb3.getText() : (rb4.isSelected() ? rb4.getText() : null);
            s5 = rb1.isSelected() ? rb1.getText() : (rb2.isSelected() ? rb2.getText() : null);
            s6 = (cb1.isSelected() ? cb1.getText() + " " : "") + (cb2.isSelected() ? cb2.getText() + " " : "") + (cb3.isSelected() ? cb3.getText() + " " : "");
            s6 = s6.trim().isEmpty() ? null : s6.trim();
            s7 = jb.getSelectedItem().toString().trim();
            s8 = ta.getText().trim();
            
            
            if (s1.isEmpty() || s2.isEmpty() || s3.isEmpty() || s7.isEmpty() || s8.isEmpty() ||
                s4 == null || s5 == null || s6 == null) {
                JOptionPane.showMessageDialog(this, "Please fill/select all information!");
            } else {
                Guest obj1 = new Guest(s1, s2, s3, s4, s5, s6, s7, s8);
                obj1.insertInfo();
                JOptionPane.showMessageDialog(this, "Booking saved!");
                check();
            }
        }
    }
    
    private void check() {
        try {
            File file = new File("./Data/guestdata.txt");
            if (file.exists()) {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                String line;
                StringBuilder entry = new StringBuilder();
                ta2.setText("");
                while ((line = br.readLine()) != null) {
                    if (line.startsWith("--------------------------------------------------------")) {
                        if (entry.length() > 0) {
                            ta2.append(entry.toString().trim() + "\n\n"); 
                            entry = new StringBuilder();
                        }
                    } else {
                        entry.append(line).append("\n"); 
                    }
                }
                if (entry.length() > 0) {
                    ta2.append(entry.toString().trim() + "\n"); 
                }
                br.close();
            } else {
                ta2.setText("No bookings available.");
            }
        } catch(IOException ioe) {
            ioe.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error reading file!");
        }
    }

    private class BackgroundPanel extends JPanel
    {
        private Image backgroundImage;

        public BackgroundPanel(Image backgroundImage)
        {
            this.backgroundImage = backgroundImage;
        }

        
        protected void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            if (backgroundImage != null)
            {
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }
        }
    }
}