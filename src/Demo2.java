
public class Demo2 {

	/**
	 * 理解数据类型
	 */
	public static void main(String[] args) {
       //存个人信息:姓名，年龄，身高，体重，性别
		String name="王建兵";
	    int age=18;
		float height=1.75f;  //注意:输入小数默认支持double
		double weight=75.5;
		char sex='女';
		
		System.out.println("姓名是:"+name);
		System.out.println("年龄是:"+age);
     	System.out.println("身高是"+height+"cm\n体重是"+weight+"kg");
		System.out.println("性别是:"+sex);
		
	}

}
