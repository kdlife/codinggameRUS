package CodeGame;

import java.util.Arrays;
import java.util.Scanner;

public class Difibrilyator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		double lon=Double.parseDouble(scan.nextLine().replace(',', '.')) ;// считывем строку и переводим ее в доубл, меняя запятую на точку
		double lot=Double.parseDouble(scan.nextLine().replace(',', '.')) ;
		//System.out.println(lon+" " +"\t"+lot);
		int N=scan.nextInt();// считываем колво дефибреляторов
		scan.nextLine();
		double min = 200000;// можно любое другое большое число или бесконечность
		String answer="";
		double d;// дистанция
		for (int i=0;i<N;i++) {
			String[] def=scan.nextLine().replace(',', '.').split(";");
			System.out.println(Arrays.toString(def));
		}
		
	}

}
