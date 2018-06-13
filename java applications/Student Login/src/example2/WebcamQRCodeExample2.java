package example2;

import model.TO.Student;
import model.TO.bl.StudentBL;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


@SuppressWarnings("serial")
public class WebcamQRCodeExample2 extends JFrame {

	public WebcamQRCodeExample2() {

		setTitle("Student Attendance");
		setPreferredSize(new Dimension(600, 150));
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel jLabel=new JLabel("Course :");
		JLabel right=new JLabel("<html><br><br><br><br>All @Right Reserved for  Saeed&Tohid</html>");
		right.setHorizontalAlignment(SwingConstants.CENTER);

		String[] bookTitles = new String[] {"Medical informatics 6-9 thursday", "Biomechanics 10-12 monday",
				"Physiology 4-6 wednesday"};

		JComboBox<String> bookList = new JComboBox<>(bookTitles);
		add(jLabel);
		add(bookList);



		add(new JButton(new AbstractAction("Add attendance") {


			@Override
			public void actionPerformed(ActionEvent e) {
				final Thread thread = new Thread(new Runnable() {

					@Override
					public void run() {
						try (QrCapture qr = new QrCapture()) {


							Date date = new Date();
							DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd ");
							DateFormat dateFormatM = new SimpleDateFormat(" HH:mm:ss");
							String date1=dateFormat.format(date);
							String time1=dateFormatM.format(date);
							Student student=new Student();
							student.setDate(date1);
							student.setTime(time1);
							String selectedBook = (String) bookList.getSelectedItem();
							student.setCourse(selectedBook);
							student.setName(qr.getResult());

							StudentBL studentBL=StudentBL.getInstance();
							studentBL.addAttendance(student);
							JOptionPane.showMessageDialog(
									null,
									"New Attendance for course :"+selectedBook+" has been added.",
									"Information ",
									JOptionPane.INFORMATION_MESSAGE);

						} catch (InterruptedException ex) {
							ex.printStackTrace();
						} catch (Exception e1) {
							e1.printStackTrace();
						}
					};
				});
				thread.setDaemon(true);
				thread.start();
			}
		}));
		add(right);
		pack();
		setVisible(true);
	}

	private void showMessage(String text) {
		JOptionPane.showMessageDialog(null, text);
	}


}
