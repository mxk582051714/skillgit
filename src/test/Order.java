package test;

public class Order {
	private IDataAccess _ida;// 定义一个私有变量保存抽象

	public IDataAccess get_ida() {
		return _ida;
	}

	public void set_ida(IDataAccess _ida) {
		this._ida = _ida;
	}

	// 属性，接受依赖
	public IDataAccess Ida;

	public void Add() {
		_ida.Add();
	}
}
