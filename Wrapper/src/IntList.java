import java.util.Scanner;

public class IntList {
	
	private Integer[] intList;
	 
	
	public IntList() {
		Scanner scnr = new Scanner(System.in);
		Integer size;
		System.out.print("Number of values to be sorted: ");
		String input = scnr.next();
		size = Integer.parseInt(input);
		int sizeValue = size.intValue();
		intList = new Integer[sizeValue];
		for (int i = 0; i < sizeValue; i++) {
			Integer num = Integer.valueOf(i + 1);
			System.out.println("Number " + num.toString() + " in the array: ");
			input = scnr.next();
			intList[i] = Integer.parseInt(input);
		}
		scnr.close();
		
	}
	
	public void sortPrint() {
		Integer length = Integer.valueOf(intList.length);
		for (int i = 0; i < length.intValue(); i++) {
			System.out.print(intList[i].toString() + " ");
		}
		System.out.println();
		for (int i = 0; i < length.intValue() - 1; i++) {
			Integer min = Integer.valueOf(i);
			for (int j = i + 1; j < length.intValue(); j++) {
				if (intList[j].compareTo(intList[min.intValue()]) < 0) {
					min = Integer.valueOf(j);
				}	
			}
			Integer temp = intList[min.intValue()];
			intList[min] = intList[i];
			intList[i] =  temp;
		}
		for (int i = 0; i < length.intValue(); i++) {
			System.out.print(intList[i].toString() + " ");
		}
	}
	
}