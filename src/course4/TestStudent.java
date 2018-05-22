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
		return String.format("����Ϊ��%s\n�Ա�Ϊ��%c\nѧ��Ϊ��%d\n�༶Ϊ��%s\nסַΪ:%s\n", name, sex, id, classinfo, address);
	}
}

public class TestStudent {
	public static void main(String[] args) {
		Student aGirl = new Student("����", 'Ů', (long) 2503123);
		aGirl.setAddress("����кӱ���־�ɵ�7��");
		aGirl.setClass("2005�����3��");
		System.out.println(aGirl.toString());
	}
}
