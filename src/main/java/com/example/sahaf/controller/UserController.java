package com.example.sahaf.controller;

import com.example.sahaf.entities.User;
import com.example.sahaf.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    @PostMapping("save")
    public User save(@RequestBody User user) {
        return userService.save(user);
    }
    @PutMapping("{id}")
    public User update(@RequestBody User user, @PathVariable int id){
        return userService.update(user,id);
    }
    @GetMapping("delete")
    public String delete(@RequestParam int id){
        return userService.delete(id);
    }
    @GetMapping("all")
    public List<User> getAll(){
        return userService.getAll();
    }

}
