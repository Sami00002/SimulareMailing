package mails;

public class MailTransmitter implements Transmitter {

	private Message[] buffer;
	private int numberMessage;
	private int numberMaxMessage;

	@Override
	public Message retrieve(Person receiver) {

		return null;
	}

	@Override
	public void readMessage() {
		// TODO Auto-generated method stub

	}

	public MailTransmitter(int numberMaxMessage) {
		this.buffer = new Message[numberMaxMessage];
		this.numberMaxMessage = numberMaxMessage;
		this.numberMessage = 0;
	}

	public void store(Message message) {

		if (numberMessage == buffer.length) {
			System.out.println("Nu mai poate sa adauga! ");
			System.out.println("Mesajele sunt: ");
			for (int i = 0; i < numberMaxMessage; i++) {
				buffer[i].toString();
				buffer[i] = null;
				numberMessage--;
			}
		} else {
			buffer[numberMessage] = message;
			numberMessage++;
		}

	}
}
