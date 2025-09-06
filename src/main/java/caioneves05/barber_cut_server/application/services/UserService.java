package caioneves05.barber_cut_server.application.services;

import caioneves05.barber_cut_server.domain.entity.User;
import caioneves05.barber_cut_server.domain.repository.UserRepository;

public class UserService {
    private final UserRepository userRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    User createUser(User user) {
        return userRepository.save(user);
    }
}
