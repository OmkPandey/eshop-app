package com.learning.service.interfaces;

import com.learning.model.dtos.request.UserRequestDTO;
import com.learning.model.dtos.response.GenericResponseDTO;
import com.learning.model.dtos.response.UserResponseDTO;

public interface UserService {

    GenericResponseDTO createUser(UserRequestDTO dto);

    UserResponseDTO getUserById(long id);
    GenericResponseDTO getUserByEmail(String email);
    GenericResponseDTO getAllUsers(int page, int size);

    UserResponseDTO updateUser(Long id, UserResponseDTO userResponseDTO);
    void deleteUser(Long id);

}
