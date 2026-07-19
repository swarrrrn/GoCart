package com.swkmspringcart.GoCart.service.user;

import com.swkmspringcart.GoCart.dto.UserDto;
import com.swkmspringcart.GoCart.model.User;
import com.swkmspringcart.GoCart.request.CreateUserRequest;
import com.swkmspringcart.GoCart.request.UserUpdateRequest;

public interface IUserService {
    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UserUpdateRequest request, Long userId);
    void deleteUser(Long userId);

    UserDto convertUserToDto(User user);

    User getAuthenticatedUser();
}
