package bridgelabzz;

import java.util.Scanner;

class Prime {

	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	
	int a, b, i, j,flag;

	
	System.out.printf( "Enter lower bound of the interval: ");
	a = sc.nextInt(); 

	
	System.out.printf( "\nEnter upper bound of the interval: ");
	b = sc.nextInt(); 

	
	System.out.printf("\nPrime numbers between %d and %d are: ", a, b);


	if (a == 1) {
		System.out.println(a);
		a++;
		if (b >= 2) {
			System.out.println(a);
			a++;
		}
	}
	if (a == 2)
		System.out.println(a);

	
	if (a % 2 == 0)
		a++;

	
	for (i = a; i <= b; i = i + 2) {

		flag = 1;

	
		for (j = 2; j * j <= i; ++j) {
			if (i % j == 0) {
				flag = 0;
				break;
			}
		}

		if (flag == 1)
			System.out.println(i);
	}

	}
}


