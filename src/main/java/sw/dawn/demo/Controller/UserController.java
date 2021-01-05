package sw.dawn.demo.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import sw.dawn.demo.DVO.UserDVO;

@RestController
public class UserController {

    public UserDVO userdvo = new UserDVO();

    @GetMapping("/test")
    public String getHi(){
        userdvo.setId(3);
        userdvo.setUserId("ksh");
        userdvo.setPassword("hi");
        return userdvo.toString();

    }

    @PostMapping("/test/post")
    public String postHi(){
        return null;
    }

}
