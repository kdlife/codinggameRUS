package CodeGame;

import java.util.HashSet;
import java.util.Set;

public class Container {
 private Set<Container>group; // создаем множество группы контейнеров
 private double amount; // обьем контейрера
 public Container() { // создаем контейнер
	 group= new HashSet<Container>();// создаем множество , которое будет отобрпжпть соединия между резервуарами
	 group.add(this); // группа начитается с этого резервуара
	 
 }
 public double getAmount() {return amount;}
 public void connectTo(Container other) {
	 if(group==other.group) return;// если группы совпадают то ничего  не делаем
	 int size1 = group.size();// кол-во резервувров в 1 группу
	 int size2 = other.group.size(); // колво резервуаров в  2 групп
	 
	  double total1=size1*amount; // обшией обем первой грууппы
	  double total2=size2*other.amount;// общий обьем второй группы
	  double newAmount=(total1+total2)/(size1+size2);// вычисляем новый обьем
	  
	  group.addAll(other.group);// добовляем в первую группу, вторую группу
	  for(Container c:other.group) {c.group=group;}//// Обновить группу резервуаров, соединенных с other ////  не совсем понятно
	  for(Container c:group) {c.amount=newAmount;}// для каждого контейрера группы присваиваем новое значение амойнт
 }
 public void addWater(double amount) {// метод для добовленя воды в резервуар
	 double amountPerContainer=amount/group.size();// узнаем сколько добавить в каджый контейнер поровну
	 for (Container c :group) {c.amount+=amountPerContainer;}// добовляем к  текущему содержимому 
 }
 
 
 
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Container a = new Container();
	        Container b = new Container();
	        Container c = new Container();
	        Container d = new Container();
	        
	        a.addWater(12);
	        d.addWater(8);
	        a.connectTo(b);
	        System.out.println(a.getAmount()+" "+b.getAmount()+" "+
	                           c.getAmount()+" "+d.getAmount());
	        b.connectTo(c);
	        System.out.println(a.getAmount()+" "+b.getAmount()+" "+
	                           c.getAmount()+" "+d.getAmount());
	        b.connectTo(d);
	        System.out.println(a.getAmount()+" "+b.getAmount()+" "+
	                           c.getAmount()+" "+d.getAmount());
	    }
	
	}


