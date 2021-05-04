package Abstract;

import Entities.Customer;

public class baseCustomerManager implements customerService {

	@Override
	public void save(Customer customer) {
		System.out.println("Saved to db : " +customer.getFirstName());
		
	}

}
