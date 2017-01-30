package io.swagger.api;

import io.swagger.model.PriceChanges;
import io.swagger.model.Error;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-01-30T04:04:06.830Z")

@Api(value = "all", description = "the all API")
public interface AllApi {

    @ApiOperation(value = "Get All Weekly Price Change Data", notes = "This api get data froma third party fantasy football website an xposed it as a get request ", response = PriceChanges.class, responseContainer = "List", tags={ "Fanatsy", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An array of price change objects", response = PriceChanges.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = PriceChanges.class) })
    @RequestMapping(value = "/all",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<PriceChanges>> allGet();

}
