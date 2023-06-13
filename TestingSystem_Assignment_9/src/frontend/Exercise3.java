package frontend;

import entity.CPU;
import entity.Car;
import entity.NgayThangNam;
import entity.OuterClass;
import entity.NgayThangNam.GioPhutGiay;
import entity.OuterClass.InnerClass;

public class Exercise3 {
	public static void main(String[] args) {
		Question4();
	}
	
	public static void Question1() {
		CPU cpu = new CPU(500.0);
		CPU.Processor processor = cpu.new Processor(4, "Intel");
		CPU.Ram ram = cpu.new Ram(32, "Kingston");
		System.out.println("Processor Information: ");
		System.out.println("Processor Cache: " + processor.getCache());
		System.out.println("Clock Speed Ram: " + ram.getClockSpeed());
	}
	
	public static void Question2() {
		Car car = new Car("Mazda", "8WD");
		Car.Engine engine = car.new Engine("Crysler");
		System.out.println("Thông tin xe: " + car);
		System.out.println("Thông tin động cơ: " + engine);
	}
	
	public static void Question3() {
		OuterClass outerClass = new OuterClass();
		outerClass.show();
		InnerClass innerClass = outerClass.new InnerClass();
		innerClass.show();
	} 
	
	public static void Question4() {
		NgayThangNam date = new NgayThangNam();
		date.ngay = 13;
		date.thang = 6;
		date.nam = 2023;
		
		GioPhutGiay time = date.new GioPhutGiay();
		time.gio = 13;
		time.phut = 53;
		time.giay = 30;
		
		time.xuatThongTin();
	}
}
