package Lab10;
import java.util.*;

public class LabActivity10 implements Mode {

	Scanner s = new Scanner(System.in);
	@Override
	public int getMode(int[] value) {
		
		int[] count = new int[101]; 
		for (int i=0; i<value.length; i++)
		{
			count[value[i]]++;
		}
		
		int index = count.length-1;
		for (int i=count.length-2; i>=0; i--)
		{
			if (count[i]>=count[index])
				index = i;
		}
		return index;
	}

	public static void main(String[] args) {
		
		LabActivity10 LA = new LabActivity10();
		
		int[] num = {2,4,100,4,1,4,18,10,2};
		int repVal = LA.getMode(num);
		System.out.println("The most repeated value is "+repVal);
		

}
}
