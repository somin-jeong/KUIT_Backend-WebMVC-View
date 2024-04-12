package core.db;

import jwp.model.User;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MemoryUserRepository {
    private Map<String, User> users = new HashMap<>();
    private static MemoryUserRepository memoryUserRepository;

    private MemoryUserRepository() {
        addUser(new User("jiyoon","jiyoon","지윤","jiyoon@kuit.com"));
        addUser(new User("jiyoon2","jiyoon2","지윤이","jiyoon2@kuit.com"));
        addUser(new User("admin","admin","어드민","admin@kuit.com"));
    }

    public static MemoryUserRepository getInstance() {
        if (memoryUserRepository == null) {
            memoryUserRepository = new MemoryUserRepository();
            return memoryUserRepository;
        }
        return memoryUserRepository;
    }

    public void addUser(User user) {
        users.put(user.getUserId(), user);
    }

    public User findUserById(String userId) {
        return users.get(userId);
    }

    public Collection<User> findAll() {
        return users.values();
    }

    public void changeUserInfo(User user) {
        if (users.get(user.getUserId()) != null) {
            users.put(user.getUserId(), user);
        }
    }
}
