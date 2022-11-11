package thuctap.services;


import org.springframework.data.repository.CrudRepository;

import thuctap.model.Position;




public interface IChucvuSercives extends CrudRepository<Position, String> {
	
}
