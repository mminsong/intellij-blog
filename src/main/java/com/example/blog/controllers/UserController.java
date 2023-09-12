@Controller
public class UserController{
    @GetMapping("/user/joinForm")
    public String joinForm(){
        return "user/joinForm"
    }
    @GetMapping("/user/loginForm")
    public String loginForm(){
        return "user/loginForm"
    }
}