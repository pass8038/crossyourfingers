package Chapter8;

import java.util.Scanner;

public class SumofAll extends Sum{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		System.out.print("������ ������ �� ���� ���ڸ� �Է�(���� ������ �������� ����) : ");
		int n = stdin.nextInt();
		int m = stdin.nextInt();
		Sum s = new Sum();
		
		System.out.println(n + "���� " + m + "������ �� : " + s.allsum(n, m));
		s.sum = 0;
		
		System.out.println(n + "���� " + m + "������ Ȧ���� �� : " + s.oddsum(n, m));
		s.sum = 0;
		
		System.out.println(n + "���� " + m + "������ ¦���� �� : " + s.evensum(n, m));
	}

}
