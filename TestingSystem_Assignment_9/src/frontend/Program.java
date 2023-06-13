package frontend;

import java.util.Date;

import entity.Student;

public class Program {
	public static void main(String[] args) {
		Question2();
	}

	
	public static void Question1(){
		@SuppressWarnings("deprecation")
		Date date = new Date(2020, 05, 18);
		System.out.println(date);
	}
	
	public static void Question2(){
		Student student = new Student("Nguyễn Văn A");
		System.out.println("Name: " + student.getName());
		//sử dụng method get id mới
		System.out.println(student.getFormattedId());
	}
}
