package com.learning.service.impl;

import com.learning.model.dtos.request.UserRequestDTO;
import com.learning.model.dtos.response.GenericResponseDTO;
import com.learning.model.dtos.response.UserResponseDTO;
import com.learning.model.entities.User;
import com.learning.repository.UserRepository;
import com.learning.service.interfaces.UserService;
import com.learning.util.GlobalUtility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;


    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public GenericResponseDTO createUser(UserRequestDTO dto) {

        System.out.println("createUser method called with Email-> " + dto.getUserEmail());
        try {

            //This is standard way bt wont handle multiple solution..Modify or change this
            User user = userRepository.findByUserEmail(dto.getUserEmail())
                    .orElse(new User());

                user.setFirstName(dto.getFirstName());

                user.setLastName(dto.getLastName());

            if(GlobalUtility.isNotNullOrEmpty(dto.getPassword())) {
                user.setPassword(dto.getPassword());
            }
            if(GlobalUtility.isNotNullOrEmpty(dto.getUserRole())){
                user.setUserRole(dto.getUserRole().toUpperCase());
            }
            if(GlobalUtility.isNotNullOrEmpty(dto.getUserEmail())){
                user.setUserEmail(dto.getUserEmail());
            }
            if(GlobalUtility.isNotNullOrEmpty(dto.getPhoneNumber())){
                user.setPhoneNumber(dto.getPhoneNumber());
            }


            saveUser(user);

            return new GenericResponseDTO(HttpStatus.OK,
                    dto,
                    "User Created or Updated Successfully"
            );
        }catch (Exception e){
            System.out.println("Exception ->" + e.getMessage());
        }

        return new GenericResponseDTO(HttpStatus.BAD_REQUEST,
                dto,
                "Invalid Request Body. Please verify the request body."
        );

    }

    @Override
    public UserResponseDTO getUserById(long id) {
        return null;
    }

    @Override
    public GenericResponseDTO getUserByEmail(String email) {

        User user = userRepository.findByUserEmail(email).orElse(null);

        UserRequestDTO requestDTO = new UserRequestDTO(
                user.getFirstName(),
                user.getLastName(),
                user.getUserRole(),
                user.getUserEmail(),
                user.getPhoneNumber()
        );

        return new GenericResponseDTO(HttpStatus.OK, requestDTO, "User Details");
    }

    @Override
    public GenericResponseDTO getAllUsers(int page, int size) {
        try {
            Pageable pageable = PageRequest.of(page, size);
            Page<User> userPage = userRepository.findAll(pageable);
           // List<User> users = userRepository.findAll();
            List<UserRequestDTO> userRequestDTOS = new ArrayList<>();
            for (User user : userPage) {
                UserRequestDTO requestDTO = new UserRequestDTO(
                        user.getFirstName(),
                        user.getLastName(),
                        user.getUserRole(),
                        user.getUserEmail(),
                        user.getPhoneNumber()
                );
                userRequestDTOS.add(requestDTO);
            }
            return new GenericResponseDTO(HttpStatus.OK, userRequestDTOS, "details"); // Return the custom DTO with data, status, and message
        } catch (Exception ex) {
            ex.printStackTrace(); // // prints full exception stack trace to console
            return new GenericResponseDTO(HttpStatus.INTERNAL_SERVER_ERROR, null, "Error fetching Issue"); // Return a failure response so method always returns something
        }
    }

    @Override
    public UserResponseDTO updateUser(Long id, UserResponseDTO userResponseDTO) {
        return null;
    }

    @Override
    public void deleteUser(Long id) {

    }

    public void saveUser (User user){
        System.out.println("Saving User -> ");
        try{

            userRepository.save(user);

        }catch (Exception e){
            System.out.println("Exception while Saving ->" + e.getMessage());
        }

    }
}
