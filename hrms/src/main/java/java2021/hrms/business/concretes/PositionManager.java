package java2021.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java2021.hrms.business.abstracts.PositionService;
import java2021.hrms.dataAccess.abstracts.PositionDao;
import java2021.hrms.entities.concretes.Position;

@Service
public class PositionManager implements PositionService{
	
	private PositionDao positionDao;
	
	
	@Autowired
	public PositionManager(PositionDao positionDao) {
		this.positionDao = positionDao;
	}



	@Override
	public List<Position> getAll() {
		return this.positionDao.findAll();
	}

}
