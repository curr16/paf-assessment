package vttp2022.paf.assessment.eshop.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.json.Json;
import jakarta.json.JsonArrayBuilder;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;
import vttp2022.paf.assessment.eshop.models.Customer;
import vttp2022.paf.assessment.eshop.models.LineItem;
import vttp2022.paf.assessment.eshop.models.Order;
import vttp2022.paf.assessment.eshop.respositories.CustomerRepository;
import vttp2022.paf.assessment.eshop.respositories.OrderRepository;

@RestController
@RequestMapping
public class OrderController {

	@Autowired
	private CustomerRepository customerRepo;
	private OrderRepository orderRepo;

	@PostMapping(path = "/checkout")
	public String postOrder(@RequestBody MultiValueMap<String, String> form,Model model) {
		String name = form.getFirst("name");
        String email = form.getFirst("email");
        String address = form.getFirst("address");

        Order order = new Order();

        // Order insertedOrder = orderRepo.saveOrder(address);
        
        // model.addAttribute("order", insertedOrder);
        return "order";
    
	}

	@PostMapping(path= "/dispatch/{orderId}")
	public ResponseEntity<String> orderCreated(@PathVariable String orderId) {
		return null;
		
//         JsonObject result = null;

//         Order order = orderRepo.saveOrder(orderId);
//         JsonObjectBuilder objBuilder = Json.createObjectBuilder();
//         objBuilder.add("game", gameDetails.toJSON());
//         result = objBuilder.build();
//         return ResponseEntity
//                 .status(HttpStatus.OK)
//                 .contentType(MediaType.APPLICATION_JSON)
//                 .body(result.toString());

// 		JsonObject finalResult = null;
// 		List<Order> order = bo.getGamesByRank();

// 		List<JsonObject> lineItems = new LinkedList<>();
// 		for (LineItem b : gamesResult) {
// 			JsonObject j = b.toJSON();
// 			gameObjectList.add(j);   
// 		}

//         JsonArrayBuilder arrBuilder = Json.createArrayBuilder();
// 		for (JsonObject jo : gameObjectList){
//             arrBuilder.add(jo);
//         }
		
//         JsonObjectBuilder builder = Json.createObjectBuilder();
//         builder
// 		.add("name", name)
// 		.add("address", address)
// 		.add("email", email)
// 		.add("lineItems", arrBuilder.build());

    //    finalResult = builder.build();

	// 	return ResponseEntity
	// 			.status(HttpStatus.OK)
	// 			.contentType(MediaType.APPLICATION_JSON)
	// 			.body(finalResult.toString());
	

 	}
}
