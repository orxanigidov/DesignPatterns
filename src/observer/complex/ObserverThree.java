package observer.complex;

public class ObserverThree implements IObserver {
	
	@Override
	public void update(int value) {
		System.out.println(ObserverThree.class.getSimpleName() + " value: " + value);
	}
	
}
