import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class mathBranch {
	//Mutator
		public void setNumber(int num)
		{
			number = num;
		}
		
		//Accessor
		public int getNumber()
		{
			return number;
		}
		
		//Receives user input
		public void askForNumber()
		{
			System.out.print("What number wouldyou like to use?");
			this.setNumber(userInput.nextInt());
		}
		
		//Splits the numbers into separate digits and assigns them 
		//to the private list then the list is reversed for display purposes
		public void dissect(int num,List<Integer> spList)
		{		
			while(num > 0)
			{
				spList.add(num%10);
				num = num/10;			
			}
			Collections.reverse(spList);
			System.out.println (spList);		
		}
		
		//Raises all elements within a list to the power of 2
		public void squareNumbers(List<Integer> splitNum)
		{
			int k;
			
			for( k = 0; k < splitNum.size(); k++)
			{
				splitNum.set(k, (int)((Math.pow(splitNum.get(k), 2))));
			}
		}
		
		//Returns the sum of all the elements within the list
		public int sum(List<Integer> sumNum)
		{
			int k,sum;
			sum = 0;
			
			for( k = 0; k < sumNum.size(); k++)
			{
				sum += sumNum.get(k);
			}		
			return sum;
		}
		
		//Recursive method to check if a number is happy	
		public void checkIfHappy(int numberToCheck)
		{
			int flag;
			
			this.dissect(numberToCheck,splitNumbers);
			this.squareNumbers(splitNumbers);
			flag = this.sum(splitNumbers);
			
			checkedNumbers.add(numberToCheck);
			if (flag == 1)
			{
				System.out.println("Yes, your number is happy.");
			}
			//If the number has been checked before, it is not happy
			else if(checkedNumbers.contains(flag))
			{
				int flagIndex;
				flagIndex = checkedNumbers.indexOf(flag);
				System.out.println(checkedNumbers.get(flagIndex));
				System.out.println("No your number is not happy");			
			}	
			//Repeat the process and clear the list
			else 
			{
				splitNumbers.clear();
				this.checkIfHappy(flag);
			}		
		}	
		
		//Private members, number given, empty list for the split digits,
		//and an empty list to add the numbers that have been checked
		private int number;
		private List<Integer> splitNumbers   = new ArrayList<Integer>();
		private List<Integer> checkedNumbers = new ArrayList<Integer>();
		Scanner userInput = new Scanner(System.in);

}
