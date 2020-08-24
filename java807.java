package week8;
import javax.swing.JOptionPane;
public class java807 {
	public static void main(String[]args) {
		String wagaString,dependentsTring;
		double wage,weeklyPay;
		int dependents;
		final double HOURS_IN_WEEK =37.5;
		//ป้อนค่าจ้างรายชั่วโมงของพนักงาน
		wagaString =JOptionPane.showInputDialog(null,"ป้อนค่าจ้างรายชั่วโมงของพนักงาน",
				"Salary dialog 1",JOptionPane.INFORMATION_MESSAGE);
		
		weeklyPay=Double.parseDouble(wagaString)*HOURS_IN_WEEK;
		//มีผู้อยู่ในอุปการะกี่คน
		dependentsTring=JOptionPane.showInputDialog(null,"มีผู้อยู่ในอุปการะกี่คน?",
				"Salary dialog 2",JOptionPane.QUESTION_MESSAGE);
		//เงินเดือนรายสัปดาห์คือ $ //จะมีการหักเงินสำหรับ "+ ผู้อยู่ในอุปการะ"
		dependents=Integer.parseInt(dependentsTring);
		JOptionPane.showConfirmDialog(null, "weekly salary is $"
		+weeklyPay+"\nDeductions will be made for "+dependents+" dependents");
		//ผลรวมต้องจ่ายเงิน
		System.out.println("weekly salary is $"
				+weeklyPay+"\nDeductions will be made for "+dependents+" dependents");
		System.out.println("ต้องจ่ายเงินรวม = "+ weeklyPay*dependents+" $");
	}
}
