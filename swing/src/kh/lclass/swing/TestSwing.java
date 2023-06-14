package kh.lclass.swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TestSwing extends JFrame{
	
	public TestSwing() {
		setTitle("Hello Window 프레임");
		setDefaultCloseOperation(EXIT_ON_CLOSE);	// x 버튼 눌러서 resource 정리하고 창 닫기
		
		Container contentPane = getContentPane();
		// contentPane.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));
	/*	contentPane.setLayout(new BorderLayout(20, 30));
		contentPane.add(new JButton("OK"), BorderLayout.NORTH);
		contentPane.add(new JButton("Cancel"), BorderLayout.WEST);
		contentPane.add(new JButton("Ignore"), BorderLayout.EAST);
		contentPane.add(new JButton("Ignore"), BorderLayout.CENTER); */
		
		// event 등록 = Action 리스너 달기
		
		contentPane.add(new JButton("저장"));



		
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		TestSwing frame = new TestSwing();
	}
	
class	MyActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("이건 언제 호출되지???");
		System.out.println(e);
		Object source = e.getSource();
		if(source instanceof JButton) {
			System.out.println("button 눌렀네요");
			if(((JButton)source).getText().equals("저장"))
			((JButton)source).setText("Save");
		}else if(source instanceof JTextField) {
			System.out.println("text 필드에서 enter key를 눌렀네요.");
		}
	}
	
}
}
