package o.v.c.blank.models;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface PersonRepository extends MongoRepository<PersonModel, String> {
	public PersonModel save(PersonModel p);
	//public void update(PersonModel p);
	public List<PersonModel> findAll();
	public PersonModel getById(String id);
	// public void removePerson(String id);
}