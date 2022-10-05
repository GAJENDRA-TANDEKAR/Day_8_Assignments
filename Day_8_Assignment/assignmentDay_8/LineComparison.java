package assignmentDay_8;

import java.util.Scanner;

public class LineComparison {

	public static void main(String[] args) {
		 float ab = lengthOfLine();
		 System.out.println("length of line ab is "+ab);
		 float cd = lengthOfLine();
		 System.out.println("length of line cd is "+cd);
		 System.out.println("ab "+compareTo(ab , cd)+" cd");
	}
	
	public static String compareTo(float ab, float cd) {
		String result = "";
		if (ab>cd) {
			result = "greater";
		}else if (ab<cd) {
			result = "smaller";
		}else {
			result = "equals";
		}
		return result;
	}
	
	public static float lengthOfLine() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter co-ordinate of point (x,y) ");
		int xA = scanner.nextInt();
		int yA = scanner.nextInt();
		System.out.println("Enter co-ordinate of point (x,y) ");
		int xB = scanner.nextInt();
		int yB = scanner.nextInt();
		float length =(float) Math.sqrt((xA-xB)*(xA-xB)+(yA-yB)*(yA-yB));
		return length;
	}

}
