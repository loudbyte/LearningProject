package NewDotCom;
import java.util.*;

public class DotComBust {
	
	// Объявляем и инициализаруем переменные, которые нам понадобятся
	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
	private int numOfGuesses = 0;
	
	private void setUpGame() {
		// Создадим несолько "сайтов" и присвоим им адреса.
		// Создаем три объекта DotCom, даем им имена и помещаем в ArrayList.
		DotCom one = new DotCom();
		one.setName("Pets.com");
		DotCom two = new DotCom();
		two.setName("eToys.com");
		DotCom three = new DotCom();
		three.setName("Go2.com");
		dotComsList.add(one);
		dotComsList.add(two);
		dotComsList.add(three);
		
		// Вводим краткие инструкции для пользователя.
		System.out.println("Ваша цель - потопить три 'сайта'.");
		System.out.println("Pets.com, eToys.com, Go2.com");
		System.out.println("Попытайтесь потопить их за минимальное количество ходов");
		
		// Повторяем с каждым объем DotCom в списке
		for (DotCom dotComSet : dotComsList) {
			// Запрашиваем у вспомогательного объекта объекта адрес 'сайта'
			ArrayList<String> newLocation = helper.placeDotCom(3);
			// Вызываем сеттер из объекта DotCom, чтобы передать ему иестоположение, 
			// которое только что получили от вспомогательного класса
			dotComSet.setLocationCells(newLocation);
		} // конец цикла
	} // конец метода
	
	private void startPlaying() {
		//до тех пор пока список объектов DotCom не будет пустым.
		while(!dotComsList.isEmpty()) {
			// Получаем пользовательский ввод
			String userGuess = helper.getUserInput("Сделайте ход");
//			// Вызываем наш метод checkUserGuess
			checkUserGuess(userGuess);
		} // конец while
		// Вызываем наш метод finishGame
		finishGame();
	} // конец метода startplaying method
	
	private void checkUserGuess(String userGuess) {
		
		numOfGuesses++; // инкрементируем колличество попыток, которые сделал пользователь
		String result = "Мимо"; // подразумеваем промах, пока не выявили обратного
		
		// Повторяем это для всех объектов DotCom в списке
		for (DotCom dotComToTest : dotComsList) {
			
			// Просим DotCom проверить ход пользователя, ищем попадание (или потопление)
            result = dotComToTest.checkYourself(userGuess);
			if (result.equals("Попал")) {
				break; // Выбираемся из цикла раньше времени, нет смысла проверять другие "сайты"h
			}
			if (result.equals("Потопил")) {
				dotComsList.remove(dotComToTest); // Ему пришел конец,кдаляем его из списка сайтов и выходим из цикла
				break;
			}
		} // конец for
		System.out.println(result); // Выводим для пользователя результат
	} // конец метода checkUserGuess
	
	private void finishGame() {
		// Выводим сообщение о том, как пользователь прошел игру
		System.out.println("Все 'сайты' ушли ко дну! Ваши акции теперь ничего не стоят.");
		if (numOfGuesses <= 18) {
			System.out.println("Это заняло у Вас всего " + numOfGuesses + " попыток.");
			System.out.println("Вы успели выбраться до того, как ваши вложения утонули. =) ");
		} else {
			System.out.println("Это заняло у Вас довольно много времени. " + numOfGuesses + " попыток.");
			System.out.println("Рыбы водят хороводы вокруг ваших вложений. =D ");
		}
	}// конец метода finishGame
	
	public static void main (String[] args) {
		DotComBust game = new DotComBust(); // создаем игровой объект
		game.setUpGame(); // Говорим игровому объекту подготовить игру
		game.startPlaying(); // Говорим игровому объекту начать главный игровой цикл (продолжаем запрашивать пользорвательский ввод и проверять получернный данные)
	} // конец метода main
}
