import React from 'react';
import Card from '../ui/Card';

interface Task {
  id: string;
  title: string;
  description: string;
}

interface TaskListProps {
  tasks: Task[];
}

const TaskList: React.FC<TaskListProps> = ({ tasks }) => (
  <div className="space-y-4">
    {tasks.map(task => (
      <Card key={task.id}>
        <h2 className="text-xl font-semibold">{task.title}</h2>
        <p>{task.description}</p>
      </Card>
    ))}
  </div>
);

export default TaskList;


 