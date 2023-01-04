
public class MobilePhone implements ITelephone {
	
	private int myNumber;
	private boolean isRinging;
	private boolean isOn = false;
	
	@Override
	public void powerOn() {
		isOn = true;
		
	}
	@Override
	public void dial(int phoneNumber) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void answer() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean callPhone(int phoneNumber) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isRinging() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
