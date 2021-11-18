package CodeGame;
import java.util.Scanner;

public class Stokanaoborot {
	public static String getString() {
		System.out.println("Введите строку или слово которое нужно развернуть");
		Scanner scan=new Scanner(System.in);
		return scan.nextLine();
	}
	public static String Naobor1 (String text) {// создаем метод с одним пораметром для строки
		int lenghtText=text.length();// узнаем длинну строки
		String result="";// переменная для записи новой строки
		for (int i = 0; i<lenghtText; i++) {// проходим все символы с 0
			result = text.charAt(i)+result;// записоваем все симводы в обр порядке
		}
	    return result;
	}
	public static String Naobor2 (String text) {
		String result ="";
		char [] textChar=text.toCharArray(); // моздаем  из строки массив символов
		for (int i=textChar.length-1; i >= 0 ; i--) {//начинаем с последнего, и до 0
			
			result +=textChar[i]; // складывам все в  строку
		}
		return result;
	}
	
	public static String Naobor3(String text) {
		String result= new StringBuffer(text).reverse().toString();// встроенный метот  реверса
		return result;
	}
	
	
	public static String Naobor4 (String text) { // прикольно получилсь, случайно то что я хотел
		String leftresult="";
		String rightresult="";
		int textl=text.length();
	//	if (textl<=1) {
	//		return text;
	//	}
		leftresult=text.substring(0, textl/2);
		rightresult=text.substring(textl/2, textl);
		
		return rightresult+leftresult;
	}
	
	
	public static String Naobor5 (String text) { // Довольно  непонятно, но тоже меняет порядок
		String leftresult="";
		String rightresult="";
		int textl=text.length();//длина переменной стринг
		if (textl<=1) {
			return text;
		}
		leftresult=text.substring(0, textl/2); //  отделяем левую половину
		rightresult=text.substring(textl/2, textl);// отделяем правую половину
		
		return Naobor5(rightresult)+Naobor5(leftresult);// передаем назад в метод правую и левую половину
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String text1= "1asdfg666661";
String text2= "123456789";
//System.out.println(Naobor1(text1));
//System.out.println(Naobor2(text1));
//System.out.println(Naobor3(text1));
//System.out.println(Naobor4(text1));
//System.out.println(Naobor5(text1));
//System.out.println(Naobor5(text2));
String x=getString();
System.out.println( x + "    Перевернули" + Naobor4(x) );
	}

}
