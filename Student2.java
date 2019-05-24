package chapter5_1;

//注意：同一级目录下不用import Student类，本例所用的Student类在Student.java文件中。

public class Student2 {

	public static void main(String[] args) {
		// 定义一个Student类的数组，用来保存多个Student类的对象作为通讯录数据
		Student[] st =new Student[3];
		st[0]= new Student("刘培放",28,"男","13129903402","信阳","lpfwhu@163.com");
		st[1]= new Student("刘卓",29,"男","19734562357","襄阳","liuzhuo@163.com");
		st[2]= new Student("蔡彦鑫",27,"男","17638578816","宜昌","caiyanxin@163.com");
		
		 String str = args[0];//args[0]就是传进来数组的第一个值
		 
		// 标志位,用来判定是否有不存在姓名的情况出现
	        int flagFind = 0;
	        
	  for(int i=0;i<=st.length;i++)
	  {
		  if(str.equals(st[i].getName())||str.equals(st[i].getEmail())||str.equals(st[i].getAddress())) {
			  System.out.println("查询到姓名："+st[i].getName());
		  }
		  flagFind++;
	  }
	  
	  if(flagFind==0) {
		  System.out.println("没有查询到有效结果！");
	  }
	  
	}
	
	
	public Student2() {
		
	}

}
