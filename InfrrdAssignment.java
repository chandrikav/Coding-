package chan.code.samples;

import java.util.ArrayList;
import java.util.Scanner;

public class InfrrdAssignment {

	public static int pillowMatch(int numberOfPeople, int songDuration) throws IllegalArgumentException {
		
		if(numberOfPeople<=0 || songDuration < 0)
			throw new IllegalArgumentException("invalid inputs");
		int eliminatedIndex = 0;
		ArrayList<Integer> participants = new ArrayList<Integer>(numberOfPeople);
		for (int i=1; i<=numberOfPeople; i++) {
			participants.add(i);
		}
		while (participants.size()>1) {
			eliminatedIndex=(eliminatedIndex+songDuration-1)%participants.size();
			participants.remove(eliminatedIndex);
		}
		return participants.get(0);
	}

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter number of people participating");
			int n=scanner.nextInt();
			System.out.println("Enter the song duration");
			int s=scanner.nextInt();
			System.out.println("Winner of the match is at the " +pillowMatch(n, s)+" position");
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
	}

}
