package jwt.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import jwt.entity.User;

@Repository
public interface UserDao extends CrudRepository<User, String> {
}
