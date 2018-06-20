package org.hofi.api;

import io.swagger.annotations.ApiParam;
import org.hofi.model.ModelApiResponse;
import org.hofi.model.Pet;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@Controller
public class PetApiController implements PetApi {

  public PetApiController() {
  }

  public ResponseEntity<Void> addPet(@ApiParam(value = "Pet object that needs to be added to the store", required = true) @Valid @RequestBody Pet body) {

    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }

  public ResponseEntity<Void> deletePet(@ApiParam(value = "Pet id to delete", required = true) @PathVariable("petId") Long petId, @ApiParam(value = "") @RequestHeader(value = "api_key", required = false) String apiKey) {

    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }

  public ResponseEntity<List<Pet>> findPetsByStatus(@NotNull @ApiParam(value = "Status values that need to be considered for filter", required = true, allowableValues = "available, pending, sold") @Valid @RequestParam(value = "status", required = true) List<String> status) {

    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }

  public ResponseEntity<List<Pet>> findPetsByTags(@NotNull @ApiParam(value = "Tags to filter by", required = true) @Valid @RequestParam(value = "tags", required = true) List<String> tags) {

    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }

  public ResponseEntity<Pet> getPetById(@ApiParam(value = "ID of pet to return", required = true) @PathVariable("petId") Long petId) {

    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }

  public ResponseEntity<Void> updatePet(@ApiParam(value = "Pet object that needs to be added to the store", required = true) @Valid @RequestBody Pet body) {

    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }

  public ResponseEntity<Void> updatePetWithForm(@ApiParam(value = "ID of pet that needs to be updated", required = true) @PathVariable("petId") Long petId, @ApiParam(value = "Updated name of the pet") @RequestParam(value = "name", required = false) String name, @ApiParam(value = "Updated status of the pet") @RequestParam(value = "status", required = false) String status) {

    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }

  public ResponseEntity<ModelApiResponse> uploadFile(@ApiParam(value = "ID of pet to update", required = true) @PathVariable("petId") Long petId, @ApiParam(value = "Additional data to pass to server") @RequestParam(value = "additionalMetadata", required = false) String additionalMetadata, @ApiParam(value = "file detail") @Valid @RequestPart("file") MultipartFile file) {

    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }

}
