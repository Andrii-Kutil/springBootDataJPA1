package com.gmail.kutilandrej.springbootjpa.service;


import com.gmail.kutilandrej.springbootjpa.entity.Human;
import java.util.List;

public interface HumanService {
  List<Human> getAllHumans();
  void saveHuman(Human human);
  Human getHuman(int id);
  void deleteHuman(int id);
  List<Human> findAllBySalaryAfter(long salary);
}
