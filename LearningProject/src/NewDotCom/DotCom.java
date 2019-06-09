package NewDotCom;
import java.util.*;

public class DotCom {
		private ArrayList<String> locationCells; // ArrayList с ячейками описывающими местоположение
		private String name; // имя "сайта"
		
		// Сеттер, который обновляет местополождение "сайта" (случайный адрпес, представляемый методом placeDotCom() из класса GameHelper)
		public void setLocationCells (ArrayList<String> loc) {
			locationCells = loc;
		}
		
		// Сеттер, назначающий имя
		public void setName(String n) {
			name = n;
		}
		
		public String checkYourself(String userInput) {
			String result = "Мимо";
			int index = locationCells.indexOf(userInput); // метод indexOf() из ArrayList в действии!Если ход пользователя совпал с одним из эл-тов ArrayList, то метод indexOF() вернет его местоположение. Если нет, то indexOf() вернет -1
 			if (index >= 0) {
				locationCells.remove(index); // Применяем метод remove() из ArrayList для удаления элемента.
				
				if (locationCells.isEmpty()) { // используем метод isEmpty(), чтобы проверить, все ли адреса были разгаданы
					result = "Потопил";
					System.out.println("Ой! Вы потопили " + name + "  =( "); // сообщаем пользователю о потоплении "сайта"
				} else {
					result = "Попал";
				} // конец if 
			} // конец if
 			
 			return result; // возаращаем "Мимо", "Попал" или "Потопил"
 			
		} // конец метода checkYourself
} // конец класса
