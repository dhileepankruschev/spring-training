import static org.junit.Assert.*;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

import com.cog.entity.Member;
import com.cog.repo.MemberRepository;


public class JPATest {

	@Test
	public void test() {
		EntityManagerFactory emf = Persistence.
				 createEntityManagerFactory("mypersistanceunit");
		
		Member member = new Member("priya2@gmail.com", "dskg");
		MemberRepository repository =  new MemberRepository();
		
		repository.addMember(member);
	}

}
