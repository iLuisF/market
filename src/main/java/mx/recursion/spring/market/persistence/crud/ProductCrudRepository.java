package mx.recursion.spring.market.persistence.crud;

import mx.recursion.spring.market.persistence.entity.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductCrudRepository extends CrudRepository<Product, Integer> {

    List<Product> findByIdCategoryOrderByNameAsc(int idCategory);

    Optional<List<Product>> findByQuantityStockLessThanAndState(int quantityStock, boolean state);

}
