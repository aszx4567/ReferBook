package _0829Ex;

import java.io.File;
import java.util.Scanner;

public class Ex1_12 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("C:/temp/data2.txt"));
		int hap = 0;

		while (sc.hasNextLine()) //������������ �� �ƴϸ� ����
			hap += sc.nextInt();

		System.out.println("a :  " + hap);
		sc.close();
	}
}
