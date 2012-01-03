package org.obm;

import java.util.HashSet;

public class BeanSet {

	private final HashSet<MyBean> beans;
	
	public BeanSet() {
		beans = new HashSet<MyBean>();
	}
	
	public void add(MyBean bean) {
		beans.add(new MyBean(bean));
	}
	
	public int count() {
		return beans.size();
	}

	public MyBean[] toArray() {
		return beans.toArray(new MyBean[0]);
	}
	
	@Override
	public String toString() {
		return beans.toString();
	}
}
