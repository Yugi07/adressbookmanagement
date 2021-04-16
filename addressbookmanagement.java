package addressbookmanagement;

public class addressbookmanagement {

	private int id;
	private String name;
	private int age;
	private double source;

	public Student() {
		super();
	}

	public Student(int id, String name, int age, double source) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.source = source;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSource() {
		return source;
	}

	public void setSource(double source) {
		this.source = source;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", source=" + source + "]";
	}
	

	}

}
