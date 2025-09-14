package caioneves05.barber_cut_server.infraestructure.controller;

import caioneves05.barber_cut_server.application.services.UserService;
import caioneves05.barber_cut_server.infraestructure.dto.UserRequestDTO;
import caioneves05.barber_cut_server.infraestructure.dto.UserResponseDTO;
import org.springframework.web.bind.annotation.RestController;

@RestController("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    UserResponseDTO createUser(UserRequestDTO userRequestDTO) {
        return null;
    }
}
