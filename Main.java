package oopHomeWork;

public class Main {

	public static void main(String[] args) {
		Course course1=new Course(1,"Engin Demiroð","Yazýlým Geliþtirici Geliþtirme Kampý ((C#) + Angular)");
		
		Course course2=new Course(2,"Engin Demiroð","Yazýlým Geliþtirici Geliþtirme Kampý (java + react)");
		
		Course course3=new Course(3,"Engin Demiroð","Proglamlamya Giriþ için Kemel Kurs");
		
		Course[] courses= {course1,course2,course3};
		
		for(Course course:courses) {
			System.out.println(course.courseName);
		}
		
		
		

		DailySchedule schedule1=new DailySchedule("1.gün ","Ders Programý","ödev 1","Deðerlendirme");
		DailySchedule schedule2=new DailySchedule("2.gün ","Ders Programý","ödev 1","Deðerlendirme");
		DailySchedule schedule3=new DailySchedule("3.gün ","Ders Programý","ödev 1","Deðerlendirme");
		
		DailySchedule[] schedules= {schedule1,schedule2,schedule3};
		
		for(DailySchedule schedule:schedules ) {
			System.out.println(schedule.day);
		}
		
		
		IsManager ýsManagerSchedule=new IsManager();
		ýsManagerSchedule.ýsEndAndContinue(schedule1);

		
		IsManager ýsManagerCourse=new IsManager();
		ýsManagerCourse.starTheCourse(course1);
	}

}
