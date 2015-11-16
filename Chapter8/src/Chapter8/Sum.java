package Chapter8;

public class Sum {
	int sum;
	
	int allsum(int x, int y) {
		for (int i = x; i <= y; i++) {
			sum = sum + i;
		}
		return sum;
	}

	int oddsum(int x, int y) {
		if (x % 2 == 0)
			x++;
		for (int i = x; i <= y; i=i+2) {
			sum = sum + i;
		}
		return sum;
	}

	int evensum(int x, int y) {
		if (x % 2 == 1)
			x++;
		for (int i = x; i <= y; i=i+2) {
			sum = sum + i;
		}
		return sum;
	}

	public static void main(String[] args) {
		Sum s = new Sum();
		
		int result = 0;
		result = s.allsum(1, 100);
		System.out.println(result);
		s.sum = 0;
		
		result = s.oddsum(1, 100);
		System.out.println(result);
		s.sum = 0;
		
		result = s.evensum(1, 100);
		System.out.println(result);
		s.sum = 0;
	}

}
