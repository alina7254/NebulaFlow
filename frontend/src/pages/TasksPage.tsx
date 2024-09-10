import React, { useEffect, useState } from 'react';
import TaskList from '../components/TaskList';
import { getTasks } from '../services/taskService';

const TasksPage: React.FC = () => {
  const [tasks, setTasks] = useState([]);

  useEffect(() => {
    const fetchTasks = async () => {
      const tasks = await getTasks();
      setTasks(tasks);
    };
    fetchTasks();
  }, []);

  return (
    <div className="p-4">
      <h1 className="text-2xl font-semibold">Tasks</h1>
      <TaskList tasks={tasks} />
    </div>
  );
};

export default TasksPage;
