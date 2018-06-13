package example2;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.Closeable;
import java.util.concurrent.Exchanger;


public class QrCapture extends JFrame implements Closeable {

	private static final long serialVersionUID = 1L;

	private Webcam  webcam = null;
	private BufferedImage image = null;
	private Result result = null;
	private Exchanger<String> exchanger = new Exchanger<String>();

	public QrCapture() {

		super();

		setLayout(new FlowLayout());
		setTitle("Get Username (Aveceena Automed)");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setPreferredSize(new Dimension(700, 550));
		setLocation(300,150);
		setBackground(Color.CYAN);

		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				close();
			}
		});

		webcam = Webcam.getDefault();
		//webcam.setViewSize(WebcamResolution.QVGA.getSize());
		webcam.setViewSize(new Dimension(640, 480));

		webcam.open();

		add(new WebcamPanel(webcam));

		pack();
		setVisible(true);

		final Thread daemon = new Thread(new Runnable() {

			@Override
			public void run() {
				while (isVisible()) {
					read();
				}
			}
		});
		daemon.setDaemon(true);
		daemon.start();
	}

	private static BinaryBitmap toBinaryBitmap(BufferedImage image) {
		return new BinaryBitmap(new HybridBinarizer(new BufferedImageLuminanceSource(image)));
	}

	private void read() {

		if (!webcam.isOpen()) {
			return;
		}
		if ((image = webcam.getImage()) == null) {
			return;
		}

		try {
			result = new MultiFormatReader().decode(toBinaryBitmap(image));
		} catch (NotFoundException e) {
			return; // fall thru, it means there is no QR code in image
		}

		if (result != null) {
			try {
				exchanger.exchange(result.getText());
			} catch (InterruptedException e) {
				return;
			} finally {
				dispose();
			}
		}
	}

	public String getResult() throws InterruptedException {
		return exchanger.exchange(null);
	}

	@Override
	public void close() {
		webcam.close();
	}
}
