package NewDotCom;
import java.io.*;
import java.util.*;

public class GameHelper {
	
	private static final String alphabet = "abcdefg";
	private int gridLength = 7;
	private int gridSize = 49;
	private int [] grid = new int[gridSize];
	private int comCount = 0;
	
	public String getUserInput(String prompt) {
		
		String inputLine = null;
		System.out.print(prompt + " ");
		try {
			BufferedReader is = new BufferedReader (
					new InputStreamReader(System.in));
			inputLine = is.readLine();
			if (inputLine.length() == 0) return null;
		} catch (IOException e) {
			System.out.println("IOExeption: " + e);
		}
		return inputLine.toLowerCase();
	}
	
	public ArrayList<String> placeDotCom(int comSize) {
		ArrayList<String> alphaCells = new ArrayList<String>();
		//String [] alphacoords = new String [comSize];	// Хранит координаты типа  f6
		String temp = null;								// Временная строка для конкатенации
		int [] coords = new int[comSize];				// Координаты текущего сайта
		int attempts = 0;								// Счетчик текущих попыток
		boolean success = false;						// Нашли подходящее местоположение?
		int location = 0;								// Текущее начальное местоположение
		
		comCount++;										// Энный "сайт" для размешения
		int incr =1;									// Устанавливаем горизонтальный инкремент
		if ((comCount % 2) == 1) {
			incr = gridLength;
		}
		
		while ( !success & attempts++ < 200 ) {			// Главный поисковый цикл (32)
			location = (int) (Math.random() * gridSize);// Получаем случайную стартовую точку
			//System.out.print("пробуем" + location);
			int x = 0;									// Энная позиция в "сайте", который нужно размстить
			success = true;								// Предполагаем успешный исход
			while (success && x < comSize) {			// Ищем соседнюю неиспользованную ячейку
				if(grid[location] == 0) {				// Если еще не используется
					coords[x++] = location;				// Сохраняем местоположение
					location += incr;					// Пробюуем "следущую" соседнюю ячейку
					if (location >= gridSize) {			// Вышли зарамки - низ			
						success = false;				// Неудача
					}
				} else {								// Вышли за рамки = правый край
					//System.out.print("используется" + location);
					success = false;					// Неудача
				}
			}
		}												// Конец while
		
		int x = 0;										// Переводим местоположение в символьные координаты
		int row = 0;
		int column = 0;
		//System.out.println("\n");
		while (x < comSize) {
			grid[coords[x]] = 1;						// Помечаем ячейки на главной етке как "использованные"
			row = (int) (coords[x] / gridLength);		// Получаем значение строки
			column= coords[x] % gridLength;				// Получаем числовое значение столбца
			temp = String.valueOf(alphabet.charAt(column));// Преобразуем его в строковый символ
			
			alphaCells.add(temp.concat(Integer.toString(row)));
			x++;
			//System.out.print(" coord " + x + " = " + alphaCells.get(x-1)); // Это выражение говорит вам о том, где именно находится "сайт"
		}
		
		//System.out.println("\n");
		
		return alphaCells;
	}

}
