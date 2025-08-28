package com.learning.controller;

import com.learning.model.dtos.request.UserRequestDTO;
import com.learning.model.dtos.response.GenericResponseDTO;
import com.learning.model.enums.UserRole;
import com.learning.service.impl.UserServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping("/api/users")
public class UserController{

    private final UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @PostMapping(value = "/createUser")
    public GenericResponseDTO createUser(@RequestBody UserRequestDTO dto){

        if ( Objects.equals(dto.getUserRole(), UserRole.SUPER_ADMIN.name()) ){
            System.out.println("Unauthorized User SUPER ADMIN cannot be created");
            return new GenericResponseDTO(
                            HttpStatus.BAD_REQUEST,
                            "Unable to create User Please check User Role");
        }

        System.out.println("Getting Users details here to add with request body ->" + dto);

        return userService.createUser(dto);
    }

    @GetMapping("user-detail/{email}")
    public ResponseEntity<GenericResponseDTO> getUserByEmail(@PathVariable("email") String email){
        if (email == null || email.isBlank() ){
            System.out.println("Email cannot be null or empty");
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        GenericResponseDTO user = userService.getUserByEmail(email);
        return new ResponseEntity<>(user, HttpStatus.OK);

    }
    @GetMapping("/all-users")
    public ResponseEntity<GenericResponseDTO> getAllUsers(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size) {

        GenericResponseDTO user = userService.getAllUsers(page, size);

        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    /*
    While creating new user Check for the role already in ENUM
    If the user is already existing in DB, Please update the relevant Details rather than creating the new user everytime.
    The above line should be changed in service class only .
    all db checks should be in service class
    Create ORM class if needed.
    While returning Response please check if the body is required or not and make sure not to send other than HTTPSTATUS.OK.
    password should be generated automatically while creating user , user will be login with the random generated password.
    change password option would come at a login time.

     */


    /*
    Create an API which will fetch the list of Users .
    Create a paginated query and take the page size and number of pages as 1 and 10.
    Also take the total number of pages.
    Currently in DATABASE there are 54K users, so the api is taking more than 11 minutes to fetch the data.
    Create a get api which will also handle the fetch time.
     */

    /*
    Create another api which will the fetch the single user
    Also the user's details should be fetched through user's email.
    And there should be a filter which will allow only CUSTOMER role to be fetched or ADMIN to be fetched.

    NOTE : Create a well versed API and also handle the corner cases as there are bunch of data in DB.

     */


}
