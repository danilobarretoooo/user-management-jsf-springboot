package danilobarreto.dev.testejava.bean;

import danilobarreto.dev.testejava.model.User;
import danilobarreto.dev.testejava.repository.UserRepository;
import jakarta.annotation.ManagedBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.annotation.RequestScope;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import java.util.List;

@ManagedBean
@RequestScope
public class UserBean {

    @Autowired
    private UserRepository userRepository;

    private List<User> users;
    private User user = new User();

    public List<User> getUsers() {
        if (users == null) {
            users = userRepository.findAll();
        }
        return users;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void saveUser() {
        userRepository.save(user);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("User saved successfully"));
        user = new User();
        users = userRepository.findAll();
    }

    public void deleteUser(User user) {
        userRepository.delete(user);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("User deleted successfully"));
        users = userRepository.findAll();
    }

}
