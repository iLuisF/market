package mx.recursion.spring.market.persistence;

import mx.recursion.spring.market.persistence.crud.ProductCrudRepository;
import mx.recursion.spring.market.persistence.entity.Product;

import java.util.List;
import java.util.Optional;

public class ProductRepository {

    private ProductCrudRepository productRepository;

    public List<Product> getAll() {
        return (List<Product>) productRepository.findAll();
    }

    public List<Product> getByCategory(int idCategory) {
        return productRepository.findByIdCategoryOrderByNameAsc(idCategory);
    }

    public Optional<List<Product>> getEscasos(int quantity) {
        return productRepository.findByQuantityStockLessThanAndState(quantity, true);
    }
}
