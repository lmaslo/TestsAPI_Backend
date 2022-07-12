package restbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import restbackend.domain.LoginInfo;
import restbackend.domain.UserInfo;
import restbackend.exeption.InvalidUserNameExeption;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@RestController
public class BankController {

    private Map<String, UserInfo> users = Map.of(
            "Lena", UserInfo.builder().userName("Lena").build(),
            "Andy", UserInfo.builder().userName("Andy").build(),
            "Stesha", UserInfo.builder().userName("Stesha").build()
    );

    @PostMapping("user/login")
    public UserInfo doLogin(@RequestBody LoginInfo loginInfo) {

        if (loginInfo.getUserName().equals("Lena")) {
            return UserInfo.builder()
                    .loginDate(new Date())
                    .userName(loginInfo.getUserName())
                    .build();

        } else {
            throw new InvalidUserNameExeption();
        }

    }

    @GetMapping("user/getusers")
    public List<UserInfo> getAllUsersInfo() {
        return users.entrySet()
                .stream()
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());
    }


}
