package chapter5_1;

public class Student {

	//默认构造器
	public Student() {
		
	}
	
	//带参数构造器（参数也都是成员变量）
	public Student(String name,int age,String gender,String phone,String address,String email)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.phone=phone;
		this.address=address;
		this.email=email;
	}

	public static void main(String[] args) {
		Student stu =new Student();
		System.out.println(stu.getName());
		
	}
	
	//定义类的成员变量
	private String name;
	private int age;
	private String gender;
	private String phone;
	private String address;
	private String email;
	
	
	//定义成员变量的get/set方法
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name.length()>6||name.length()<2) {
			System.out.println("姓名有错误！");
			return;//表示结束该方法
		}else {
		this.name = name;//把这个形参输入的name传给this(指向student类的对象)
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age<=0||age>150){
			System.out.println("年龄有错误！");
			return;
		}else{
			this.age = age;
		}
	}

	public String getGender()
	{
		return gender;
	}
	public void setGender(String gender)
	{
		this.gender=gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

}
