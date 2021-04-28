package Main;

public class Main {
    public static void main(String[] args){
        Course course1 = new Course(001, "Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)", "ÜCRETSİZ");
        Course course2 = new Course(002, "Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)", "ÜCRETSİZ");
        Course course3 = new Course(003, "Programlamaya Giriş İçin Temel Kurs", "ÜCRETSİZ");

        Category category1 = new Category(01, "Programlama");

        Instructor instructor1 = new Instructor(1, "Engin Demirog");

        Course[] courses = {course1,course2,course3};

        for (Course course : courses){
            System.out.println(course.name);
        }

        Category[] categories = {category1};

        for(Category category : categories){
            System.out.println(category.name);
        }

        Instructor[] instructors = {instructor1};

        for (Instructor instructor : instructors){
            System.out.println(instructor.name);
        }

        CourseManager courseManager = new CourseManager();

        for (Course course : courses){
            if (course.price == "ÜCRETSİZ")
                courseManager.register(course);
            else
                courseManager.pay(course);
        }
    }
}
