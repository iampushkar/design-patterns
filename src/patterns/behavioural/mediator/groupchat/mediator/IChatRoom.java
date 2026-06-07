package patterns.behavioural.mediator.groupchat.mediator;

import patterns.behavioural.mediator.groupchat.colleague.User;

public interface IChatRoom {
    void sendMessage(String message, User sender);
    void addUser(User user);
}
