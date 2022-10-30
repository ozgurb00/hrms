package java2021.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java2021.hrms.business.abstracts.PositionService;
import java2021.hrms.entities.concretes.Position;

@RestController
@RequestMapping("api/position")
public class ProductsController {
	private PositionService positionService;
	
	
	@Autowired
	public ProductsController(PositionService positionService) {
		this.positionService = positionService;
	}


	@GetMapping("/getAll")
	public List<Position> getAll() {
		return this.positionService.getAll();
	}
}
