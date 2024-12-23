package hust.soict.ite6.swing;

import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  

public class SwingAccumulator extends JFrame {  // tạo một cửa sổ ứng dụng đồ họa
   private JTextField tfInput;  
   private JTextField tfOutput;  
   private int sum = 0; // Accumulated sum, init to 0  

   // Constructor to setup the GUI components and event handlers  
   public SwingAccumulator() {  
      Container cp = getContentPane();  //Lấy nội dung của JFrame
      cp.setLayout(new GridLayout(2, 2));  

      cp.add(new JLabel("Enter an Integer: "));  

      tfInput = new JTextField(10);  
      cp.add(tfInput);  
      tfInput.addActionListener(new TFInputListener());  

      cp.add(new JLabel("The Accumulated Sum is: "));  

      tfOutput = new JTextField(10);  
      tfOutput.setEditable(false);  
      cp.add(tfOutput);  

      setTitle("Swing Accumulator");  
      setSize(350, 120);  
      setVisible(true);  
   }  

   public static void main(String[] args) {  
      new SwingAccumulator();  
   }  

   private class TFInputListener implements ActionListener {  
      @Override  
      public void actionPerformed(ActionEvent evt) {  
         int numberIn = Integer.parseInt(tfInput.getText());  
         sum += numberIn;  
         tfInput.setText("");  
         tfOutput.setText(sum + "");  
      }  
   }  
}

