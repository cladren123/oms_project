package simolfire.studyProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import simolfire.studyProject.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
