package Driver;

import java.util.Arrays;
import java.util.Scanner;
import com.greatlearning.services.MergeSort;
import com.greatlearning.services.NotesCount;

public class Driver {

	public static void main(String[] args) {
		//Initialize Scanner
		Scanner scanner = new Scanner(System.in);
		//Initialize MergeSort and NotesCount objects
		MergeSort mergeSort = new MergeSort();
		NotesCount notesCount = new NotesCount();
		System.out.println("Enter the size of currency denominations");
		int totalNoOfDenominations = scanner.nextInt();
		//Initialize the notes array
		int[] notes = new int[totalNoOfDenominations];
		//Get currency denominations value
		System.out.println("Enter the currency denominations value");
		for(int i=0; i<totalNoOfDenominations; i++) {
			notes[i] = scanner.nextInt();
		}
		//Get the amount to pay
		System.out.println("Enter the amount you want to pay");
		int amount = scanner.nextInt();
		//Merge Sort
		mergeSort.sort(notes, 0, notes.length-1);
		//countNotes
		System.out.println(Arrays.toString(notes));
		notesCount.notesCountImplementation(notes,  amount);
		
		scanner.close();
	}
}
