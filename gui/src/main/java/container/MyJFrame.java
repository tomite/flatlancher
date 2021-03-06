package container;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.BorderLayout;

public class MyJFrame extends JFrame {
  public MyJFrame() {
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
    JButton btn = new JButton("ボタン");
    this.add(btn, BorderLayout.NORTH);
    this.setVisible(true);
  }
}
