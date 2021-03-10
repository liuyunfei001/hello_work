package array;

import java.util.Formatter;

public class Demo1 {
  //理解二维数组
	public static void main(String[] args) {
		//使用二维数组(结构，存储)
		//1.定义二维数组
		//数据类型[][] 数组名=new  数据类型[行数][列数];
		//String [][]twoary=new String[3][3];
		//2.赋值
		//数组名[行索引][列索引]=值;
		/*twoary[0][0]="张三";
		twoary[0][1]="李四";
		twoary[0][2]="麻子";
		twoary[1][0]="杨过";
		twoary[1][1]="小龙女";
		twoary[1][2]="老王";
		twoary[2][0]="小桂子";
		twoary[2][1]="小李子";
		twoary[2][2]="小麻子";*/
		
		//3.定义二维数组并初始化
		String [][]twoary={
				{"张三","李四","麻子"},
				{"杨过","小龙女","老王"},
				{"小桂子","小李子","小麻子"}
		};
	
		
		
		
		//获取数据
		//数组名[行][列];
		//System.out.println(twoary[1][1]);
		//二重循环控制二维数组
		for(int i=0;i<twoary.length;i++){  //控制行
			for(int j=0;j<twoary[i].length;j++){ //控制列
				System.out.print(twoary[i][j]+"\t");	
			}
			System.out.println();
		}
	}
}
