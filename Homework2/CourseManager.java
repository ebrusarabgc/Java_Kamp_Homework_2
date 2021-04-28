package Main;

public class CourseManager {
    public void register(Course course){
        System.out.println(course.name + " dersine katılım gerçekleşti, dersin sayfasına yönlendiriliyor...");
    }
    public void pay(Course course){
        System.out.println(course.name + " dersi için ödeme sayfasına yönlendiriliyor...");
    }
}
