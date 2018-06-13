package example2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;


@SuppressWarnings("serial")
public class WebcamQRCodeExample2 extends JFrame {

	public WebcamQRCodeExample2() {

		setTitle("Get Username by QR code");
		setPreferredSize(new Dimension(300, 100));
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		add(new JButton(new AbstractAction("Get Username") {


			@Override
			public void actionPerformed(ActionEvent e) {
				final Thread thread = new Thread(new Runnable() {

					@Override
					public void run() {
						try (QrCapture qr = new QrCapture()) {
							showMessage( qr.getResult() );
						} catch (InterruptedException ex) {
							ex.printStackTrace();
						}
					};
				});
				thread.setDaemon(true);
				thread.start();
			}
		}));

		pack();
		setVisible(true);
	}

	private void showMessage(String text) {
		JOptionPane.showMessageDialog(null, text);
	}


}
