package com.harxsh.spring.basics.springin5steps.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BinarySearchImpl {
	
	private final Logger logger = LoggerFactory.getLogger(BinarySearchImpl.class);
	
	@Autowired
	@Qualifier("bubble")
	private SortAlgorithm sortAlgorithm;
	
//	public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
//		this.sortAlgorithm = sortAlgorithm;
//	}

//	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
//		super() ;
//		this.sortAlgorithm = sortAlgorithm;
//	}
	
	// Bean injection types:
	// Constructor - Autowiring by type from bean name 'binarySearchImpl' via constructor to bean named 'quickSortAlgorithm'
	// Setter - Autowiring by type from bean name 'BinarySearchImpl' to bean named 'quickSortAlgorithm'
	// No Setter or Constructor - Autowiring by type from bean name 'BinarySearchImpl' to bean named 'quickSortAlgorithm'
	// when bean creation is compulsory the constructor injection is common type

	public int binarySearch(int[] numbers, int numberToSearchFor) {
		//int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		
		// Search the array
		 
		return 3;
	}
	
	@PostConstruct
	public void postConstruct() {
		logger.info("Post Construct");
	}
	
	@PreDestroy
	public void preDestroy() {
		logger.info("Pre Destroy");
	}
}