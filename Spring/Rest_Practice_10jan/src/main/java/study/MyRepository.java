package study;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import study.entity.EmployeeEntity;


@Repository //repository is interface
public interface MyRepository extends JpaRepository<EmployeeEntity, Integer>  {
	public List<EmployeeEntity> findBySalary(int salary);
	public List<EmployeeEntity> findByName(String name);
	public List<EmployeeEntity> findByJob(String job);

}
