/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.5).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Login;
import io.swagger.model.User;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-12T16:03:36.994Z[GMT]")
@Api(value = "customers", description = "the customers API")
public interface CustomersApi {

    @ApiOperation(value = "", nickname = "createCustomer", notes = "Creates a new customer.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "OK Customer created") })
    @RequestMapping(value = "/customers",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> createCustomer(@ApiParam(value = "" ,required=true )  @Valid @RequestBody User body);


    @ApiOperation(value = "", nickname = "customersCustIdDelete", notes = "Deletes the customer account", authorizations = {
        @Authorization(value = "basicAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "OK Customer deleted"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Error: Not Found") })
    @RequestMapping(value = "/customers/{custId}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> customersCustIdDelete(@ApiParam(value = "The user ID",required=true) @PathVariable("custId") Integer custId);


    @ApiOperation(value = "", nickname = "customersCustIdGet", notes = "Gets a customer by their id.", response = User.class, authorizations = {
        @Authorization(value = "basicAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK Customer obtained.", response = User.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Error: Not Found") })
    @RequestMapping(value = "/customers/{custId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<User> customersCustIdGet(@ApiParam(value = "The user ID",required=true) @PathVariable("custId") Integer custId);


    @ApiOperation(value = "", nickname = "customersCustIdPut", notes = "Modifies a customer", authorizations = {
        @Authorization(value = "basicAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK Customer Modified"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Error: Not Found") })
    @RequestMapping(value = "/customers/{custId}",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> customersCustIdPut(@ApiParam(value = "" ,required=true )  @Valid @RequestBody User body,@ApiParam(value = "The user ID",required=true) @PathVariable("custId") Integer custId);


    @ApiOperation(value = "", nickname = "customersGet", notes = "Obtains all the customers", response = User.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK Customers obtained", response = User.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Error: Not Found") })
    @RequestMapping(value = "/customers",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<User>> customersGet();


    @ApiOperation(value = "", nickname = "loginCustomer", notes = "Logs the customer into account", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Login Successful"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Error: Not Found") })
    @RequestMapping(value = "/customers/login",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> loginCustomer(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Login body);

}