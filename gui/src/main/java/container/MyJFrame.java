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
}
