package gui.sample;

import javax.swing.JFrame;

class JFrameSample {
  public static void main(String[] args) {
    JFrame frame = new JFrame("タイトル");
    frame.setBounds(100,100,200,160);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
