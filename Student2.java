package chapter5_1;

//ע�⣺ͬһ��Ŀ¼�²���import Student�࣬�������õ�Student����Student.java�ļ��С�

public class Student2 {

	public static void main(String[] args) {
		// ����һ��Student������飬����������Student��Ķ�����ΪͨѶ¼����
		Student[] st =new Student[3];
		st[0]= new Student("�����",28,"��","13129903402","����","lpfwhu@163.com");
		st[1]= new Student("��׿",29,"��","19734562357","����","liuzhuo@163.com");
		st[2]= new Student("������",27,"��","17638578816","�˲�","caiyanxin@163.com");
		
		 String str = args[0];//args[0]���Ǵ���������ĵ�һ��ֵ
		 
		// ��־λ,�����ж��Ƿ��в������������������
	        int flagFind = 0;
	        
	  for(int i=0;i<=st.length;i++)
	  {
		  if(str.equals(st[i].getName())||str.equals(st[i].getEmail())||str.equals(st[i].getAddress())) {
			  System.out.println("��ѯ��������"+st[i].getName());
		  }
		  flagFind++;
	  }
	  
	  if(flagFind==0) {
		  System.out.println("û�в�ѯ����Ч�����");
	  }
	  
	}
	
	
	public Student2() {
		
	}

}
