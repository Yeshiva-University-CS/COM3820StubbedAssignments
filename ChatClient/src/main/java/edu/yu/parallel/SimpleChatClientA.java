package edu.yu.parallel;

/** Skeleton client to set up and display a GUI that allows users to enter AND
 * a GUI that displays received text.  When a user enters text into the GUI,
 * currently the GUI is implemented to print that text to the console.
 * Students will need to add code to send this text to the server and to
 * display text that it receives from the server
 *
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SimpleChatClientA
{
  JTextArea incoming;
  JTextField outgoing;
    
  public void go() {
    JFrame frame = new JFrame("Ludicrously Simple Chat Client");
    JPanel mainPanel = new JPanel();
    incoming = new JTextArea(15, 50);
    incoming.setLineWrap(true);
    incoming.setWrapStyleWord(true);
    incoming.setEditable(false);
    JScrollPane qScroller = new JScrollPane(incoming);
    qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

    outgoing = new JTextField(20);
    JButton sendButton = new JButton("Send");
    sendButton.addActionListener(new SendButtonListener());
    mainPanel.add(qScroller);
    mainPanel.add(outgoing);
    mainPanel.add(sendButton);
    frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
    frame.setSize(400, 500);
    frame.setVisible(true);
        
  }
    
  public class SendButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent ev) {
      try {
        System.out.println(outgoing.getText());
      }
      catch (Exception ex) {
        ex.printStackTrace();
      }
      outgoing.setText("");
      outgoing.requestFocus();
    }
  }
    
  public static void main(String[] args) {
    new SimpleChatClientA().go();
  }
}
