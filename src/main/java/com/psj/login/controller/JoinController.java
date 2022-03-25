package com.psj.login.controller;

import com.psj.login.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * packageName    : com.psj.login.controller
 * fileName       : JoinController
 * author         : qkrtk
 * date           : 2022-03-26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-03-26        qkrtk       최초 생성
 */
@Controller //
@RequiredArgsConstructor //자동으로 생성자 생성
public class JoinController {

      @Autowired
      UserService userService;

      @GetMapping("/join-page")
      public String joinForm() {
            return "join";
      }

}
