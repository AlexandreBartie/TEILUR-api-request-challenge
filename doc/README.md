## TestMart: An E-commerce Shopping Cart Exercise
This exercise involves working with dummy API endpoints related to an e-commerce shopping cart. Each endpoint returns a JSON-formatted response. Implement the required business functionality by processing these responses and integrating them into your solution.
- Build System: Utilize Gradle for building and managing the project.
- Language: Choose either __Java__ or __Kotlin__ for implementing the solution. (See below for `JavaScript` or `TypeScript` specific changes)
- Design Principle: Opt for object composition over inheritance to promote modularity and flexibility.
- Separation of Concerns: Ensure that functionalities are not mixed; adhere to the *Single Responsibility Principle* for clear code organization.
- DRY Principle: Avoid code repetition by reusing existing code or creating reusable components.
- Testing: Develop `JUnit` tests to verify the correctness and robustness of your solution.
- Logging: Integrate logging to provide better insights during debugging.
- Interface Implementation: Thoroughly implement all methods in the given interfaces ([CartService.java](model%2Fcontract%2FCartService.java),
[ProductService.java](model%2Fcontract%2FProductService.java), [UserService.java](src%2Fmain%2Fjava%2Forg%2Fddm%2Ftestmart%2Fmodel%2Fcontract%2FUserService.java) ), taking into account the corresponding `JSON` response of the API call specified in the Javadoc.
- Business Functionality: Achieve the required business functionality by implementing abstract methods in the [AbstractTestMartAppFeatures.java](src%2Fmain%2Fjava%2Forg%2Fddm%2Ftestmart%2Fapp%2FAbstractTestMartAppFeatures.java) abstract class. Convert this abstract class into a concrete class. To accomplish the desired functionality, you will need to implement the above provided interfaces as well.

#### Changes to the above requirements if you opt for `TypeScript` to solve this

- Instead of `Gradle` use build tools (`Gulp` or `Grunt`) and package manager (`npm` or `Yarn`) from `TypeScript` ecosystem
- Choose `TypeScript` as a language of choice

#### Changes to the above requirements if you opt for `JavaScript` to solve this

- Refer to `TypeScript` interfaces and abstract classes provided with this exercise
- Instead of `Gradle` use build tools (`Gulp` or `Grunt`) and package manager (`npm` or `Yarn`) from `JavaScript/TypeScript` ecosystem
- Choose `JavaScript` as a language of choice

### Example API calls that can be used as reference for this exercise:
- https://dummyjson.com/products
- https://dummyjson.com/products?limit=10&skip=10&select=title,price
- https://dummyjson.com/products/1
- https://dummyjson.com/products/search?q=phone
- https://dummyjson.com/products/categories
- https://dummyjson.com/products/category/smartphones
- https://dummyjson.com/carts
- https://dummyjson.com/carts/1
- https://dummyjson.com/carts/user/5
- https://dummyjson.com/users
- https://dummyjson.com/users/1
- https://dummyjson.com/users/search?q=John

#### Got Questions?
Please reach out to your recruiting liaison to forward your questions to the hiring manager.

#### Deliverable:
A link to GitHub/or similar platform pointing to your complete solution.