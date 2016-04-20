package container;

import javax.swing.JFrame;

public class JFrameSample extends JFrame {
  public JFrameSample() {
    super();
  }

  public void setFrame(String title) {
    this.setTitle(title);
    this.setVisible(true);
  }
}
