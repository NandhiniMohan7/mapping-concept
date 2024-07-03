package MappingTable.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import MappingTable.Entity.Role;

public interface RoleRepository  extends JpaRepository<Role,Long> {

}
