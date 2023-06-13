package entity;

public class Student {
	private int id;
	private String Name;
	
	public Student(String Name) {
		super();
		id = generateNextId();
		this.Name = Name;
	}
	
	//method get id cũ
	@Deprecated
	public int getId() {
		return id;
	}
	
	//method get id mới
	public String getFormattedId() {
		return "MSV: " + id;
	}
	
	public String getName() {
		return Name;
	}
	
	public static int generateNextId() {
		return 0;
	}
}
