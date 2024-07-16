/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;

public class Main
{
  public static void main (String[]args)
  {
	Scanner sc  = new Scanner(System.in);
	int n = sc.nextInt();
	int[] arr = new int[n];
	for(int i = 0; i < n; i++) {
	    arr[i] = sc.nextInt();
	}
	int MaxEle = arr[0];
	for(int i = 0; i < n-1; i++) {
	    if(arr[i+1] > MaxEle) {
	        MaxEle = arr[i+1];
	    }
	}
	
	System.out.print("Max Element is: "+ MaxEle);
  }
}
