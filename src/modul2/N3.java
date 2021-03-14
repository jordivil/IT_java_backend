package modul2;

public class N3 {

	public static void main(String[] args) throws InterruptedException {
		int hora = 23;
		int minut = 59;
		int segon = 30;

		while (true) {
			if (hora < 10) {
				System.out.print("0");
			}
			System.out.print(hora + ":");

			if (minut < 10) {
				System.out.print("0");
			}
			System.out.print(minut + ":");

			if (segon < 10) {
				System.out.print("0");
			}
			System.out.println(segon);

			segon++;
			if (segon == 60) {
				segon = 0;
				minut++;
				if (minut == 60) {
					minut = 0;
					hora++;
					if (hora == 24) {
						hora = 0;
					}
				}
			}
			Thread.sleep(1000);
		}
	}

}
