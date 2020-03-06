package com.task.Dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.task.model.Task;
@Component
@Transactional
public class TaskDaoImpl implements TaskDao {

	@Autowired

	
	public void createTask(Task task) {
		// TODO Auto-generated method stub
		
	}

	

	
	public void updateTask(int taskId, Task task) {
		// TODO Auto-generated method stub
		
	}

	public void deleteTask(int taskId) {
		// TODO Auto-generated method stub
		
	}

	public List<Task> searchTask(String taskName) {
		// TODO Auto-generated method stub
		return null;
	}



	public void assignTask(int taskId, int userId) {
		// TODO Auto-generated method stub
		
	}




	public List<Task> viewTask(int taskId) {
		// TODO Auto-generated method stub
		return null;
	}




	public List<Task> listAllTask() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	}

