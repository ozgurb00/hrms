package java2021.hrms.business.abstracts;

import java.util.List;

import java2021.hrms.entities.concretes.Position;

public interface PositionService {
	List<Position> getAll();
}
