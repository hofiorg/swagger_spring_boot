package org.hofi.api;

import io.swagger.annotations.ApiParam;
import org.hofi.model.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.Map;

@Controller
public class StoreApiController implements StoreApi {

  public StoreApiController() {
  }

  public ResponseEntity<Void> deleteOrder(@Min(1) @ApiParam(value = "ID of the order that needs to be deleted", required = true) @PathVariable("orderId") Long orderId) {
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }

  public ResponseEntity<Map<String, Integer>> getInventory() {

    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }

  public ResponseEntity<Order> getOrderById(@Min(1) @Max(10) @ApiParam(value = "ID of pet that needs to be fetched", required = true) @PathVariable("orderId") Long orderId) {

    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }

  public ResponseEntity<Order> placeOrder(@ApiParam(value = "order placed for purchasing the pet", required = true) @Valid @RequestBody Order body) {

    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }

}
