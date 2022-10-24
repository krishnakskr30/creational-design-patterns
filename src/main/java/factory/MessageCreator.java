package factory;

import factory.message.Message;

/**
 * This is our abstract "creator".
 * The abstract method createMessage() has to be implemented by
 * its subclasses.
 */
public abstract class MessageCreator {
    public Message getMessage() {
        Message message = createMessage();
        message.addDefaultHeaders();//additional operations are used in creator
        message.encrypt();

        return message;
    }

    //Factory method
    public abstract Message createMessage();

}
