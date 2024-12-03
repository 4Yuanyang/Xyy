

import java.util.Scanner;

/**
 * �����ղ�ѯ���жϵ�ǰ�����ڸ�����һ��
 */
public class Days {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int year, month, day;
		boolean isLeap = false;
		System.out.println("�������ѯ����ݣ�");
		
		while(true) {
			if(!input.hasNextInt()) {
				System.out.println("��������ȷ�����");
				input.next();
				continue;
			}
			year = input.nextInt();
			if(year <= 0) {
				System.out.println("��������ȷ�����");
			} else {
				break;
			}
		}
		
		//��������꣬isLeap = true
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			isLeap = true;
		}
		
		System.out.println("�������ѯ���·ݣ�");
		while(true) {
			if(!input.hasNextInt()) {
				System.out.print("��������ȷ���·ݣ�");
				input.next();
				continue;
			}
			month = input.nextInt();
			//�·�ֻ��12��
			if(month > 0 && month < 13) {
				break;
			}else {
				System.out.print("��������ȷ���·ݣ�");
			}
		}
		
		System.out.println("�������ѯ�����ڣ�");
		while(true) {
			if(!input.hasNextInt()) {
				System.out.print("��������ȷ���·ݣ�");
				input.next();
				continue;
			}
			day = input.nextInt();
			//���жϿ��ܵ�����
			if(day >= 1 && day <= 31) {
				//2�����У����������������Ӧ��С�ڵ���29
				if(month == 2) {
					if(isLeap && day <= 29) {
						break;
					} else if(day <= 28) {
						break;
					} else {
						System.out.print("��������ȷ�����ڣ�");
						continue;
					}
				}
				//�ж��·�Ϊ30���
				else if(month != 1 && month != 3 && month != 5 && month != 7 && month != 8 && month != 10 && month != 12) {
					if(day <= 30) {
						break;
					}
					else {
						System.out.print("��������ȷ�����ڷݣ�");
						continue;
					}
				}
				//����Ϊ31����·�һ������[1~31]
				else {
					break;
				}
			}
			//�����ϳ�������ڣ���Ҫ��������
			else {
				System.out.print("��������ȷ�����ڣ�");
			}
		}
		
		//���㵱ǰ�������ڵ�ǰ��ݵĶ�����
		int days = 0;
		int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for(int i = 0; i < month - 1; i++) {
			days += months[i];
		}
		days += day;
		if(isLeap && month > 2) {
			days++;
		}
		System.out.println(year + "-" + month + "-" + day + "��" + year + "��ĵ�" + days + "�죡");
		input.close();
	}
}



