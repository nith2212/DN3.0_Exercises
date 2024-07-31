public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public Customer findCustomerById(String id) {
        // Mock implementation: In a real application, this would interact with a database.
        return new Customer(id, "John Doe");
    }
}
