package container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.Color;

public class MyJFrame02 extends JFrame {
  public MyJFrame02() {
    super();
  }

  public void setFrame(String title) {
    this.setTitle(title);
    this.setVisible(true);
  }

  public void setFrame(boolean visible) {
    this.setTitle("タイトル");
    this.setBounds(100, 100, 200, 160);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(visible);
  }

  public void setFrame() {
    this.setTitle("タイトル");
    this.setBounds(100, 100, 200, 160);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
  }

  public void setContainer() {
    this.setFrame(false);
    this.setBounds(100,100,300,250);
    
    JPanel p1 = new JPanel();
    p1.setBackground(Color.BLUE);
    
    JPanel p2 = new JPanel();
    p2.setBackground(Color.ORANGE);
    
    Container contentPane = getContentPane();
    contentPane.add(p1, BorderLayout.NORTH);
    contentPane.add(p2, BorderLayout.SOUTH);
    this.setVisible(true);
  }
}
