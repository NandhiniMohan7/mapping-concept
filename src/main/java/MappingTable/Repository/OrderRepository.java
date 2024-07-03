package MappingTable.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import MappingTable.Entity.Order;

public interface OrderRepository extends JpaRepository<Order,Long>{
	

}
