package test;

import domain.Exercise;
/** ��������� ������������
* �������������� ������.
* @author Katia Zourab
*/
public class TestResult {
	public static void main(String[] args) {
		int numbersArray[] = { 45, 78, 46, 154, 15, 19, 89, 36, 63, 33 };
		System.out.println("���������� ������: ");
        for (int i = 0; i < numbersArray.length; i++)
        {
        	System.out.print(numbersArray[i] + "\t");
        	}
        int h = Exercise.SecondNumber(numbersArray);
		System.out.println("\n������ �� �������� �����: " + h);
		}
	}