package loops;

import java.net.URI;

import javax.swing.JOptionPane;

public class PiDay {
	public static void main(String[] args) {
		String pi = "3.141592653";
		
		for (int i = 0; i < 4; i++) {
			System.out.print(pi.charAt(i));
		}
		for (int j = 4; j < pi.length() ; j++) {
			
		
			String guess = JOptionPane.showInputDialog("What is the next digit");
			String digit1 = Character.toString(pi.charAt(j));
			if (guess.equals(digit1)) {
			System.out.print(guess);	
			JOptionPane.showMessageDialog(null, "Correct");
	}
			else {
				JOptionPane.showMessageDialog(null, "NO PIE FOR UUUUU");
				System.exit(0);
			}
			 
				
			
		}
		playVideo("https://www.youtube.com/watch?v=6TPjRoWm8Ck");
	}
	static void playVideo(String videoURL) {
	     try {
	          URI uri = new URI(videoURL);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}

}

