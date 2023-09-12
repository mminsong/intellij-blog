public interface UserRepository extends JpaRepository <User, Integer>{
    User findByUsernameAndPassword(String username, String password);
}