<p align="center">
  <img src="https://raw.githubusercontent.com/PKief/vscode-material-icon-theme/ec559a9f6bfd399b82bb44393651661b08aaf7ba/icons/folder-markdown-open.svg" width="20%" alt="COCO-USER-BG-logo">
</p>
<p align="center">
    <h1 align="center">COCO-USER-BG</h1>
</p>
<p align="center">
    <em>Empowering interactions, simplifying experiences.</em>
</p>
<p align="center">
	<img src="https://img.shields.io/github/license/coco40725/coco-user-bg?style=default&logo=opensourceinitiative&logoColor=white&color=0080ff" alt="license">
	<img src="https://img.shields.io/github/last-commit/coco40725/coco-user-bg?style=default&logo=git&logoColor=white&color=0080ff" alt="last-commit">
	<img src="https://img.shields.io/github/languages/top/coco40725/coco-user-bg?style=default&color=0080ff" alt="repo-top-language">
	<img src="https://img.shields.io/github/languages/count/coco40725/coco-user-bg?style=default&color=0080ff" alt="repo-language-count">
</p>
<p align="center">
	<!-- default option, no dependency badges. -->
</p>
<br>

##  Table of Contents

- [ Overview](#-overview)
- [ Features](#-features)
- [ Project Structure](#-project-structure)
  - [ Project Index](#-project-index)
- [ Getting Started](#-getting-started)
  - [ Prerequisites](#-prerequisites)
  - [ Installation](#-installation)
  - [ Usage](#-usage)
  - [ Testing](#-testing)
- [ Project Roadmap](#-project-roadmap)
- [ Contributing](#-contributing)
- [ License](#-license)
- [ Acknowledgments](#-acknowledgments)

---

##  Overview

**coco-user-bg** is a Quarkus-based project that simplifies user management and authentication. It offers secure user creation, login, and token verification functionalities. Targeting developers, it streamlines user-related operations with a focus on security and efficiency.

---

##  Features

|      | Feature         | Summary       |
| :--- | :---:           | :---          |
| ⚙️  | **Architecture**  | <ul><li>Modular architecture using Kotlin</li><li>Integration with gRPC for communication</li><li>Containerized deployment with Docker and Kubernetes</li></ul> |
| 🔩 | **Code Quality**  | <ul><li>Consistent coding style and standards</li><li>Effective error handling and logging</li><li>Code reviews and automated testing</li></ul> |
| 📄 | **Documentation** | <ul><li>Comprehensive documentation in Kotlin</li><li>Usage of Gradle for build and run commands</li><li>Clear installation and usage instructions</li></ul> |
| 🔌 | **Integrations**  | <ul><li>Integration with Google Cloud services</li><li>Utilization of Docker for containerization</li><li>Deployment automation for Kubernetes</li></ul> |
| 🧩 | **Modularity**    | <ul><li>Well-structured codebase with clear separation of concerns</li><li>Reusable components and modules</li><li>Easy scalability and maintenance</li></ul> |
| 🧪 | **Testing**       | <ul><li>Comprehensive testing with Gradle</li><li>Unit tests, integration tests, and end-to-end tests</li><li>Test coverage reports and continuous integration</li></ul> |
| ⚡️  | **Performance**   | <ul><li>Optimized performance for high throughput</li><li>Efficient resource utilization</li><li>Monitoring and profiling for performance tuning</li></ul> |
| 🛡️ | **Security**      | <ul><li>Secure coding practices and data handling</li><li>Authentication and authorization mechanisms</li><li>Regular security audits and updates</li></ul> |
| 📦 | **Dependencies**  | <ul><li>Dependencies managed using Gradle</li><li>Utilization of various libraries and frameworks</li><li>Efficient dependency management for Quarkus-based application</li></ul> |

---

##  Project Structure

```sh
└── coco-user-bg/
    ├── README.md
    ├── build.gradle
    ├── deploy_demo.sh
    ├── gradle
    │   └── wrapper
    ├── gradle.properties
    ├── gradlew
    ├── gradlew.bat
    ├── k8s
    │   └── k8s-deploy-service.yaml
    ├── settings.gradle
    └── src
        ├── main
        ├── native-test
        └── test
```


###  Project Index
<details open>
	<summary><b><code>COCO-USER-BG/</code></b></summary>
	<details> <!-- __root__ Submodule -->
		<summary><b>__root__</b></summary>
		<blockquote>
			<table>
			<tr>
				<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/gradlew.bat'>gradlew.bat</a></b></td>
				<td>- Initiate the Gradle startup script for Windows, setting up JVM options and locating the Java executable<br>- Ensure JAVA_HOME is correctly configured for Java installation<br>- Execute Gradle with specified options and arguments.</td>
			</tr>
			<tr>
				<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/deploy_demo.sh'>deploy_demo.sh</a></b></td>
				<td>- Automates deployment process by building, tagging, and pushing Docker image to Artifact Registry<br>- Ensures correct permissions and deploys new version to Kubernetes cluster<br>- Integrates with Google Cloud services for seamless deployment.</td>
			</tr>
			<tr>
				<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/build.gradle'>build.gradle</a></b></td>
				<td>- Configures project dependencies and plugins for a Quarkus-based application<br>- Manages dependencies for REST, security, MongoDB, Kotlin, gRPC, and more<br>- Sets up testing frameworks and logging properties<br>- Configures Kotlin compilation options.</td>
			</tr>
			<tr>
				<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/settings.gradle'>settings.gradle</a></b></td>
				<td>- Manages plugin repositories and versions for the project, including Quarkus and Kotlin plugins<br>- Sets up the project name as 'coco-user-bg' and includes a toolchains resolver convention plugin.</td>
			</tr>
			</table>
		</blockquote>
	</details>
	<details> <!-- src Submodule -->
		<summary><b>src</b></summary>
		<blockquote>
			<details>
				<summary><b>test</b></summary>
				<blockquote>
					<details>
						<summary><b>kotlin</b></summary>
						<blockquote>
							<details>
								<summary><b>com</b></summary>
								<blockquote>
									<details>
										<summary><b>coco</b></summary>
										<blockquote>
											<table>
											<tr>
												<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/src/test/kotlin/com/coco/GreetingResourceTest.kt'>GreetingResourceTest.kt</a></b></td>
												<td>Verifies the functionality of the GreetingResource by testing the /hello endpoint.</td>
											</tr>
											</table>
										</blockquote>
									</details>
								</blockquote>
							</details>
						</blockquote>
					</details>
				</blockquote>
			</details>
			<details>
				<summary><b>native-test</b></summary>
				<blockquote>
					<details>
						<summary><b>kotlin</b></summary>
						<blockquote>
							<details>
								<summary><b>com</b></summary>
								<blockquote>
									<details>
										<summary><b>coco</b></summary>
										<blockquote>
											<table>
											<tr>
												<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/src/native-test/kotlin/com/coco/GreetingResourceIT.kt'>GreetingResourceIT.kt</a></b></td>
												<td>Verifies the integration of GreetingResource by extending GreetingResourceTest in the project's native-test package.</td>
											</tr>
											</table>
										</blockquote>
									</details>
								</blockquote>
							</details>
						</blockquote>
					</details>
				</blockquote>
			</details>
			<details>
				<summary><b>main</b></summary>
				<blockquote>
					<details>
						<summary><b>kotlin</b></summary>
						<blockquote>
							<details>
								<summary><b>com</b></summary>
								<blockquote>
									<details>
										<summary><b>coco</b></summary>
										<blockquote>
											<table>
											<tr>
												<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/src/main/kotlin/com/coco/GreetingResource.kt'>GreetingResource.kt</a></b></td>
												<td>- Defines a REST endpoint for greeting messages in the Quarkus project structure<br>- The GreetingResource.kt file handles HTTP GET requests to "/hello" and responds with a plain text message<br>- This component plays a key role in providing a simple and straightforward way to interact with the application's greeting functionality.</td>
											</tr>
											</table>
											<details>
												<summary><b>infra</b></summary>
												<blockquote>
													<details>
														<summary><b>grpc</b></summary>
														<blockquote>
															<table>
															<tr>
																<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/src/main/kotlin/com/coco/infra/grpc/HelloSvc.kt'>HelloSvc.kt</a></b></td>
																<td>- Defines a gRPC service that handles incoming requests to greet users<br>- The service processes requests and responds with a personalized greeting message<br>- This component plays a crucial role in enabling communication between clients and the server, enhancing the overall functionality of the system.</td>
															</tr>
															</table>
														</blockquote>
													</details>
													<details>
														<summary><b>exception</b></summary>
														<blockquote>
															<table>
															<tr>
																<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/src/main/kotlin/com/coco/infra/exception/RepoException.kt'>RepoException.kt</a></b></td>
																<td>- Defines and increments exception counters for repository-related errors in the project, utilizing Micrometer metrics<br>- The code enhances observability by tracking and categorizing exceptions based on type, class, and function, aiding in identifying and resolving issues efficiently.</td>
															</tr>
															<tr>
																<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/src/main/kotlin/com/coco/infra/exception/RepoExceptionMapper.kt'>RepoExceptionMapper.kt</a></b></td>
																<td>- The `RepoExceptionMapper` class in the provided codebase handles exceptions specific to repository operations by mapping them to HTTP responses<br>- This component plays a crucial role in ensuring that any errors related to repository interactions are appropriately communicated to clients, maintaining the integrity and reliability of the overall system.</td>
															</tr>
															</table>
														</blockquote>
													</details>
													<details>
														<summary><b>config</b></summary>
														<blockquote>
															<table>
															<tr>
																<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/src/main/kotlin/com/coco/infra/config/JwtConfig.kt'>JwtConfig.kt</a></b></td>
																<td>- Defines JWT configuration settings for the project, including secret key, issuer, and expiration time in seconds<br>- This file encapsulates the necessary information for handling JWT authentication and authorization within the codebase architecture.</td>
															</tr>
															</table>
														</blockquote>
													</details>
													<details>
														<summary><b>repo</b></summary>
														<blockquote>
															<table>
															<tr>
																<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/src/main/kotlin/com/coco/infra/repo/UserRepo.kt'>UserRepo.kt</a></b></td>
																<td>- Manages user data persistence and retrieval in the user database<br>- Implements functions to insert a new user and find a user by email while ensuring the user is enabled<br>- Handles mapping between User objects and MongoDB documents for seamless data interaction.</td>
															</tr>
															</table>
														</blockquote>
													</details>
												</blockquote>
											</details>
											<details>
												<summary><b>domain</b></summary>
												<blockquote>
													<details>
														<summary><b>enums</b></summary>
														<blockquote>
															<table>
															<tr>
																<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/src/main/kotlin/com/coco/domain/enums/ProviderType.kt'>ProviderType.kt</a></b></td>
																<td>Define provider types for the project's domain entities.</td>
															</tr>
															</table>
														</blockquote>
													</details>
													<details>
														<summary><b>model</b></summary>
														<blockquote>
															<table>
															<tr>
																<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/src/main/kotlin/com/coco/domain/model/User.kt'>User.kt</a></b></td>
																<td>- Defines a User model with essential attributes like id, name, email, and creation date<br>- It includes fields for password, provider type, email verification status, and account activation.</td>
															</tr>
															</table>
														</blockquote>
													</details>
													<details>
														<summary><b>service</b></summary>
														<blockquote>
															<table>
															<tr>
																<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/src/main/kotlin/com/coco/domain/service/UserSvc.kt'>UserSvc.kt</a></b></td>
																<td>Manages user-related operations within the domain service layer, contributing to the overall architecture of the project.</td>
															</tr>
															</table>
														</blockquote>
													</details>
												</blockquote>
											</details>
											<details>
												<summary><b>application</b></summary>
												<blockquote>
													<details>
														<summary><b>exception</b></summary>
														<blockquote>
															<table>
															<tr>
																<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/src/main/kotlin/com/coco/application/exception/QueryExceptionMapper.kt'>QueryExceptionMapper.kt</a></b></td>
																<td>Handles various query-related exceptions by mapping them to appropriate HTTP responses in the application, ensuring proper error handling and response generation.</td>
															</tr>
															<tr>
																<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/src/main/kotlin/com/coco/application/exception/CommandExceptionMapper.kt'>CommandExceptionMapper.kt</a></b></td>
																<td>- CommandExceptionMapper handles various exceptions related to commands in the application, mapping them to appropriate HTTP responses<br>- It ensures that NoSuchCommandException triggers an internal server error response, CommandHandlerCastException results in an internal server error, and CommandValidationException leads to a bad request response.</td>
															</tr>
															<tr>
																<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/src/main/kotlin/com/coco/application/exception/ApplicationException.kt'>ApplicationException.kt</a></b></td>
																<td>Increment exception counter for application errors in the codebase architecture.</td>
															</tr>
															<tr>
																<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/src/main/kotlin/com/coco/application/exception/QueryException.kt'>QueryException.kt</a></b></td>
																<td>- Defines and handles query-related exceptions by incrementing a counter for each exception type<br>- The code contributes to monitoring and tracking exceptions in the application, enhancing observability and troubleshooting capabilities.</td>
															</tr>
															<tr>
																<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/src/main/kotlin/com/coco/application/exception/ApplicationExceptionMapper.kt'>ApplicationExceptionMapper.kt</a></b></td>
																<td>Handles and maps application exceptions to HTTP responses within the project's architecture, ensuring a consistent error handling approach.</td>
															</tr>
															<tr>
																<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/src/main/kotlin/com/coco/application/exception/CommandException.kt'>CommandException.kt</a></b></td>
																<td>- Defines and handles exceptions for command-related errors in the application<br>- Increments metrics for different exception types, aiding in monitoring and troubleshooting<br>- The code enhances the codebase's robustness by providing structured error handling for command-related issues.</td>
															</tr>
															</table>
														</blockquote>
													</details>
													<details>
														<summary><b>middleware</b></summary>
														<blockquote>
															<details>
																<summary><b>auth</b></summary>
																<blockquote>
																	<table>
																	<tr>
																		<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/src/main/kotlin/com/coco/application/middleware/auth/Logged.kt'>Logged.kt</a></b></td>
																		<td>- Defines a custom annotation `Logged` to mark classes and functions for logging purposes within the authentication middleware of the project<br>- This annotation plays a crucial role in managing and tracking user authentication activities across the codebase architecture.</td>
																	</tr>
																	<tr>
																		<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/src/main/kotlin/com/coco/application/middleware/auth/JwtRequest.kt'>JwtRequest.kt</a></b></td>
																		<td>Handles JWT token initialization for request-scoped authentication middleware in the project architecture.</td>
																	</tr>
																	<tr>
																		<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/src/main/kotlin/com/coco/application/middleware/auth/JwtRequestFilter.kt'>JwtRequestFilter.kt</a></b></td>
																		<td>- Implements JWT token authentication for incoming requests, ensuring secure access to protected endpoints<br>- The filter extracts the token from the request cookies and initializes the JWT request with the token for authorization purposes<br>- This middleware plays a crucial role in enforcing authentication mechanisms within the application architecture.</td>
																	</tr>
																	</table>
																</blockquote>
															</details>
														</blockquote>
													</details>
													<details>
														<summary><b>cqrs</b></summary>
														<blockquote>
															<table>
															<tr>
																<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/src/main/kotlin/com/coco/application/cqrs/DefaultActionExecutor.kt'>DefaultActionExecutor.kt</a></b></td>
																<td>- Manages execution and validation of commands and queries by mapping handlers and validators<br>- Initializes handler and validator maps for commands and queries<br>- Handles command and query execution, validation, and type casting.</td>
															</tr>
															<tr>
																<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/src/main/kotlin/com/coco/application/cqrs/ActionExecutor.kt'>ActionExecutor.kt</a></b></td>
																<td>- Facilitates execution and validation of commands and queries within the CQRS architecture, ensuring proper handling of business logic<br>- The ActionExecutor interface defines methods for executing and validating commands and queries, promoting separation of concerns and maintainability in the project's codebase structure.</td>
															</tr>
															</table>
															<details>
																<summary><b>query</b></summary>
																<blockquote>
																	<details>
																		<summary><b>base</b></summary>
																		<blockquote>
																			<table>
																			<tr>
																				<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/src/main/kotlin/com/coco/application/cqrs/query/base/QueryValidateResult.kt'>QueryValidateResult.kt</a></b></td>
																				<td>Defines a base class for query validation results in the project's CQRS architecture.</td>
																			</tr>
																			<tr>
																				<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/src/main/kotlin/com/coco/application/cqrs/query/base/QueryHandler.kt'>QueryHandler.kt</a></b></td>
																				<td>Defines a contract for handling queries in the project's CQRS architecture, ensuring separation of concerns and promoting code reusability.</td>
																			</tr>
																			<tr>
																				<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/src/main/kotlin/com/coco/application/cqrs/query/base/QueryValidator.kt'>QueryValidator.kt</a></b></td>
																				<td>- Validates queries for the application's CQRS architecture, ensuring data integrity and consistency<br>- The QueryValidator interface defines a method to validate incoming queries, returning a result indicating whether the query is valid or not<br>- This crucial component helps maintain the overall reliability and accuracy of the system's query processing functionality.</td>
																			</tr>
																			<tr>
																				<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/src/main/kotlin/com/coco/application/cqrs/query/base/Query.kt'>Query.kt</a></b></td>
																				<td>Defines a base interface for queries in the project's CQRS architecture, facilitating the separation of read operations.</td>
																			</tr>
																			</table>
																		</blockquote>
																	</details>
																	<details>
																		<summary><b>verifyToken</b></summary>
																		<blockquote>
																			<table>
																			<tr>
																				<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/src/main/kotlin/com/coco/application/cqrs/query/verifyToken/VerifyTokenQuery.kt'>VerifyTokenQuery.kt</a></b></td>
																				<td>- Defines a query to verify a token in the CQRS architecture of the project<br>- The code file encapsulates the logic for verifying a token, contributing to the overall functionality of handling queries within the application.</td>
																			</tr>
																			<tr>
																				<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/src/main/kotlin/com/coco/application/cqrs/query/verifyToken/VerifyTokenResult.kt'>VerifyTokenResult.kt</a></b></td>
																				<td>- Defines a data class `VerifyTokenResult` with fields for ID, name, and email<br>- This class represents the result of verifying a token in the CQRS query architecture of the project.</td>
																			</tr>
																			<tr>
																				<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/src/main/kotlin/com/coco/application/cqrs/query/verifyToken/VerifyTokenHandler.kt'>VerifyTokenHandler.kt</a></b></td>
																				<td>- Handles verification of user tokens by extracting necessary information from the token payload using the JwtManagementService<br>- Returns a VerifyTokenResult object containing user ID, email, and name<br>- This class implements QueryHandler to process VerifyTokenQuery and ensure the token is valid.</td>
																			</tr>
																			<tr>
																				<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/src/main/kotlin/com/coco/application/cqrs/query/verifyToken/VerifyTokenGrpcSvc.kt'>VerifyTokenGrpcSvc.kt</a></b></td>
																				<td>- Handles gRPC requests to verify JWT tokens using a JwtManagementService<br>- Parses the token, retrieves payload data, and constructs a response with the token's ID, email, and name.</td>
																			</tr>
																			</table>
																		</blockquote>
																	</details>
																</blockquote>
															</details>
															<details>
																<summary><b>command</b></summary>
																<blockquote>
																	<details>
																		<summary><b>createUserByWeb</b></summary>
																		<blockquote>
																			<table>
																			<tr>
																				<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/src/main/kotlin/com/coco/application/cqrs/command/createUserByWeb/CreateUserByWebHandler.kt'>CreateUserByWebHandler.kt</a></b></td>
																				<td>- Handles the creation of a user via web interface by validating input, hashing the password, and generating a JWT token<br>- The handler interacts with services to create a new user, serialize user data, and issue a token as a response cookie.</td>
																			</tr>
																			<tr>
																				<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/src/main/kotlin/com/coco/application/cqrs/command/createUserByWeb/CreateUserByWebCommand.kt'>CreateUserByWebCommand.kt</a></b></td>
																				<td>- Facilitates creating a user via web interface by defining a command structure with user details<br>- This file encapsulates the necessary data for handling user creation requests in the project's CQRS architecture, ensuring a streamlined process for adding new users through web interactions.</td>
																			</tr>
																			<tr>
																				<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/src/main/kotlin/com/coco/application/cqrs/command/createUserByWeb/CreateUserByWebValidate.kt'>CreateUserByWebValidate.kt</a></b></td>
																				<td>- Validates user input for creating a new user via web interface<br>- Ensures name, email, and password are not empty, returning validation errors if necessary<br>- Supports the overall architecture by enforcing data integrity before processing user creation commands.</td>
																			</tr>
																			</table>
																		</blockquote>
																	</details>
																	<details>
																		<summary><b>login</b></summary>
																		<blockquote>
																			<table>
																			<tr>
																				<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/src/main/kotlin/com/coco/application/cqrs/command/login/LoginFactory.kt'>LoginFactory.kt</a></b></td>
																				<td>- Defines a LoginFactory class that selects the appropriate login strategy based on the ProviderType<br>- The class is responsible for returning the corresponding login strategy, either GoogleLoginStrategy or WebLoginStrategy, depending on the ProviderType provided.</td>
																			</tr>
																			<tr>
																				<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/src/main/kotlin/com/coco/application/cqrs/command/login/LoginValidate.kt'>LoginValidate.kt</a></b></td>
																				<td>- Validates login commands based on provider type, ensuring required fields are not empty<br>- Handles different validation rules for WEB and GOOGLE login types<br>- Returns validation result indicating success or specific error messages.</td>
																			</tr>
																			<tr>
																				<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/src/main/kotlin/com/coco/application/cqrs/command/login/LoginHandler.kt'>LoginHandler.kt</a></b></td>
																				<td>- Handles user login requests by utilizing different login strategies based on the provider type, returning a response with a token cookie for authentication<br>- This code file plays a crucial role in the project's architecture by providing a centralized mechanism for processing login commands and generating appropriate responses.</td>
																			</tr>
																			<tr>
																				<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/src/main/kotlin/com/coco/application/cqrs/command/login/LoginStrategy.kt'>LoginStrategy.kt</a></b></td>
																				<td>- Defines a login strategy interface for handling login commands in the project's CQRS architecture<br>- This interface specifies a method for executing login commands and returning a Uni type with a nullable String result.</td>
																			</tr>
																			<tr>
																				<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/src/main/kotlin/com/coco/application/cqrs/command/login/LoginCommand.kt'>LoginCommand.kt</a></b></td>
																				<td>- Implements a login command handling user authentication for the application<br>- It encapsulates user credentials and provider type, returning a response upon execution<br>- This command plays a crucial role in managing user login functionality within the project's CQRS architecture.</td>
																			</tr>
																			</table>
																			<details>
																				<summary><b>impl</b></summary>
																				<blockquote>
																					<table>
																					<tr>
																						<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/src/main/kotlin/com/coco/application/cqrs/command/login/impl/WebLoginStrategy.kt'>WebLoginStrategy.kt</a></b></td>
																						<td>- Implements a web login strategy for user authentication and authorization<br>- Utilizes services for user and JWT token management to validate user credentials and generate tokens<br>- Handles user login requests by verifying credentials and issuing JWT tokens upon successful authentication.</td>
																					</tr>
																					<tr>
																						<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/src/main/kotlin/com/coco/application/cqrs/command/login/impl/GoogleLoginStrategy.kt'>GoogleLoginStrategy.kt</a></b></td>
																						<td>- Implements Google login authentication and user creation logic using Google OAuth2<br>- Verifies Google ID token, checks validity, and creates a new user if not found<br>- Generates a JWT token for the authenticated user.</td>
																					</tr>
																					</table>
																				</blockquote>
																			</details>
																		</blockquote>
																	</details>
																	<details>
																		<summary><b>base</b></summary>
																		<blockquote>
																			<table>
																			<tr>
																				<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/src/main/kotlin/com/coco/application/cqrs/command/base/CommandValidateResult.kt'>CommandValidateResult.kt</a></b></td>
																				<td>- Defines a base class for validating command results in the project's CQRS architecture<br>- This class plays a crucial role in ensuring the integrity and correctness of command executions within the system.</td>
																			</tr>
																			<tr>
																				<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/src/main/kotlin/com/coco/application/cqrs/command/base/CommandHandler.kt'>CommandHandler.kt</a></b></td>
																				<td>- Defines a contract for handling commands in the CQRS architecture, allowing for the execution of commands and validation of results<br>- This interface plays a crucial role in separating command execution logic from the rest of the application, promoting a clean and modular codebase structure.</td>
																			</tr>
																			<tr>
																				<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/src/main/kotlin/com/coco/application/cqrs/command/base/CommandValidator.kt'>CommandValidator.kt</a></b></td>
																				<td>- Validates commands for the application's CQRS architecture, ensuring data integrity and consistency<br>- The CommandValidator interface defines a method to validate incoming commands, returning a result indicating success or failure<br>- This crucial component helps maintain the reliability and accuracy of command execution within the codebase.</td>
																			</tr>
																			<tr>
																				<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/src/main/kotlin/com/coco/application/cqrs/command/base/Command.kt'>Command.kt</a></b></td>
																				<td>- Defines a base interface for commands in the CQRS architecture, facilitating the separation of concerns between command execution and business logic<br>- This abstraction enables decoupling of command definitions from their implementations, promoting maintainability and extensibility within the project's architecture.</td>
																			</tr>
																			</table>
																		</blockquote>
																	</details>
																	<details>
																		<summary><b>logout</b></summary>
																		<blockquote>
																			<table>
																			<tr>
																				<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/src/main/kotlin/com/coco/application/cqrs/command/logout/LogoutCommand.kt'>LogoutCommand.kt</a></b></td>
																				<td>Implements a command for logging out a user by handling a JWT request.</td>
																			</tr>
																			<tr>
																				<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/src/main/kotlin/com/coco/application/cqrs/command/logout/LogoutHandler.kt'>LogoutHandler.kt</a></b></td>
																				<td>Implements a command handler for logging out users by removing the authentication token cookie.</td>
																			</tr>
																			</table>
																		</blockquote>
																	</details>
																</blockquote>
															</details>
														</blockquote>
													</details>
													<details>
														<summary><b>ctrl</b></summary>
														<blockquote>
															<table>
															<tr>
																<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/src/main/kotlin/com/coco/application/ctrl/JwtCtrl.kt'>JwtCtrl.kt</a></b></td>
																<td>- Implements endpoints for JWT token verification and interaction with gRPC services<br>- Handles requests to verify tokens locally and via gRPC, utilizing a DefaultActionExecutor for query execution<br>- Integrates with external services for token verification and response handling.</td>
															</tr>
															<tr>
																<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/src/main/kotlin/com/coco/application/ctrl/UserCtrl.kt'>UserCtrl.kt</a></b></td>
																<td>- Implements user authentication and authorization functionalities by handling login, user creation, and logout operations<br>- Utilizes a DefaultActionExecutor to validate and execute commands, ensuring secure user interactions<br>- The UserCtrl class orchestrates these actions, interacting with the middleware and command classes to manage user sessions securely.</td>
															</tr>
															</table>
														</blockquote>
													</details>
													<details>
														<summary><b>service</b></summary>
														<blockquote>
															<table>
															<tr>
																<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/src/main/kotlin/com/coco/application/service/JwtManagementService.kt'>JwtManagementService.kt</a></b></td>
																<td>- The JwtManagementService class facilitates JWT token generation, verification, and payload extraction based on configurable settings<br>- It leverages the JwtConfig class to access secret key, issuer, and expiration time<br>- This service plays a crucial role in ensuring secure authentication within the project architecture.</td>
															</tr>
															<tr>
																<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/src/main/kotlin/com/coco/application/service/UserManagementService.kt'>UserManagementService.kt</a></b></td>
																<td>- The UserManagementService class in the codebase facilitates user-related operations such as finding users by email, creating users, verifying passwords, and hashing passwords<br>- It interacts with the UserRepo to handle user data persistence and utilizes BcryptUtil for password security<br>- This service plays a crucial role in managing user entities within the application.</td>
															</tr>
															</table>
															<details>
																<summary><b>excpetion</b></summary>
																<blockquote>
																	<table>
																	<tr>
																		<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/src/main/kotlin/com/coco/application/service/excpetion/JwtException.kt'>JwtException.kt</a></b></td>
																		<td>Defines a custom exception class for handling errors related to JWT token verification in the project's service layer.</td>
																	</tr>
																	</table>
																</blockquote>
															</details>
														</blockquote>
													</details>
												</blockquote>
											</details>
										</blockquote>
									</details>
								</blockquote>
							</details>
						</blockquote>
					</details>
					<details>
						<summary><b>proto</b></summary>
						<blockquote>
							<table>
							<tr>
								<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/src/main/proto/verifyToken.proto'>verifyToken.proto</a></b></td>
								<td>- Defines gRPC service for verifying tokens with request and response message structures<br>- Facilitates communication between client and server for token verification in the project architecture.</td>
							</tr>
							<tr>
								<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/src/main/proto/helloworld.proto'>helloworld.proto</a></b></td>
								<td>Defines the greeting service and message structures for the project's communication layer.</td>
							</tr>
							</table>
						</blockquote>
					</details>
					<details>
						<summary><b>docker</b></summary>
						<blockquote>
							<table>
							<tr>
								<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/src/main/docker/Dockerfile.native-micro'>Dockerfile.native-micro</a></b></td>
								<td>- Optimize container size by building a Quarkus application in native mode using a micro base image<br>- Follow instructions to build and run the container efficiently.</td>
							</tr>
							<tr>
								<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/src/main/docker/Dockerfile.jvm'>Dockerfile.jvm</a></b></td>
								<td>- Enables building and running a Quarkus application in JVM mode within a Docker container<br>- Utilizes a Dockerfile to set up the container image, including memory/GC tuning configurations<br>- Facilitates running the application with specified environment properties and debug options<br>- Incorporates a script to execute the Java application and exposes necessary ports.</td>
							</tr>
							<tr>
								<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/src/main/docker/Dockerfile.legacy-jar'>Dockerfile.legacy-jar</a></b></td>
								<td>- Facilitates building a Docker container for running a Quarkus application in JVM mode<br>- Includes memory/GC tuning and configuration options for JVM behavior<br>- The container image uses a script to execute the Java application and can be customized using environment properties.</td>
							</tr>
							<tr>
								<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/src/main/docker/Dockerfile.native'>Dockerfile.native</a></b></td>
								<td>- Facilitates building a container for running the Quarkus application in native mode<br>- Instructions include running Gradle build with native mode enabled, building the image, and running the container<br>- Dockerfile configures the container environment, sets up the working directory, copies application files, exposes port 8080, and specifies the entry point.</td>
							</tr>
							</table>
						</blockquote>
					</details>
				</blockquote>
			</details>
		</blockquote>
	</details>
	<details> <!-- k8s Submodule -->
		<summary><b>k8s</b></summary>
		<blockquote>
			<table>
			<tr>
				<td><b><a href='https://github.com/coco40725/coco-user-bg/blob/master/k8s/k8s-deploy-service.yaml'>k8s-deploy-service.yaml</a></b></td>
				<td>- Defines a Kubernetes deployment and service for the coco-user-bg application, specifying resource requirements, environment variables, probes, and ports<br>- Manages containerized instances of the application, ensuring availability and scalability within the Kubernetes cluster.</td>
			</tr>
			</table>
		</blockquote>
	</details>
</details>

---
##  Getting Started

###  Prerequisites

Before getting started with coco-user-bg, ensure your runtime environment meets the following requirements:

- **Programming Language:** Kotlin
- **Package Manager:** Gradle


###  Installation

Install coco-user-bg using one of the following methods:

**Build from source:**

1. Clone the coco-user-bg repository:
```sh
❯ git clone https://github.com/coco40725/coco-user-bg
```

2. Navigate to the project directory:
```sh
❯ cd coco-user-bg
```

3. Install the project dependencies:


**Using `gradle`** &nbsp; [<img align="center" src="https://img.shields.io/badge/Kotlin-0095D5.svg?style={badge_style}&logo=kotlin&logoColor=white" />](https://kotlinlang.org/)

```sh
❯ gradle build
```




###  Usage
Run coco-user-bg using the following command:
**Using `gradle`** &nbsp; [<img align="center" src="https://img.shields.io/badge/Kotlin-0095D5.svg?style={badge_style}&logo=kotlin&logoColor=white" />](https://kotlinlang.org/)

```sh
❯ gradle run
```


###  Testing
Run the test suite using the following command:
**Using `gradle`** &nbsp; [<img align="center" src="https://img.shields.io/badge/Kotlin-0095D5.svg?style={badge_style}&logo=kotlin&logoColor=white" />](https://kotlinlang.org/)

```sh
❯ gradle test
```


---
##  Project Roadmap

- [X] **`Task 1`**: <strike>Implement feature one.</strike>
- [ ] **`Task 2`**: Implement feature two.
- [ ] **`Task 3`**: Implement feature three.

---

##  Contributing

- **💬 [Join the Discussions](https://github.com/coco40725/coco-user-bg/discussions)**: Share your insights, provide feedback, or ask questions.
- **🐛 [Report Issues](https://github.com/coco40725/coco-user-bg/issues)**: Submit bugs found or log feature requests for the `coco-user-bg` project.
- **💡 [Submit Pull Requests](https://github.com/coco40725/coco-user-bg/blob/main/CONTRIBUTING.md)**: Review open PRs, and submit your own PRs.

<details closed>
<summary>Contributing Guidelines</summary>

1. **Fork the Repository**: Start by forking the project repository to your github account.
2. **Clone Locally**: Clone the forked repository to your local machine using a git client.
   ```sh
   git clone https://github.com/coco40725/coco-user-bg
   ```
3. **Create a New Branch**: Always work on a new branch, giving it a descriptive name.
   ```sh
   git checkout -b new-feature-x
   ```
4. **Make Your Changes**: Develop and test your changes locally.
5. **Commit Your Changes**: Commit with a clear message describing your updates.
   ```sh
   git commit -m 'Implemented new feature x.'
   ```
6. **Push to github**: Push the changes to your forked repository.
   ```sh
   git push origin new-feature-x
   ```
7. **Submit a Pull Request**: Create a PR against the original project repository. Clearly describe the changes and their motivations.
8. **Review**: Once your PR is reviewed and approved, it will be merged into the main branch. Congratulations on your contribution!
</details>

<details closed>
<summary>Contributor Graph</summary>
<br>
<p align="left">
   <a href="https://github.com{/coco40725/coco-user-bg/}graphs/contributors">
      <img src="https://contrib.rocks/image?repo=coco40725/coco-user-bg">
   </a>
</p>
</details>

---

##  License

This project is protected under the [SELECT-A-LICENSE](https://choosealicense.com/licenses) License. For more details, refer to the [LICENSE](https://choosealicense.com/licenses/) file.

---

##  Acknowledgments

- List any resources, contributors, inspiration, etc. here.

---
