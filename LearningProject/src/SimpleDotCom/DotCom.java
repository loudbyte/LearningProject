//�������������� ����������� ������ ������������ ������ � ���� �� ���������
//�� �������� 

package SimpleDotCom;

import java.util.ArrayList; 

public class DotCom {
	
	private ArrayList<String> locationCells;
//	int numOfHits = 0;
	
	public void setLocationCells(ArrayList<String> locs) {
		locationCells = locs;
	}
	
	public String checkYourself(String userInput) {
//		int guess = Integer.parseInt(userGuess);
		String result = "����";
		
		int index = locationCells.indexOf(userInput);
		
		if (index >= 0 ) {
			
			locationCells.remove(index);
			
			if (locationCells.isEmpty()) {
				result = "�������";
			} else {
				result = "�����";
			}
		}
		return result;
		
	}
}
