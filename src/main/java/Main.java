import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@Configuration
public class Main {
	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("appConfig.xml");
		
		
		Employee emp = context.getBean("emp", Employee.class);
//		emp.setEid(101);
//		emp.setEname("Spring Framework Autowire Demo");
		emp.showEployeeDetails();
		}
}
