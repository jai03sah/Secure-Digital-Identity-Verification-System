import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;

import com.jai.spring.boot.repository.UserRepository;

@Service
public class UserService{
    @Autowired
    private UserRepository userRepository;

    public String register(User user){
        user.setRole("USER");
        userRepository.save(user);
        return "User Registered";
    }

    public User login(String email, String password) {
        return userRepository.findByEmail(email);
    }

}