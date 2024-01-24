import javax.swing.JOptionPane;

class Input
{
public static void main(String [] args)
{
String number;
number=JOptionPane.showInputDialog("Enter a number");
int x;
x=Integer.parseInt(number);
//JOptionPane.showMessageDialog(null,"The number is:"+x);
JOptionPane.showMessageDialog(null,"The number is:"+x,"Ridwan",JOptionPane.PLAIN_MESSAGE);
}

}
