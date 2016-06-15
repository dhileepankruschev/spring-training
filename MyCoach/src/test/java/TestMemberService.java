import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cog.entity.Member;
import com.cog.service.MemberService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans.xml")
public class TestMemberService {
	
	@Autowired
	private MemberService memberService;

	/*@Before
	public void setup(){
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml"); 
		calc = context.getBean(Calculator.class);
	}*/

	@Test
	public void testAddMember(){
		Member member = new Member("ravi@gmail.com", "kdskd");
	
		boolean result = memberService.addMember(member);
		System.out.println(result);
		assertEquals("member should be added", true, result);
		
	}
	
	
	

}
