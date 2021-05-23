package com.send2abhishek.spring.springbootbasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchAlgo {
	
	@Autowired
	private SearchAlog algo;

	public BinarySearchAlgo(SearchAlog algo) {
		super();
		this.algo = algo;
	}
	
	public int sortNumbers() {
		
	return algo.sort(10);
	}
	
	
	
	

}
