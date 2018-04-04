package test;

public class Order {
	private IDataAccess _ida;

	public IDataAccess get_ida() {
		return _ida;
	}

	public void set_ida(IDataAccess _ida) {
		this._ida = _ida;
	}

	// ���ԣ���������
	public IDataAccess Ida;
	public void function() {
		
	}

	public void Add() {
		_ida.Add();
	}
}
