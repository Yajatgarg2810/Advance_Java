import java.awt.*;
import javax.swing.*;

public class GridLayoutExample{
      JFrame frameObj;
      GridLayoutExample(){
         frameObj=new JFrame();
         JButton btnc=new JButton("C");
         JButton btnl=new JButton("(");
         JButton btnr=new JButton(")");
         JButton btnplus=new JButton("+");
         JButton btn1=new JButton("1");
         JButton btn2=new JButton("2");
         JButton btn3=new JButton("3");
         JButton btnminus=new JButton("-");
         JButton btn4=new JButton("4");
         JButton btn5=new JButton("5");
         JButton btn6=new JButton("6");
         JButton btndivide=new JButton("/");
         JButton btn7=new JButton("7");
         JButton btn8=new JButton("8");
         JButton btn9=new JButton("9");
         JButton btnmultiply=new JButton("*");
         JButton btnmodulas=new JButton("%");
         JButton btn0=new JButton("0");
         JButton btneq=new JButton("=");
         JButton btnpoint=new JButton(".");

         frameObj.add(btnc);frameObj.add(btnl);frameObj.add(btnr);frameObj.add(btnplus);
         frameObj.add(btn1);frameObj.add(btn2);frameObj.add(btn3);frameObj.add(btnminus);
         frameObj.add(btn4);frameObj.add(btn5);frameObj.add(btn6);frameObj.add(btndivide);
         frameObj.add(btn7);frameObj.add(btn8);frameObj.add(btn9);frameObj.add(btnmultiply);
         frameObj.add(btnmodulas);frameObj.add(btn0);frameObj.add(btneq);frameObj.add(btnpoint);
         frameObj.setLayout(new GridLayout(5,4,10,15));
         frameObj.setSize(200,200);
         frameObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frameObj.setVisible(true);
       }
     
       public static void main(String args[]){
              new GridLayoutExample();
       }
    } 