import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cog.repo.StudentRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config.xml")
public class TestCalculator {
	
	@Autowired
	private StudentRepository studentRepository;

	/*@Before
	public void setup(){
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml"); 
		calc = context.getBean(Calculator.class);
	}*/

	@Test
	public void testStudentCount(){
	
		int result = studentRepository.getStudentCount();
		System.out.println(result);
		assertEquals("student count should be 2", 2, result);
		
	}
	
	
	

}
