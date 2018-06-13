/*****************************************************************
 * Copyright (c) 1999-2001 Simplewire, Inc. All Rights Reserved.
 *
 * Simplewire grants you ("Licensee") a non-exclusive, royalty
 * free, license to use, modify and redistribute this software
 * in source and binary code form, provided that i) Licensee
 * does not utilize the software in a manner which is
 * disparaging to Simplewire.
 *
 * This software is provided "AS IS," without a warranty of any
 * kind. ALL EXPRESS OR IMPLIED CONDITIONS, REPRESENTATIONS AND
 * WARRANTIES, INCLUDING ANY IMPLIED WARRANTY OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE OR NON-INFRINGEMENT, ARE
 * HEREBY EXCLUDED. SIMPLEWIRE AND ITS LICENSORS SHALL NOT BE
 * LIABLE FOR ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT OF
 * USING, MODIFYING OR DISTRIBUTING THE SOFTWARE OR ITS
 * DERIVATIVES. IN NO EVENT WILL SIMPLEWIRE OR ITS LICENSORS BE
 * LIABLE FOR ANY LOST REVENUE, PROFIT OR DATA, OR FOR DIRECT,
 * INDIRECT, SPECIAL, CONSEQUENTIAL, INCIDENTAL OR PUNITIVE
 * DAMAGES, HOWEVER CAUSED AND REGARDLESS OF THE THEORY OF
 * LIABILITY, ARISING OUT OF THE USE OF OR INABILITY TO USE
 * SOFTWARE, EVEN IF SIMPLEWIRE HAS BEEN ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGES.
 *****************************************************************/

/*****************************************************************
 * Shows how to receive a wireless message containing text in Java.
 *
 * Please visit www.simplewire.com for sales and support.
 *
 * @author Simplewire, Inc.
 * @version 2.6.1
 * @since  jdk1.2
 *****************************************************************/

import com.simplewire.sms.*;

public class recv_text
{
	public static void main(String[] args) throws Exception
	{
		SMS sms = new SMS();

		System.out.println("Receiving message from Simplewire...");

		// Simplewire will forward XML to your web server.
		// You will pass this XML to the parse function -- the
		// string below is just an example of the XML that
		// Simplewire could pass back to you.
		sms.xmlParseEx("<?xml version=\"1.0\" ?>\n<request version=\"2.0\" protocol=\"paging\" type=\"sendpage\">\n<subscriber id=\"123-456-789-12345\"/>\n<page pin=\"+11005101234\" callback=\"+11005551212\" text=\"Hello World From Simplewire!\"/>\n</request>");

		// Message Settings
		System.out.println("message pin = " + sms.getMsgPin());
		System.out.println("message callback = " + sms.getMsgCallback());
		System.out.println("message text = " + sms.getMsgText());
	}
}
