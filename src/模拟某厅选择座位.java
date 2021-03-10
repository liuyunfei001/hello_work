

import java.util.Scanner;

public class 模拟某厅选择座位 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
        //影厅  8排8列
		//1.查看座位情况  2.选择座位
		String [][] seats=new String[8][8];
		//循环初始化值
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				seats[i][j]="未选";
			}
		}
		
		do{
		System.out.println("欢迎影厅选座系统.");
		System.out.println("1.查看座位情况   2.选择座位  3.退座位");
		int control=input.nextInt();
		switch (control) {
		case 1:
			System.out.println("座位情况");
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8; j++) {
					System.out.print(seats[i][j]+"\t");
				}
				System.out.println("");
			} 
			break;
		case 2:
			 System.out.println("请选择第几排:");
			 int row=input.nextInt(); 
			 System.out.println("请选择第几列:");
			 int col=input.nextInt(); 
			 if(seats[row-1][col-1].equals("已选"))
			 {
				 System.out.println("已被其它人选啦，请换一个"); 
			 }
			 else
			 {
			 seats[row-1][col-1]="已选";
			 System.out.println("选座成功");
			 }
			break;
		case 3:
			 System.out.println("请选择第几排:");
			 int row1=input.nextInt(); 
			 System.out.println("请选择第几列:");
			 int col1=input.nextInt(); 
			 if( seats[row1-1][col1-1].equals("未选"))
			 {
				System.out.println("此座位还没售出，请看清楚再退"); 
			 }
			 else
			 {
			 seats[row1-1][col1-1]="未选";
			 System.out.println("退座成功");
			 }
			break;
		}
		}while(true);
	}

}
