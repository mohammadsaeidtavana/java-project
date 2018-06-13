package controler;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.ArrayList;
import java.util.Properties;

/**
 * Created by saeedtavana on 6/25/17.
 */
public class javaMail {
    private Session session = null;

    private javaMail() {
        try {

            String username = "hossein.mst.1374@gmail.com";
            String password = "13741995";
            Properties props = new Properties();
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.port", "587");

            session = Session.getInstance(props, new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(username, password);
                }
            });
        } catch (Exception e) {
        }
    }

    private static javaMail javaMail = new javaMail();

    public static javaMail getJavaMail() {
        return javaMail;
    }


    public void send_mail(String to, String subject, String message) throws MessagingException {
        try {


            Message message1 = new MimeMessage(session);
            message1.setFrom(new InternetAddress("hossein.mst.1374@gmail.com"));
            message1.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message1.setSubject(subject);
            message1.setText(message);
            Transport.send(message1);
        } catch (MessagingException e) {
            throw new MessagingException(e.toString());

        }


    }
}




