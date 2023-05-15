package bartie.devops.apirequestchallenge.service;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import bartie.devops.apirequestchallenge.controller.ProductController;
import bartie.devops.apirequestchallenge.exceptions.RequiredObjectIsNullException;
import bartie.devops.apirequestchallenge.model.CategoryDTO;
import bartie.devops.apirequestchallenge.model.ProductDTO;

@Service
public class ProductService
{

	private ProductController controller;

	private Logger logger;

    public ProductService() {
		controller = new ProductController();
		logger = Logger.getLogger(ProductService.class.getName());
    }

	public List<ProductDTO> getAllProducts()
	{ return null; }

	public List<ProductDTO> getAllProducts(int limit, int skip, String... fields)
	{ return null; }

	public ProductDTO getProduct(Integer productId)
	{ 

		var product = controller.getProduct(productId);

		if (product == null) throw new RequiredObjectIsNullException();

		logger.info("Get Product! >> " + product.getTitle());
	
		return product; 
	}
	
	public List<ProductDTO> searchProducts(String query)
	{ return null; }

	public List<CategoryDTO> getCategories()
	{ return null; }

	public List<ProductDTO> getProductsByCategory(String categoryName)
	{ return null; }
}
