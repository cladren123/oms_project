package simolfire.studyProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import simolfire.studyProject.entity.Brand;

public interface BrandRepository extends JpaRepository<Brand, Integer> {
}
