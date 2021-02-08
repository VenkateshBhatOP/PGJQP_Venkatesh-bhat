import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Student extends JFrame implements ActionListener {
	JLabel l1, l2, l3;
	JTextField tf1, tf2, tf3;
	JPanel p1, p2;
	JButton b1, b2, b3;

	public Student() {
		setTitle("Registration Form");

		p1 = new JPanel();
		p1.setLayout(new GridLayout(4, 2));
		add(p1, BorderLayout.NORTH);

		p2 = new JPanel();
		p2.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		add(p2, BorderLayout.SOUTH);

		l1 = new JLabel("Enter Student ID");
		p1.add(l1);
		tf1 = new JTextField(100);
		p1.add(tf1);

		l2 = new JLabel("Enter Student Name");
		p1.add(l2);
		tf2 = new JTextField(100);
		p1.add(tf2);

		l3 = new JLabel("Enter Student Course");
		p1.add(l3);
		tf3 = new JTextField(100);
		p1.add(tf3);

		b1 = new JButton("Register");
		b1.addActionListener(this);
		p2.add(b1);

		b2 = new JButton("Update");
		b2.addActionListener(this);
		p2.add(b2);

		b3 = new JButton("Delete");
		b3.addActionListener(this);
		p2.add(b3);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 300);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try {
			Connection con = DriverManager.getConnection(
					"jdbc:sqlserver://DESKTOP-K459BPE;databaseName=PGJQP_S210218;user=sa;password=niit@123");
			JButton bt = (JButton) e.getSource();
			if (bt.getText().equals("Register")) {
				PreparedStatement statement = con.prepareStatement("insert into student values(?,?,?)");
				statement.setInt(1, Integer.parseInt(tf1.getText()));
				statement.setString(2, tf2.getText());
				statement.setString(3, tf3.getText());
				int result;
				result = statement.executeUpdate();
				if (result > 0)
					JOptionPane.showMessageDialog(rootPane, "Registered");
				else
					JOptionPane.showMessageDialog(rootPane, "Not Registered");

			} else if (bt.getText().equals("Update")) {
				PreparedStatement statement = con.prepareCall("update student set name=? where id=?");
				statement.setString(1, tf2.getText());
				statement.setInt(2, Integer.parseInt(tf1.getText()));
				int result;
				result = statement.executeUpdate();
				if (result > 0)
					JOptionPane.showMessageDialog(rootPane, "Updated");
				else
					JOptionPane.showMessageDialog(rootPane, "Not Updated");

			} else if (bt.getText().equals("Delete")) {
				PreparedStatement statement = con.prepareCall("delete from student where id=?");
				statement.setInt(1, Integer.parseInt(tf1.getText()));
				int result;
				result = statement.executeUpdate();
				if (result > 0)
					JOptionPane.showMessageDialog(rootPane, "Deleted");
				else
					JOptionPane.showMessageDialog(rootPane, "Not Deleted");
			}

		} catch (Exception e1) {
			System.out.println(e1.getMessage());
		}

	}
}

public class Register {
	public static void main(String[] args) {
		Student stud = new Student();
		stud.setVisible(true);

	}

}
