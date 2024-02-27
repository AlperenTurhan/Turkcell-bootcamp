package gun3.layeredArchitectureDemo;

import org.example.business.CategoryManager;
import org.example.business.CourseManager;
import org.example.business.TeacherManager;
import org.example.core.logging.DatabaseLogger;
import org.example.core.logging.FileLogger;
import org.example.core.logging.Logger;
import org.example.core.logging.MailLogger;
import org.example.dataAccess.HibernateDao;
import org.example.dataAccess.JdbcDao;
import org.example.entities.Category;
import org.example.entities.Course;
import org.example.entities.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Course course = new Course();
        course.setName("Java");
        course.setDescription("oop kavramları");
        course.setUnitPrice(100);
        Category category = new Category();
        category.setId(1);
        category.setName("Programlama");
        Teacher teacher = new Teacher();
        teacher.setName("Engin");

        List<Logger> loggers=new ArrayList<>();
        loggers.add(new DatabaseLogger());
        loggers.add(new FileLogger());
        CourseManager courseManager = new CourseManager(new HibernateDao(),loggers);
        courseManager.add(course);
        CategoryManager categoryManager = new CategoryManager(new JdbcDao(),loggers);
        categoryManager.add(category);
        TeacherManager teacherManager = new TeacherManager(new HibernateDao(),loggers);
        teacherManager.add(teacher);
    }
}