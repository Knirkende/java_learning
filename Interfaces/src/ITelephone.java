
public interface ITelephone { // naming convention: start with capital I
	void powerOn();
	void dial(int phoneNumber);
	void answer();
	boolean callPhone(int phoneNumber);
	boolean isRinging();
}
