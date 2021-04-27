package com.javeed.Example;

import java.util.List;

public class Test1 {
	 private int id;
	  private String name;
	  private List<String> list;
	public Test1(int id, String name, List<String> list) {
		super();
		this.id = id;
		this.name = name;
		this.list = list;
	}
	@Override
	public String toString() {
		return "Test1 [id=" + id + ", name=" + name + ", list=" + list + "]";
	}
	
	  
	  

}
