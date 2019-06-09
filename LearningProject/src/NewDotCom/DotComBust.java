package NewDotCom;
import java.util.*;

public class DotComBust {
	
	// ��������� � �������������� ����������, ������� ��� �����������
	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
	private int numOfGuesses = 0;
	
	private void setUpGame() {
		// �������� �������� "������" � �������� �� ������.
		// ������� ��� ������� DotCom, ���� �� ����� � �������� � ArrayList.
		DotCom one = new DotCom();
		one.setName("Pets.com");
		DotCom two = new DotCom();
		two.setName("eToys.com");
		DotCom three = new DotCom();
		three.setName("Go2.com");
		dotComsList.add(one);
		dotComsList.add(two);
		dotComsList.add(three);
		
		// ������ ������� ���������� ��� ������������.
		System.out.println("���� ���� - �������� ��� '�����'.");
		System.out.println("Pets.com, eToys.com, Go2.com");
		System.out.println("����������� �������� �� �� ����������� ���������� �����");
		
		// ��������� � ������ ����� DotCom � ������
		for (DotCom dotComSet : dotComsList) {
			// ����������� � ���������������� ������� ������� ����� '�����'
			ArrayList<String> newLocation = helper.placeDotCom(3);
			// �������� ������ �� ������� DotCom, ����� �������� ��� ��������������, 
			// ������� ������ ��� �������� �� ���������������� ������
			dotComSet.setLocationCells(newLocation);
		} // ����� �����
	} // ����� ������
	
	private void startPlaying() {
		//�� ��� ��� ���� ������ �������� DotCom �� ����� ������.
		while(!dotComsList.isEmpty()) {
			// �������� ���������������� ����
			String userGuess = helper.getUserInput("�������� ���");
//			// �������� ��� ����� checkUserGuess
			checkUserGuess(userGuess);
		} // ����� while
		// �������� ��� ����� finishGame
		finishGame();
	} // ����� ������ startplaying method
	
	private void checkUserGuess(String userGuess) {
		
		numOfGuesses++; // �������������� ����������� �������, ������� ������ ������������
		String result = "����"; // ������������� ������, ���� �� ������� ���������
		
		// ��������� ��� ��� ���� �������� DotCom � ������
		for (DotCom dotComToTest : dotComsList) {
			
			// ������ DotCom ��������� ��� ������������, ���� ��������� (��� ����������)
            result = dotComToTest.checkYourself(userGuess);
			if (result.equals("�����")) {
				break; // ���������� �� ����� ������ �������, ��� ������ ��������� ������ "�����"h
			}
			if (result.equals("�������")) {
				dotComsList.remove(dotComToTest); // ��� ������ �����,������� ��� �� ������ ������ � ������� �� �����
				break;
			}
		} // ����� for
		System.out.println(result); // ������� ��� ������������ ���������
	} // ����� ������ checkUserGuess
	
	private void finishGame() {
		// ������� ��������� � ���, ��� ������������ ������ ����
		System.out.println("��� '�����' ���� �� ���! ���� ����� ������ ������ �� �����.");
		if (numOfGuesses <= 18) {
			System.out.println("��� ������ � ��� ����� " + numOfGuesses + " �������.");
			System.out.println("�� ������ ��������� �� ����, ��� ���� �������� �������. =) ");
		} else {
			System.out.println("��� ������ � ��� �������� ����� �������. " + numOfGuesses + " �������.");
			System.out.println("���� ����� �������� ������ ����� ��������. =D ");
		}
	}// ����� ������ finishGame
	
	public static void main (String[] args) {
		DotComBust game = new DotComBust(); // ������� ������� ������
		game.setUpGame(); // ������� �������� ������� ����������� ����
		game.startPlaying(); // ������� �������� ������� ������ ������� ������� ���� (���������� ����������� ����������������� ���� � ��������� ����������� ������)
	} // ����� ������ main
}
