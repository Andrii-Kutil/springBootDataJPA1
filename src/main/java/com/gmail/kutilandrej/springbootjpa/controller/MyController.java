package com.gmail.kutilandrej.springbootjpa.controller;


import com.gmail.kutilandrej.springbootjpa.entity.Human;
import com.gmail.kutilandrej.springbootjpa.service.HumanService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

  @Autowired
  private HumanService humanService;

  @GetMapping("/employees")
  public List<Human> showAllHuman() {
    return humanService.getAllHumans();
  }

  @GetMapping("/employees/{id}")
  public Human getHuman(@PathVariable int id) {
    Human human = humanService.getHuman(id);

    return human;
  }

  @GetMapping("/employees/salary/{salary}")
  public List<Human> getallHumansSalaryAfter(@PathVariable long salary) {
    return humanService.findAllBySalaryAfter(salary);
  }

  @PostMapping("/employees")
  public Human addHuman(@RequestBody Human human) {
    humanService.saveHuman(human);
    System.out.println();
    return human;
  }

  @PutMapping("/employees")
  public Human updateHuman(@RequestBody Human human) {
    humanService.saveHuman(human);
    return human;
  }

  @DeleteMapping("/employees/{id}")
  public String updateHuman(@PathVariable int id) {

    humanService.deleteHuman(id);
    return "Done!";
  }
}
