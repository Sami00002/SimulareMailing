package mails;

public class EmailTransmitter implements Transmitter {

	private Message message;

	@Override
	public Message retrieve(Person receiver) {

		return null;
	}

	@Override
	public void readMessage() {

	}

	public void store(Message message) {
		this.message = message;
		Person reciver = message.getReciver();
	}

	public String getTransmitterType() {
		return "Email";
	}
}
