import java.awt.*;
import javax.swing.*;

public class BorderLayoutExample{
      JFrame jframe;
      BorderLayoutExample(){
         jframe=new JFrame();
         JButton btn1=new JButton("NORTH");
         JButton btn2=new JButton("SOUTH");
         JButton btn3=new JButton("EAST");
         JButton btn4=new JButton("WEST");
         JButton btn5=new JButton("CENTER");

         jframe.setLayout(new BorderLayout(20,15));
         jframe.add(btn1, BorderLayout.NORTH);
         jframe.add(btn2, BorderLayout.SOUTH);
         jframe.add(btn3, BorderLayout.EAST);
         jframe.add(btn4, BorderLayout.WEST);
         jframe.add(btn5, BorderLayout.CENTER);

         jframe.setSize(300,300);
         jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         jframe.setVisible(true);
       }
     
       public static void main(String args[]){
              new BorderLayoutExample();
       }
    }