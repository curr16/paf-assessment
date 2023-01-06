package vttp2022.paf.assessment.eshop.respositories;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import vttp2022.paf.assessment.eshop.models.Order;

@Repository
public class OrderRepository {
	// TODO: Task 3

	@Autowired
    private JdbcTemplate template;

	public Optional<Order> saveOrder(String orderId) {

		

		return null;
	}


}
