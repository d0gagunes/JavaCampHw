package Concrete;

import Abstract.customerCheckService;
import Entities.Customer;

public class customerCheckManager implements customerCheckService{ @Override
    public boolean CheckIfRealPerson(Customer customer){
    return true;
}

}
