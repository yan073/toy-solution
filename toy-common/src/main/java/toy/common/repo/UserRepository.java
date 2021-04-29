package toy.common.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import toy.common.data.User;

public interface UserRepository  extends MongoRepository<User, String>{

}
