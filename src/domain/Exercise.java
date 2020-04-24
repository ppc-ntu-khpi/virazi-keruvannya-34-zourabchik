package domain;
/** Нахождение второго по величине числа в заданном массиве
* @author Katia Zourab
*/
public class Exercise {
	public static int SecondNumber(int[] numbersArray) {
		int biggest= numbersArray[0];
        int secondBiggest = numbersArray[0];
        for (int i = 0; i < numbersArray.length; i++)
        {
        	if (numbersArray[i] > biggest)
        	{
        		secondBiggest = biggest;
        		biggest = numbersArray[i];
        	}
        	else if (numbersArray[i] > secondBiggest && numbersArray[i] != biggest)
        	{
        		secondBiggest = numbersArray[i];
        		}
        	}
        return secondBiggest;
	}
}
