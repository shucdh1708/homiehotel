package thuctap.services;

import org.springframework.data.repository.CrudRepository;

import thuctap.model.HourlyParameters;

public interface ThongSoTheoGioService extends CrudRepository<HourlyParameters, Integer> {

}
