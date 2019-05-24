package chapter5_1;

public class Student {

	//Ĭ�Ϲ�����
	public Student() {
		
	}
	
	//������������������Ҳ���ǳ�Ա������
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
	
	//������ĳ�Ա����
	private String name;
	private int age;
	private String gender;
	private String phone;
	private String address;
	private String email;
	
	
	//�����Ա������get/set����
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name.length()>6||name.length()<2) {
			System.out.println("�����д���");
			return;//��ʾ�����÷���
		}else {
		this.name = name;//������β������name����this(ָ��student��Ķ���)
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age<=0||age>150){
			System.out.println("�����д���");
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
