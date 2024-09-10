import axios from 'axios';

const USER_API_URL = 'http://localhost:8080/api/users';

export const getUser = async (id: string) => {
  try {
    const response = await axios.get(`${USER_API_URL}/${id}`);
    return response.data;
  } catch (error) {
    console.error('Error fetching user', error);
    throw error;
  }
};
