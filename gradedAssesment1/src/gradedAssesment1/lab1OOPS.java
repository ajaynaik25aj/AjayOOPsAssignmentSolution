package gradedAssesment1;

class SuperDepartment{
	char departmentName() {
		System.out.println("Super Department");
		return 'a';
	}
	char getTodaysWork() {
		System.out.println("No Work As of now");
		return'b';
	}
	char getWorkDeadline() {
		System.out.println("Nil");
		return'c';
	}
	char isTodayAHoliday() {
		System.out.println("Today is not a holiday");
		return'd';
	}
	char doActivity() {
		return'u';
	}
	char getTechStackInformation() {
		return'y';
	}
}
class AdminDepartment extends SuperDepartment{
	char departmentName() {
		System.out.println("Welcome to Admin Department");
		return'e';
	}
	char getTodaysWork() {
		System.out.println("Comlete your documents submission");
		return'f';
	}
	char getWorkDeadline() {
		System.out.println("Complete by EOD");
		return'g';
	}	
}
class HrDepartment extends SuperDepartment{
	char departmentName() {
		System.out.println("Welcome to Hr Department");
		return'h';
	}
	char getTodaysWork() {
		System.out.println("Fill today's worksheet and mark your attendance");
		return'i';
	}
	char getWorkDeadline() {
		System.out.println("Complete by EOD");
		return'j';
	}
	char doActivity() {
		System.out.println("team lunch");
		return'k';
	}
}
class TechDepartment extends SuperDepartment{
	char departmentName() {
		System.out.println("Welcome to Tech Department");
		return'l';
	}
	char getTodaysWork() {
		System.out.println("Complete coding of module 1");
		return'm';
	}
	char getWorkDeadline() {
		System.out.println("Complete by EOD");
		return'n';
	}
	char getTechStackInformation() {
		System.out.println("core java");
		return'o';
	}
}
public class lab1OOPS{
public static void main(String[] args) {
	SuperDepartment obj1=new SuperDepartment();
	//obj1.departmentName();
	//obj1.getTodaysWork();
	//obj1.getWorkDeadline();
	//obj1.isTodayAHoliday();
	
	System.out.println(" ");
	
	SuperDepartment obj2=new AdminDepartment();
	obj2.departmentName();
	obj2.getTodaysWork();
	obj2.getWorkDeadline();
	obj1.isTodayAHoliday();
	
	System.out.println(" ");
	
	SuperDepartment obj3=new HrDepartment();
	obj3.departmentName();
	obj3.getTodaysWork();
	obj3.getWorkDeadline();
	obj1.isTodayAHoliday();
	
	System.out.println(" ");
	
	SuperDepartment obj4=new TechDepartment();
	obj4.departmentName();
	obj4.getTodaysWork();
	obj4.getWorkDeadline();
	obj4.getTechStackInformation();
	obj1.isTodayAHoliday();
}
}

