package springcrud.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import springcrud.model.Product;

@Component
public class ProductDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Transactional
	public void createProduct(Product product) {
		this.hibernateTemplate.saveOrUpdate(product);
	}
	
	public List<Product> getProducts(){
		return this.hibernateTemplate.loadAll(Product.class);
	}
	@Transactional
	public void delete(int id) {
		Product p = this.hibernateTemplate.load(Product.class, id);
		this.hibernateTemplate.delete(p);
	}
	public Product getSingeProduct(int id) {
		return this.hibernateTemplate.get(Product.class, id);
	}

}
