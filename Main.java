package oopHomeWork;

public class Main {

	public static void main(String[] args) {
		Course course1=new Course(1,"Engin Demiro�","Yaz�l�m Geli�tirici Geli�tirme Kamp� ((C#) + Angular)");
		
		Course course2=new Course(2,"Engin Demiro�","Yaz�l�m Geli�tirici Geli�tirme Kamp� (java + react)");
		
		Course course3=new Course(3,"Engin Demiro�","Proglamlamya Giri� i�in Kemel Kurs");
		
		Course[] courses= {course1,course2,course3};
		
		for(Course course:courses) {
			System.out.println(course.courseName);
		}
		
		
		

		DailySchedule schedule1=new DailySchedule("1.g�n ","Ders Program�","�dev 1","De�erlendirme");
		DailySchedule schedule2=new DailySchedule("2.g�n ","Ders Program�","�dev 1","De�erlendirme");
		DailySchedule schedule3=new DailySchedule("3.g�n ","Ders Program�","�dev 1","De�erlendirme");
		
		DailySchedule[] schedules= {schedule1,schedule2,schedule3};
		
		for(DailySchedule schedule:schedules ) {
			System.out.println(schedule.day);
		}
		
		
		IsManager �sManagerSchedule=new IsManager();
		�sManagerSchedule.�sEndAndContinue(schedule1);

		
		IsManager �sManagerCourse=new IsManager();
		�sManagerCourse.starTheCourse(course1);
	}

}
