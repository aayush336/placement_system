package dev.aayush.placement_system.service;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.aayush.placement_system.Dao.StudentDao;
import dev.aayush.placement_system.model.Student;
import jakarta.transaction.Transactional;

@Service
public class StudentServiceImpl implements StudentService {
	
	private StudentDao studentDao;
	
	@Transactional
	@Override
	public List<Student> get() {
		// TODO Auto-generated method stub
		return studentDao.get();
	}
	
	@Transactional
	@Override
	public Student get(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	@Override
	public void save(Student student) {
		// TODO Auto-generated method stub
		
	}
	@Transactional
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
