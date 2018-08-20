package com.edunacor.mockito.mockitodemo;


//Business implementation class
public class SomeBusinessImpl {
	
	//DataService is an dependency to fetch data array
	private DataService dataService;
	
	//constructor to attach dataservice interface impl
	public SomeBusinessImpl(DataService dataService) {
		super();
		this.dataService = dataService;
	}


	//find out max of all
	int findGreatestFromAllData() {
		int greatest=Integer.MIN_VALUE;
		int[] data = dataService.retrieveAllData();
		for (int value : data) {
			if (value > greatest) {
				greatest = value;
			}
		}
		return greatest;
	}
}

