package bartie.devops.apirequestchallenge.api.service;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import bartie.devops.apirequestchallenge.api.controller.ProductController;
import bartie.devops.apirequestchallenge.api.model.CategoryDTO;
import bartie.devops.apirequestchallenge.api.model.ProductDTO;
import bartie.devops.apirequestchallenge.app.exceptions.RequiredObjectIsNullException;

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
	{
		var list = controller.getAllProducts();

		if (list == null) throw new RequiredObjectIsNullException();

		logger.info(String.format("Get All Products! >> %s items", list.size()));

		return list; 
	}

	public List<ProductDTO> getAllProducts(Integer limit, Integer skip, String select )
	{ 
		var list = controller.getAllProducts(limit, skip, select);

		if (list == null) throw new RequiredObjectIsNullException();

		logger.info(String.format("Get Page Products! >> %s items", list.size()));

		return list; 
	 }

	public ProductDTO getProduct(Integer productId)
	{ 

		var product = controller.getProduct(productId);

		if (product == null) throw new RequiredObjectIsNullException();

		logger.info(String.format("Get Product! >> %s", product.getTitle()));

		logger.info("Get Product! >> " + product.getTitle());
	
		return product; 
	}
	
	public List<ProductDTO> searchProducts(String query)
	{ 

		var list = controller.searchProducts(query);

		if (list == null) throw new RequiredObjectIsNullException();

		logger.info(String.format("Search Products like '%s' >> %s items", query, list.size()));
	
		return list; 

	 }

	public List<CategoryDTO> getCategories()
	{ 

		var list = controller.getCategories();

		if (list == null) throw new RequiredObjectIsNullException();

		logger.info(String.format("Get All Categories! >> %s items", list.size()));
	
		return list;

	 }

	public List<ProductDTO> getProductsByCategory(String categoryName)
	{ 

		var list = controller.getProductsByCategory(categoryName);

		if (list == null) throw new RequiredObjectIsNullException();

		logger.info(String.format("Get All Products this category: '%s'>> %s items", categoryName, list.size()));
	
		return list; 

	 }

}
