package container;

import javax.swing.JFrame;

public class MyJFrame extends JFrame {
  public MyJFrame() {
    super();
  }

  public void setFrame(String title) {
    this.setTitle(title);
    this.setVisible(true);
  }

  public void setFrame() {
    this.setTitle("タイトル");
    this.setBounds(200, 200, 200, 160);
    this.setLocationRelativeTo(null);
    this.setVisible(true);
  }
}
