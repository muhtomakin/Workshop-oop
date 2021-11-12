
public class Main {

	public static void main(String[] args) {
		Educator educator1 = new Educator("Engin Demirog");
		Educator educator2 = new Educator("Ahmet Cetintas");
		Educator[] educators = {educator1, educator2};
		
		System.out.println("Educators in Kodlama.io: ");
		for (Educator educator : educators) {
			System.out.println(educator.name);
		} 
		
		System.out.println("------------------");
		
		Course course1 = new Course(1, "Java", 72);
		Course course2 = new Course(2, "JavaScript", 32);
		
		Course[] courses = {course1, course2};
		for ( Course course : courses) {
			System.out.println(course.name + " course's currently status: %" + course.status);
		}
		System.out.println("------------------");
		
		
		CourseManager courseManager = new CourseManager();
		courseManager.attendance(course1);
		courseManager.attendance(course2);
		
	}

}
