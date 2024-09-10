import axios from 'axios';

const NOTIFICATION_API_URL = 'http://localhost:8082/api/notifications';

export const getNotifications = async () => {
  try {
    const response = await axios.get(NOTIFICATION_API_URL);
    return response.data;
  } catch (error) {
    console.error('Error fetching notifications', error);
    throw error;
  }
};
