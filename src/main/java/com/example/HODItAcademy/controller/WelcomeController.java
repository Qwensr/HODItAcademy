package com.example.HODItAcademy.controller;

import com.example.HODItAcademy.entity.User;
import com.example.HODItAcademy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/welcome")
public class WelcomeController {

    @Autowired
    private UserService userService;

    @GetMapping("/registration/welcome")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "registration";
    }

    @PostMapping("/registration")
    public String registerUser(@ModelAttribute User user, RedirectAttributes redirectAttributes) {
        userService.registerUser(user);
        redirectAttributes.addFlashAttribute("registeredUser", user);
        return "redirect:/users/login";
    }

    @GetMapping("/login")
    public String showLoginForm(Model model) {
        if (!model.containsAttribute("registrationSuccess")) {
            model.addAttribute("registrationSuccess", false);
        }
        model.addAttribute("user", new User());
        return "login";
    }

    @PostMapping("/login")
    public String loginUser(@ModelAttribute User user, RedirectAttributes redirectAttributes) {
        if (userService.authenticateUser(user.getUsername(), user.getPassword())) {
            redirectAttributes.addFlashAttribute("authenticatedUser", user);
            return "redirect:/users/welcome";
        } else {
            return "redirect:/users/login?error";
        }
    }

    @GetMapping("/welcome")
    public String showWelcomePage() {
        return "welcome";
    }

    @GetMapping("/home")
    public String home() {
        return "index";
    }
}