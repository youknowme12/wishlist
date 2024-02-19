# WishlistManagement - how to set up and run the application locally

1. Clone the repository
2. Build the project using 'mvn clean install' command
3. To run the application, run command 'mvn spring-boot:run'

API Specifics :-
For authorization :-
username - ayushijyoti
password - dummy


For hitting POST command with endpoint - '/api/wishlists'

1. Get the csrf token by hitting this api - '/csrf-token'
2. Add header - 'X-CSRF-TOKEN' and add the value of csrf token
