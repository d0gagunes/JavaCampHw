package Abstract;

import Entities.Customer;

public interface customerCheckService {
	boolean CheckIfRealPerson(Customer customer) throws Exception;
}
