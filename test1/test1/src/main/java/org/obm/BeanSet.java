package org.obm;

import java.util.LinkedHashSet;

public class BeanSet {

	private final LinkedHashSet<MyBean> beans;
	
	public BeanSet() {
		beans = new LinkedHashSet<MyBean>();
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
