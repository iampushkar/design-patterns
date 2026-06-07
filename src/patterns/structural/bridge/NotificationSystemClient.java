package patterns.structural.bridge;

import patterns.structural.bridge.abstraction.AlertNotification;
import patterns.structural.bridge.abstraction.Notification;
import patterns.structural.bridge.abstraction.PromotionalNotification;
import patterns.structural.bridge.implementor.EmailSender;
import patterns.structural.bridge.implementor.MessageSender;
import patterns.structural.bridge.implementor.PushSender;
import patterns.structural.bridge.implementor.SMSSender;

public class NotificationSystemClient {
    public static void main(String[] args) {

        System.out.println("Notification System : ");
        System.out.println("-----------------------");

        MessageSender emailSender = new EmailSender();
        MessageSender smsSender = new SMSSender();
        MessageSender pushSender = new PushSender();

        Notification alert = new AlertNotification(emailSender);
        alert.notifyUser("Someone has logged in", "pushkar@gmail.com");

        Notification sms = new PromotionalNotification(smsSender);
        sms.notifyUser("Huge Discount", "101");
    }
}
