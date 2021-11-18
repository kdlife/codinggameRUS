package CodeGame;

import java.util.Scanner;
import java.util.Arrays;
import java.io.UnsupportedEncodingException;

public class Convert0 {

	public static void main(String[] args) throws UnsupportedEncodingException {
	Scanner scan=new Scanner(System.in);// сканер
	StringBuilder binary=new StringBuilder();// обьект стриг билдер
	System.out.println("ВВыедите строку");
	String message = scan.nextLine(); //считоваем строку из консоли которую необходимо перевести с код 0000
	System.out.println("Вы ввели строку  "+ message + "используя метот getBytes " + message.getBytes());
	for (byte b:message.getBytes()) {
		 binary.append(String.format("%7s", Integer.toBinaryString(b)).replace(' ', '0')); //"%7s" - 7 символов, в строке. нужно передовать байт за байтом, иначе не работает
	 }
	System.out.println("После преобразования " + binary);
//	byte []xx=message.getBytes();
	//System.out.println("Просто попробуем применить метот Integer.toBinaryString " + Integer.toBinaryString(xx))
   // System.err.println("Оригинал" + message);
   // System.err.println("Бинарный вывод" + binary);
	boolean zeros=binary.charAt(0)=='0';// проверяем первый символ 0 (имменно символ а виде '0' , a  не 0 ) или нет
	StringBuilder outBinary=new StringBuilder();// новоя строка для  выходного кодировоного значения
	int seriesLength=1; // кол-во нулей либо единиц по порядку
	 for ( int i =1; i <binary.length();i++) {// перебираем все строку 
		 if(binary.charAt(i)==binary.charAt(i-1)) {//  проверяем  одинакоавы ли в очереди символы
			 seriesLength++;//увеличиваем если следующий символ совподает с предыдущим
		 } else {
			 outBinary.append(formatMethod(zeros, seriesLength)).append(" "); //добавляем в выходную строку значение переданное методом formatMethod + пробел в конце выполнения кажного метода
			 zeros=!zeros;// изменяем 0на 1 или 1 на 0
			 seriesLength=1;//  возвращаем до 1 символа длинну следущей части
		 }
		 
		 
	 }
	 outBinary.append(formatMethod(zeros, seriesLength)); // добовляем  последний символ так как в цикле он не может  выполнится
	 System.out.println("если просто вывести строку "+ outBinary);

	
	}

	private static String formatMethod(boolean zeros, int seriesLength) {// сам метот для перевода 1 в 0_0
		char [] xxx=new char[seriesLength];// делаем массив длинной seriesLength
		Arrays.fill(xxx, '0');// заполняем массив символом 0
		return (zeros ? "00":"0")+" "+ new String(xxx);// кодируем если 0 то 00 , если 1  то 0 0  
	}

}
