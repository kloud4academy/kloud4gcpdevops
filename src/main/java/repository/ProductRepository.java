package repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import model.ProductEntity;

@Repository
public interface ProductRepository extends MongoRepository<ProductEntity, String> {

	@Query(value="{category:'?0'}")
	List<ProductEntity> findAll(String category);
	@Query(value="{productId:'?0'}")
	ProductEntity findAllById(String productId);
	
}
