import java.util.*;
/*
 * Consider one string as input. You have to check whether the strings obtained from the input string with single backward and single forward shifts are the same or not. If they are the same, then print 1, otherwise, print 0.

Hint:
Backward shift: A single circular rotation of the string in which the first character becomes the last character and all the other characters are shifted one index to the left. For example, “abcde” becomes “bcdea” after one backward shift.
Forward shift: A single circular rotation of the string in which the last character becomes the first character and all the other characters are shifted to the right. For example, “abcde” becomes “eabcd” after one forward shift.

Instructions:
* The system does not allow any kind of hard-coded input values.
* The written program code by the candidate will be verified against the inputs that are supplied from the system.
* For more clarification, please read the following points carefully till the end.

Constraints:
String str should not allow space, special characters, and numbers.
String str should only be in the English language.

Input / Output:

Input:
sfdlmnop
Output:
0

Explanation:
In the first example, the string is "sfdlmnop" Forward shift: fdlmnops Backward shift: psfdlmno Both the strings above are not equal so the output is 0.
 */
public class Practice_1 {
	public static void main(String[] args) {
		System.out.println("Enter the String:");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String fshift = str.substring(1) + str.substring(0,1);
		System.out.println(fshift);
		String bshift = str.substring(str.length()-1) + str.substring(0,str.length()-1);
		System.out.println(bshift);
		if(fshift.equalsIgnoreCase(bshift)) {
			System.out.print("1");
		}
		else {
			System.out.print("0");
		}
	}

}
