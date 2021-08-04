package com.interview.assessment;

public class StringCalculator {
	private int count = 0;
	public int getCalledCount() {
		return count;
	}
	
	public int add(String input) throws Exception {
		count++;
		if(isEmpty(input)) {
			return 0;
		}
		String[] numbers = input.split("\\W");
		
		
		return calculate(numbers);
	}
	
	public int calculate(String[] numbers) throws Exception{
		int sum = 0;
		for(String number : numbers) {
			int num = stringToInt(number);
			if(num < 0) {
				throw new Exception("Negatives not allowed");
			}
			else {
				if(num > 1000)
					continue;
				sum += num;
			}
		}
		return sum;
		
	} 
	
	public boolean isEmpty(String str) {
		return str.isEmpty();
	}
	
	public int stringToInt(String str) {
		if(isEmpty(str))
			return 0;
		return Integer.parseInt(str);
	}

}
