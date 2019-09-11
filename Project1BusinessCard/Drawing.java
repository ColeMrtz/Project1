import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
/***************************************************************
 * Drawing class - drawing example
 * @author -
 * @version -
 **************************************************************/
public class Drawing extends JPanel{
 public static void main(String[] a) {
 JFrame f = new JFrame();
 f.setContentPane(new Drawing());
 f.setSize(517, 340);
 f.setVisible(true);
 }
 public void paintComponent(Graphics g){
 int x, y, x2, y2, x3 , y3;
 x = 20;
 y = 30;
 x2 = 0;
 y2 = 0;
 x3 = 23;
 y3 = 30;
 super.paintComponent(g);
 setBackground(Color.LIGHT_GRAY);
 Font myFont1 = new Font(Font.SERIF, Font.BOLD, 24);
 g.setFont(myFont1);
 g.setColor(Color.BLACK);
 g.drawString("Cole Mertz", x3 + 285, y3 + 190);
 Font myFont2 = new Font(Font.SANS_SERIF, Font.PLAIN, 14);
 g.setFont(myFont2);
 g.drawString("Sub-Atomic Objects", x3 + 282, y3 + 210);
 g.drawString("(616) 444-0021", x3 + 292, y3 + 225);
 g.drawLine(x3 + 281, y3 + 195, x3 + 406, y3 + 195);
 g.drawRect(1, 1, 498, 298);
 g.drawRect(0, 0, 500, 300);
 g.drawRect(2, 2, 496, 296);
 g.drawRect(3, 3, 494, 294);
 g.drawRect(4, 4, 492, 292);
  g.setColor(Color.DARK_GRAY);
 g.fillOval(x + 305, y + 60, 80, 80);
 g.setColor(Color.WHITE);
 g.fillOval(x + 320, y + 75, 50, 50);
 g.setColor(Color.RED);
 g.fillOval(x + 339, y + 96, 10, 10);
 g.drawOval(x + 276, y + 87, 135, 26);
 g.drawOval(x + 275, y + 88, 135, 25);
 g.drawOval(x + 277, y + 88, 135, 24);
 g.drawOval(x + 278, y + 88, 135, 23);
 g.setColor(Color.BLACK);
 g.drawRect(x2 + 49, y2 + 74, 151, 151);
 g.drawRect(x2 + 48, y2 + 73, 153, 153);
 g.drawRect(x2 + 47, y2 + 72, 155, 155);
 BufferedImage photo = null;
try {
File file = new File("MyImage.jpg");
photo = ImageIO.read(file);
}
catch (IOException e){
g.drawString("Problem reading the file", 100, 100);
}
g.drawImage(photo, x2 + 50, y2 + 75, 150, 150, null);
 }
}