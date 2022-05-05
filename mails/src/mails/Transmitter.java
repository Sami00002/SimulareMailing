package mails;

public interface Transmitter {

	public void store(Message message);

	public Message retrieve(Person receiver);

	public void readMessage();

}
