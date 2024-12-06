import java.util.Scanner;

/**
 * 这是一个检查键盘输入的工具类
 * @author 向远洋
 * 下午2:32:59 2024年12月6日
 */
public class CheckUnit {
	/**获取一个整数：
	 * 先检查键盘录入的是不是整数，再返回录入的整数
	 * @return int
	 */
	public static int checkInt(Scanner input) {
		while(!input.hasNextInt()) {
			System.out.println("您输入的不是整数，请重新录入：");
			input.next();
		}
		return input.nextInt();
	}
	/**
	 * 检查键盘录入的是否输入某个范围的整数，并返回该整数
	 * @param input
	 * @return int
	 */
	public static int checkIntRange(Scanner input, int min, int max) {
		//获取一个整数
		int digit = checkInt(input);
		//判断录入的值是否在范围内
		while(digit < min || digit > max) {
			System.out.println("您输入的数字不合格，只能输入" + min + "-" + max + "范围的整数!\n");
			digit = checkInt(input);
		}
		return digit;
	}
	//----------------------------------------------------
	/**
	 * 获取一个double数
	 * 先检查录入的是否是double，再返回录入的double
	 * @return double
	 */
	public static double checkDouble(Scanner input) {
		while(!input.hasNextDouble()) {
			System.out.println("您输入的不是实数，请重新录入：");
			input.next();
		}
		return input.nextDouble();
	}
	/**
	 * 获取一个double数，并判断该实数是否在[min, max]范围内
	 * @return double
	 */
	public static double checkDoubleRange(Scanner input, double min, double max) {
		//获取一个实数
		double digit = checkDouble(input);
		//判断是否在[min, max]范围内
		while(digit < min || digit > max) {
			System.out.println("您输入的数字不合格，只能输入" + min + "-" + max + "范围的实数!\n");
			digit = checkDouble(input);
		}
		return digit;
	}
	
}
