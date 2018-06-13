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
 * Shows how to check the status of a previously sent wireless
 * message in Java.
 *
 * Please visit www.simplewire.com for sales and support.
 *
 * @author Simplewire, Inc.
 * @version 2.6.1
 * @since jdk1.2
 *****************************************************************/

import com.simplewire.sms.*;

public class check_status
{
	public static void main(String[] args) throws Exception
	{
		SMS sms = new SMS();

		// Subscriber Settings
		sms.setSubscriberID("123-456-789-12345");
		sms.setSubscriberPassword("Password Goes Here");

		// Message Settings
		sms.setMsgTicketID("L05SN-YNDQN-QSWQX-EG6BC");

		System.out.println("Checking message status with Simplewire...");

		// Check Message Status
		sms.msgStatusSend();

		// Check For Errors
		if(sms.isSuccess())
		{
			System.out.println("Message status retrieved!");
			System.out.println("Status Code: " + sms.getMsgStatusCode());
			System.out.println("Status Desc: " + sms.getMsgStatusDesc());
		}
		else
		{
			System.out.println("Message status not retrieved!");
			System.out.println("Error Code: " + sms.getErrorCode());
			System.out.println("Error Description: " + sms.getErrorDesc());
			System.out.println("Error Resolution: " + sms.getErrorResolution() + "\n");
		}
	}
}
