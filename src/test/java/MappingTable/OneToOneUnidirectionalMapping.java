package MappingTable;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import MappingTable.Entity.Address;
import MappingTable.Entity.Order;
import MappingTable.Repository.OrderRepository;

@SpringBootTest
public class OneToOneUnidirectionalMapping {
	@Autowired
	private OrderRepository orderRepository;
	
//	@Test
//	public void saveOrder()
//	{
//		Order order=new Order();
//		      order.setOrderTrackingNumber("1233CDE");
//		      order.setTotalQuantity(2);
//		      order.setTotalPrice(new BigDecimal(5000));
//		      order.setStatus("In Progress");
//		      
//		Address address=new Address();
//		        address.setStreet("7A rajam nagar");
//		        address.setCity("madurai");
//		        address.setState("Tamilnadu");
//		        address.setZipcode("625003");
//		        
//		        order.setAddress(address);
//		        orderRepository.save(order);
//	}
//	
	@Test
	public void updateOrder()
	{
		Order order=orderRepository.findById(1l).get();
		      order.setTotalPrice(new BigDecimal(7000));
		      order.setTotalQuantity(5);
		      order.setStatus("delivered");
		      
		      order.getAddress().setCity("Trichy");
		      order.getAddress().setZipcode("635467");
		      orderRepository.save(order);
		      
	}

}
