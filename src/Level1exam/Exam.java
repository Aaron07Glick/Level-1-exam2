package Level1exam;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Exam implements ActionListener {
	public static void main(String[] args) {
		Exam colors = new Exam();

	}

	JFrame frame = new JFrame("Color Teacher");
	JPanel panel = new JPanel();
	JButton yellow = new JButton();
	JButton red = new JButton();
	JButton blue = new JButton();
	JButton green = new JButton();

	Exam() {
		frame.add(panel);
		frame.setVisible(true);
		panel.add(yellow);
		yellow.setOpaque(true);
		yellow.setBackground(Color.yellow);
		yellow.addActionListener(this);
		panel.add(red);
		red.setOpaque(true);
		red.setBackground(Color.red);
		red.addActionListener(this);
		panel.add(blue);
		blue.setOpaque(true);
		blue.setBackground(Color.blue);
		blue.addActionListener(this);
		panel.add(green);
		green.setOpaque(true);
		green.setBackground(Color.green);
		green.addActionListener(this);
		frame.pack();
	}

	void setBackground(Color backgroundColor) {

	}

	void setOpaque(boolean isOpaque) {

	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (yellow.equals(e.getSource())) {
			// System.out.println("test");
			speak("yellow");
		}
		if (red.equals(e.getSource())) {
			speak("red");
		}
		if (blue.equals(e.getSource())) {
			speak("blue");
		}
		if (green.equals(e.getSource())) {
			speak("green");
		}
	}
}
