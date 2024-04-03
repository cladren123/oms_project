package simolfire.studyProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import simolfire.studyProject.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
