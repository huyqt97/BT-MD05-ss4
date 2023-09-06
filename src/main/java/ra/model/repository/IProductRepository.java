package ra.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ra.model.entity.Product;

public interface IProductRepository extends JpaRepository<Product ,Long> {
 }
