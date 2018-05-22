package course4;

class Student {
	private String name;
	private char sex;
	private long id;
	private String classinfo;
	private String address;

	public Student(long No) {
		this.id = No;
	}

	public Student(String name, char sex, Long id) {
		this.name = name;
		this.sex = sex;
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setAddress(String add) {
		this.address = add;
	}

	public void setClass(String classinfo) {
		this.classinfo = classinfo;
	}

	public String toString() {
		return String.format("姓名为：%s\n性别为：%c\n学号为：%d\n班级为：%s\n住址为:%s\n", name, sex, id, classinfo, address);
	}
}

public class TestStudent {
	public static void main(String[] args) {
		Student aGirl = new Student("李丽", '女', (long) 2503123);
		aGirl.setAddress("天津市河北区志成道7号");
		aGirl.setClass("2005计算机3班");
		System.out.println(aGirl.toString());
	}
}
