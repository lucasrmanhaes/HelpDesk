package br.com.helpticket.controller;

import br.com.helpticket.dto.UserExibicaoDto;
import br.com.helpticket.model.User;
import br.com.helpticket.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public UserExibicaoDto save(@RequestBody User user){
        return userService.save(user);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public UserExibicaoDto find(@PathVariable("id") UUID id){
        return userService.find(id);
    }

}
