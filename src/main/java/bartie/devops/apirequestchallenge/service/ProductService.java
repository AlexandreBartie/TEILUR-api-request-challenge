package bartie.devops.apirequestchallenge.service;

import java.util.List;

import org.springframework.stereotype.Service;

import bartie.devops.apirequestchallenge.contract.ProductInterface;

@Service
public class ProductService<P, C> implements ProductInterface<P, C> {

	public List<P> getAllProducts()
	{ return null; }

	public List<P> getAllProducts(int limit, int skip, String... fields)
	{ return null; }

	public P getProduct(Integer productId)
	{ return null; }
	
	public List<P> searchProducts(String query)
	{ return null; }

	public List<C> getCategories()
	{ return null; }

	public List<P> getProductsByCategory(String categoryName)
	{ return null; }
}
