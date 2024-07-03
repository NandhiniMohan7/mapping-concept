package MappingTable.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import MappingTable.Entity.User;

public interface UserRepository extends JpaRepository<User,Long>{

}

