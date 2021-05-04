import java.util.Date;
import java.util.GregorianCalendar;

import Abstract.baseCustomerManager;
import Concrete.neroCustomerManager;
import Entities.Customer;

public class Main {

	
	public static void main(String[] args) {
		
		baseCustomerManager customerManager=new neroCustomerManager();
		customerManager.save(new Customer(2,"Engin","Demiroð",new GregorianCalendar(1989,2,11),"123456"));
	}

}
