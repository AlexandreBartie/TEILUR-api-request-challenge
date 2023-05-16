package bartie.devops.apirequestchallenge.contract;

import java.util.List;

// Note: Convert this class to concrete class and add implementation (missing body) to all methods. You will remove the word
// `abstract` everywhere. This class is only kept `abstract` for the sake of interview exercise.
public interface AppFeaturesInterface<T, C> {

	/**
	 * Prints the titles of all products that have a rating less than or equal to the provided criteria.
	 * @param rating The rating threshold.
	 */
	public abstract void getProductTitlesByWorseRating(double rating);

	/**
	 * Returns the cart with the highest total value.
	 * @returns The cart with the highest total value.
	 */
	public abstract C getCartWithHighestTotal();

	/**
	 * Returns the cart with the lowest total value.
	 * @returns The cart with the lowest total value.
	 */
	public abstract C getCartWithLowestTotal();

	/**
	 * Enriches the product information in a user's cart by adding product images.
	 * The current product information in a cart has limited fields.
	 * This method adds the `images` field for each product in a given user's cart.
	 * Note: This method only applies to the first element from the `carts[]` JSON response.
	 * @param userId The ID of the user whose cart's product information will be enriched.
	 * @returns A list of products with enriched information in the user's cart.
	 */
	public abstract List<T> addProductImagesToUserCart(Integer userId);
}