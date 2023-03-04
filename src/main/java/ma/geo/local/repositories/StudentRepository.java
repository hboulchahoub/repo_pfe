package ma.geo.local.repositories;

import ma.geo.local.entities.StudentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("repo1")
public interface StudentRepository extends CrudRepository<StudentEntity,Long> {

}
