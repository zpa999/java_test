package Adapter;

public class AdapterImpl implements Adapter {

	@Override
	public Double twiceOf(Float num) {
		// TODO Auto-generated method stub
		return Math.doulbed(num.doubleValue());
		
	}

	@Override
	public Double halfOf(Float num) {
		// TODO Auto-generated method stub
		return Math.half(num);
	}

}
