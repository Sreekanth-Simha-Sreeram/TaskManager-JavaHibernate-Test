package com.task.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="task")
public class Task {
	
	@Id
	@Column(name="taskId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
int taskId;
	
	@Column(name="taskName")
String taskName;
	
	@Column(name="taskPriority")
int taskPriority;
	
	@Column(name="taskStartDAte")
Date taskStartDAte;
	
	@Column(name="taskEndDate")
Date taskEndDate;
	
	@Column(name="parenttaskId")
int parenttaskId;
public int getTaskId() {
	return taskId;
}
public void setTaskId(int taskId) {
	this.taskId = taskId;
}
public String getTaskName() {
	return taskName;
}
public void setTaskName(String taskName) {
	this.taskName = taskName;
}
public int getTaskPriority() {
	return taskPriority;
}
public void setTaskPriority(int taskPriority) {
	this.taskPriority = taskPriority;
}
public Date getTaskStartDAte() {
	return taskStartDAte;
}
public void setTaskStartDAte(Date taskStartDAte) {
	this.taskStartDAte = taskStartDAte;
}
public Date getTaskEndDate() {
	return taskEndDate;
}
public void setTaskEndDate(Date taskEndDate) {
	this.taskEndDate = taskEndDate;
}
public int getParenttaskId() {
	return parenttaskId;
}
public void setParenttaskId(int parenttaskId) {
	this.parenttaskId = parenttaskId;
}
}
