

import java.util.Scanner;

/**
 * 年月日查询，判断当前日期在该年哪一天
 */
public class Days {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int year, month, day;
		boolean isLeap = false;
		System.out.println("请输入查询的年份：");
		
		while(true) {
			if(!input.hasNextInt()) {
				System.out.println("请输入正确的年份");
				input.next();
				continue;
			}
			year = input.nextInt();
			if(year <= 0) {
				System.out.println("请输入正确的年份");
			} else {
				break;
			}
		}
		
		//如果是闰年，isLeap = true
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			isLeap = true;
		}
		
		System.out.println("请输入查询的月份：");
		while(true) {
			if(!input.hasNextInt()) {
				System.out.print("请输入正确的月份：");
				input.next();
				continue;
			}
			month = input.nextInt();
			//月份只有12个
			if(month > 0 && month < 13) {
				break;
			}else {
				System.out.print("请输入正确的月份：");
			}
		}
		
		System.out.println("请输入查询的日期：");
		while(true) {
			if(!input.hasNextInt()) {
				System.out.print("请输入正确的月份：");
				input.next();
				continue;
			}
			day = input.nextInt();
			//先判断可能的日期
			if(day >= 1 && day <= 31) {
				//2月特判，如果是闰年则日期应该小于等于29
				if(month == 2) {
					if(isLeap && day <= 29) {
						break;
					} else if(day <= 28) {
						break;
					} else {
						System.out.print("请输入正确的日期：");
						continue;
					}
				}
				//判断月份为30天的
				else if(month != 1 && month != 3 && month != 5 && month != 7 && month != 8 && month != 10 && month != 12) {
					if(day <= 30) {
						break;
					}
					else {
						System.out.print("请输入正确的日期份：");
						continue;
					}
				}
				//日期为31天的月份一定符合[1~31]
				else {
					break;
				}
			}
			//不符合常理的日期，需要重新输入
			else {
				System.out.print("请输入正确的日期：");
			}
		}
		
		//计算当前日期属于当前年份的多少天
		int days = 0;
		int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for(int i = 0; i < month - 1; i++) {
			days += months[i];
		}
		days += day;
		if(isLeap && month > 2) {
			days++;
		}
		System.out.println(year + "-" + month + "-" + day + "是" + year + "年的第" + days + "天！");
		input.close();
	}
}



