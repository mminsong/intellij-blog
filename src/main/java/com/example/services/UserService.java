@Service
public class UserService(){
    @Autowired
    private UserRepository userRepository;

    @Transcational
    public void 회원가입(User user){
        userRepository.save(user);
    }
    @Transactional(readOnly=true)
    public User 로그인(User user){
        return userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());
    }
}