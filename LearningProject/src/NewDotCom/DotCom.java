package NewDotCom;
import java.util.*;

public class DotCom {
		private ArrayList<String> locationCells; // ArrayList � �������� ������������ ��������������
		private String name; // ��� "�����"
		
		// ������, ������� ��������� ��������������� "�����" (��������� ������, �������������� ������� placeDotCom() �� ������ GameHelper)
		public void setLocationCells (ArrayList<String> loc) {
			locationCells = loc;
		}
		
		// ������, ����������� ���
		public void setName(String n) {
			name = n;
		}
		
		public String checkYourself(String userInput) {
			String result = "����";
			int index = locationCells.indexOf(userInput); // ����� indexOf() �� ArrayList � ��������!���� ��� ������������ ������ � ����� �� ��-��� ArrayList, �� ����� indexOF() ������ ��� ��������������. ���� ���, �� indexOf() ������ -1
 			if (index >= 0) {
				locationCells.remove(index); // ��������� ����� remove() �� ArrayList ��� �������� ��������.
				
				if (locationCells.isEmpty()) { // ���������� ����� isEmpty(), ����� ���������, ��� �� ������ ���� ���������
					result = "�������";
					System.out.println("��! �� �������� " + name + "  =( "); // �������� ������������ � ���������� "�����"
				} else {
					result = "�����";
				} // ����� if 
			} // ����� if
 			
 			return result; // ���������� "����", "�����" ��� "�������"
 			
		} // ����� ������ checkYourself
} // ����� ������
