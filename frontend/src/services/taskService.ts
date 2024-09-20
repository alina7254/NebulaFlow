import axios from 'axios';

const TASK_API_URL = 'http://task-service:8081/api/tasks';

export const getTask = async (id: string) => {
  try {
    const response = await axios.get(`${TASK_API_URL}/${id}`);
    return response.data;
  } catch (error) {
    console.error('Error fetching task', error);
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
