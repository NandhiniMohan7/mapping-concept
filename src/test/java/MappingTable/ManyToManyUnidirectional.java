package MappingTable;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import MappingTable.Entity.Role;
import MappingTable.Entity.User;
import MappingTable.Repository.UserRepository;

@SpringBootTest
public class ManyToManyUnidirectional {
	
	@Autowired
	private UserRepository userRepository;
	
	@Test
	public void saveUserAndRole()
	{
		User user=new User();
		     user.setFirstName("Nandhu");
		     user.setLastName("sri");
		     user.setEmail("nandhu@gmail.com");
		     user.setPassword("nandhu123");
		     
		Role admin=new Role();
		     admin.setRoleName("USER_ADMIN");
		Role developer=new Role();
		     developer.setRoleName("USER_DEVELOPER");
		     
		user.getRoles().add(admin);
		user.getRoles().add(developer);
		
		userRepository.save(user);
		
		
	}
	
//	@Test
//	public void updateUser()
//	{
//		User user=userRepository.findById(1l).get();
//		     user.setFirstName("Ashwin");
//		     user.setLastName("sai");
//		     
//		 Role role=new Role();
//		      role.setRoleName("SOFTWEAR TESTING");
//		   user.getRoles().add(role);
//		   userRepository.save(user);
//	}
	
	

}
