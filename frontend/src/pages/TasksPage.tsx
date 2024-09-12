import React, { useEffect, useState } from 'react';
import TaskList from '../components/TaskList';
import { getTask } from '../services/taskService';

const TasksPage: React.FC = () => {
  const [tasks, setTasks] = useState([]);

  useEffect(() => {
    const fetchTasks = async () => {
      const tasks = await getTask ('1');
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
