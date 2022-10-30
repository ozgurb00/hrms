package java2021.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="positions")
public class Position {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String positionName;
	
	public Position() {
		
	}

	public Position(int id, String positionName) {
		this.id = id;
		this.positionName = positionName;
	}
	
	
}
