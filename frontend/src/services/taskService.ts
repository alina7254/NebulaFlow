import axios from 'axios';

const TASK_API_URL = 'http://localhost:8081/api/tasks';

export const getTasks = async () => {
  try {
    const response = await axios.get(TASK_API_URL);
    return response.data;
  } catch (error) {
    console.error('Error fetching tasks', error);
    throw error;
  }
};

export const createTask = async (taskData: { title: string; description: string }) => {
  try {
    const response = await axios.post(TASK_API_URL, taskData);
    return response.data;
  } catch (error) {
    console.error('Error creating task', error);
    throw error;
  }
};
