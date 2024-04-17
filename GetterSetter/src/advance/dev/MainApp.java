package advance.dev;

import java.util.Scanner;
import java.util.Arrays;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Student[] students = new Student[10]; // Khởi tạo mảng chứa 10 sinh viên

	        input(students); // Nhập thông tin sinh viên
	        print(students); // In thông tin sinh viên
	        sortByAverageScore(students); // Sắp xếp sinh viên theo điểm trung bình
	        System.out.println("Danh sách sinh viên sau khi sắp xếp theo điểm trung bình:");
	        print(students); // In danh sách sinh viên sau khi sắp xếp
	    }

	    public static void input(Student[] students) {
	        Scanner scanner = new Scanner(System.in);
	        for (int i = 0; i < students.length; i++) {
	            System.out.println("Nhập thông tin cho sinh viên thứ " + (i + 1) + ":");
	            System.out.print("Tên: ");
	            String name = scanner.nextLine();
	            System.out.print("Tuổi: ");
	            int age = scanner.nextInt();
	            scanner.nextLine(); // Đọc bỏ dòng trống
	            System.out.print("Địa chỉ: ");
	            String address = scanner.nextLine();
	            System.out.print("Số điện thoại: ");
	            String phoneNumber = scanner.nextLine();
	            System.out.print("Điểm trung bình: ");
	            double averageScore = scanner.nextDouble();
	            scanner.nextLine(); // Đọc bỏ dòng trống

	            // Tạo đối tượng sinh viên và thêm vào mảng
	            students[i] = new Student(name, age, address, phoneNumber, averageScore);
	        }
	        scanner.close(); // Đóng Scanner sau khi sử dụng xong
	    }

	    public static void print(Student[] students) {
	        for (int i = 0; i < students.length; i++) {
	            System.out.println("Thông tin sinh viên thứ " + (i + 1) + ":");
	            System.out.println("Tên: " + students[i].getName());
	            System.out.println("Tuổi: " + students[i].getAge());
	            System.out.println("Địa chỉ: " + students[i].getAddress());
	            System.out.println("Số điện thoại: " + students[i].getPhoneNumber());
	            System.out.println("Điểm trung bình: " + students[i].getAverageScore());
	        }
	    }

	    public static void sortByAverageScore(Student[] students) {
	        Arrays.sort(students, (a, b) -> Double.compare(a.getAverageScore(), b.getAverageScore()));
	}

}
