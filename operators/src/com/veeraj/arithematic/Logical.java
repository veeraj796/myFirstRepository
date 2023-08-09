package com.veeraj.arithematic;

	class Logical {
		public void andOperator(int age)
		{
			System.out.println("AGE is"+age);
			if ((age > 0) && (age < 18)) {
			System.out.println("Not Eligible to vote");	
			}
			else
				System.out.println("Eligible to vote");
			 
		
		}
		public float updatesalary(float currentsalary,float experience) {
			if(currentsalary < 25000 || experience > 5.0) {
				return currentsalary+currentsalary*0.10f;
			}
			else 
				return currentsalary;
			
		}
	}