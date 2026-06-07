package patterns.structural.bridge.abstraction;

import patterns.structural.bridge.implementor.MessageSender;

public class PromotionalNotification extends Notification {

    public PromotionalNotification(MessageSender sender) {
        super(sender);
    }

    @Override
    public void notifyUser(String msg, String recipient) {
        sender.sendMessage("[PROMO] " + msg, recipient);
    }
}
