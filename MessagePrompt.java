import javax.swing.JOptionPane;
public class MessagePrompt{
	public static void main(String []args){
   String name = JOptionPane.showInputDialog(null,"Enter your name","Information",JOptionPane.QUESTION_MESSAGE);

  JOptionPane.showMessageDialog(null, "Your name is: " + name, "Information", JOptionPane.INFORMATION_MESSAGE);
	}
}
