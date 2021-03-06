package io.swagger.api;

import io.swagger.model.PriceChanges;
import io.swagger.model.Error;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-01-30T04:04:06.830Z")

@Controller
public class AllApiController implements AllApi {

    public ResponseEntity<List<PriceChanges>> allGet() {
        // do some magic!
        return new ResponseEntity<List<PriceChanges>>(HttpStatus.OK);
    }

}
