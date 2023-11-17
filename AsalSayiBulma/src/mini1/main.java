package mini1;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int sayi;

		Scanner inp = new Scanner(System.in);
		System.out.println("sayi giriniz");
		sayi = inp.nextInt();
		int sayac = 0;
		while (sayac != -1) {
			int i;
			for (i = 2; i < (sayi - 1); i++) {
				if (sayi % i == 0) {
					System.out.println("asal degil");
				} else {
					System.out.println("asal");
				}
				System.out.println("devam etmek icin 0 a bitirmek icin -1 e basiniz");
				sayac = inp.nextInt();
				if (sayac == 0) {
					System.out.println("sayi giriniz");
					sayi = inp.nextInt();
					for (i = 2; i < (sayi - 1); i++) {
						if (sayi % i == 0) {
							System.out.println("asal degil");
						} else {
							System.out.println("asal");
							break;
						}
					}
				}

			}

		}
	}
}
