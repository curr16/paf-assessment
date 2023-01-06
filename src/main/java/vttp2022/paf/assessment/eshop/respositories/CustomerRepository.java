package vttp2022.paf.assessment.eshop.respositories;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import vttp2022.paf.assessment.eshop.models.Customer;

@Repository
public class CustomerRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;


	// You cannot change the method's signature
	public Optional<Customer> findCustomerByName(String name) {
		// Optional<Customer> custs = jdbcTemplate.query(SQL_SELECT_CUSTOMERS_BY_NAME, new CustomerRowMapper(),
		// new Object[] { id });
		// return custs;
 
		return null;

	}
}
