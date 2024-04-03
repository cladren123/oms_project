package simolfire.studyProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import simolfire.studyProject.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
