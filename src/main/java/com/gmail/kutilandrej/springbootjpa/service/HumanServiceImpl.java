package com.gmail.kutilandrej.springbootjpa.service;
import com.gmail.kutilandrej.springbootjpa.dao.HumanRepository;
import com.gmail.kutilandrej.springbootjpa.entity.Human;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class HumanServiceImpl implements HumanService {

  @Autowired
  private HumanRepository humanRepository;

  @Override
  @Transactional
  public List<Human> getAllHumans() {
    return humanRepository.findAll();
  }

  @Override
  @Transactional
  public void saveHuman(Human human) {
    humanRepository.save(human);
  }

  @Override
  @Transactional
  public Human getHuman(int id) {
    return humanRepository.findById(id).orElse(null);
  }

  @Override
  @Transactional
  public void deleteHuman(int id) {
    humanRepository.deleteById(id);
  }

  @Override
  public List<Human> findAllBySalaryAfter(long salary) {
    return humanRepository.findAllBySalaryAfter(salary);
  }
}
