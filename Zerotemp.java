package CodeGame;

public class Zerotemp {
	
	
	public static int nearest(int n, int...args)
	    {
	        //тут мы храним значение ближайшего числа
	        int nearest = 0;
	        //очевидно же, что максимальное значение типа int - это одновременно максимальная удаленность двух чисел
	        //Умножаем на два и приводим к типу long, так как в Java нет беззнаковых типов
	        int value =10000; //2*Integer.MAX_VALUE  почему то не работает;// самое большое число возможно при типах интегер
	        //дальше просто проходим по массиву и сравниваем разницу
	        //сравнение по модулю, т.е. чем меньше разница - тем ближе числа
	        for (int arg : args)//просто цикл для всего массив
	            if (value > Math.abs(n - arg)){//
	            value = Math.abs(n-arg);
	            nearest = arg;}    
	        for (int arg : args)
	        	if (Math.abs(nearest)==arg&&arg>0) nearest=Math.abs(arg);
	      
	        	
	      return nearest;
	    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] arr= {42, -5, 12, 21, 5, 24};
	
	int min = nearest(0, arr);


System.out.println(min);
	}

}
