package com.example.taskmanagement.service;

import com.example.taskmanagement.model.Task;
import com.example.taskmanagement.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public List<Task> getAllTasks() {
        // TODO: Implement method to return all tasks
        return null;
    }

    @Override
    public Task getTaskById(Long id) {
        // TODO: Implement method to return a task by its ID
        return null;
    }

    @Override
    public Task createTask(Task task) {
        // TODO: Implement method to create a new task
        return null;
    }

    @Override
    public Task updateTask(Long id, Task task) {
        // TODO: Implement method to update an existing task
        return null;
    }

    @Override
    public void deleteTask(Long id) {
        // TODO: Implement method to delete a task
    }
}
