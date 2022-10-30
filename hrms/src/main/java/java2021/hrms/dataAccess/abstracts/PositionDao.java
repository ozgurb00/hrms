package java2021.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import java2021.hrms.entities.concretes.Position;

public interface PositionDao extends JpaRepository<Position,Integer>{
	
}
